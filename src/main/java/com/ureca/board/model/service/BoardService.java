package com.ureca.board.model.service;

import java.sql.SQLException;
import java.util.List;

import com.ureca.board.dto.Board;

public interface BoardService {
	//명세 => Board 추가/수정/삭제/조회/모두조회
	
	public int add(Board board) throws SQLException;
	public int edit(Board board) throws SQLException;
	public int remove(int id) throws SQLException;
	
	public Board read(int id) throws SQLException;
	public List<Board> readAll() throws SQLException;
	
	public Board check(Board board) throws SQLException;
}
