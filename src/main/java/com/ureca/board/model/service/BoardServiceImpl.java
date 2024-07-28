package com.ureca.board.model.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ureca.board.dto.Board;
import com.ureca.board.model.dao.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardDAO dao;
	
	@Override
	public int add(Board board) throws SQLException {
		return dao.insert(board);
	}

	@Override
	public int edit(Board board) throws SQLException {
		return dao.update(board);
	}

	@Override
	public int remove(int id) throws SQLException {
		return dao.delete(id);
	}

	@Override
	public Board read(int id) throws SQLException {
		return dao.select(id);
	}

	@Override
	public List<Board> readAll() throws SQLException {
		return dao.selectAll();
	}

	@Override
	public Board check(Board board) throws SQLException {
		return dao.identify(board);
	}

}
