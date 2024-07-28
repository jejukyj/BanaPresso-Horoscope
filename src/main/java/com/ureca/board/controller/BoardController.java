package com.ureca.board.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ureca.board.dto.Board;
import com.ureca.board.model.service.BoardService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/board")
public class BoardController {
	//@Autowired :
	//스프링에서 의존성을 자동으로 주입할 때 사용하는 어노테이션
	//스프링 컨테이너는 @Autowired 가 붙은 필드, 생성자, 세터 메서드 등에 
	//자동으로 관련 의존성(빈)을 주입
	@Autowired
	BoardService service;
	
	@GetMapping("/form")
	public String form() {
		return "form";
	}
	
	@PostMapping("/form")
	public String regist(Board board, Model model) {
	
		try {
			System.out.println("boardcontroller form: "+board);
			service.add(board);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "redirect:list";
	}
	
	@GetMapping("/list")
	public String list(Model model) { //DB목록출력 
		try {
			List<Board> list = service.readAll();
//			System.out.println("list>>>"+list);
			model.addAttribute("list", list);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "list";
	}
	
	@GetMapping("/password")
	public String pw(@RequestParam("id") int id, Model model) {
		try {
			model.addAttribute("board", service.read(id));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return "password";
	}
	
	@PostMapping("/password")
	public String pw(Board board, Model model, HttpServletRequest request) {
		
		Board userInfo;
		
		try {
			
			userInfo = service.check(board);
			
			if(userInfo == null) {
				model.addAttribute("check", false);
				return "password";
			} else {
				HttpSession session = request.getSession();
				session.setAttribute("board", userInfo);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return "redirect:upform";
	}
	
	@GetMapping("/upform") //localhost:8080/board/upform?no=3
	public String upform() { //수정폼 보이기
		return "upform";
	}
	
	@PostMapping("/upform")
	public String modify(Board board) {//DB수정 요청
		System.out.println("Test >>> " + board);
		try {
			service.edit(board);
//		session.invalidate();
//		session.setAttribute("board", userInfo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "redirect:list";//수정 결과를 list페이지로 확인
	}
	
	@GetMapping("/delete") //localhost:8080/board/delete?no=3
	public String remove(@RequestParam("id") int id) {
		try {
			service.remove(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "redirect:list"; //삭제 결과를 list페이지로 확인
	}
}
