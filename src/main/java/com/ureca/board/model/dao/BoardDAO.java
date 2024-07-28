package com.ureca.board.model.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ureca.board.dto.Board;

//Mapper 인터페이스 : Mapping파일에 기재된 SQL을 호출하기 위한 인터페이스

@Mapper
public interface BoardDAO {
	public int insert(Board board) throws SQLException;
	public int update(Board board) throws SQLException;
	public int delete(int id)throws SQLException;
	public Board select(int id)throws SQLException; //특정 Board 한명 조회 => 수정폼/상세페이지
	public List<Board> selectAll()throws SQLException;//모든 Board 조회
	public Board identify(Board board) throws SQLException;
}
