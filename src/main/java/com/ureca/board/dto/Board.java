package com.ureca.board.dto;

public class Board {
	private int id;
	private String boardContents;
	private String boardWriter;
	private String boardPass;
	private String createdAt;

	public Board() {
		
	}

	public Board(int id, String boardContents, String boardWriter, String boardPass, String createdAt) {
		super();
		this.id = id;
		this.boardContents = boardContents;
		this.boardWriter = boardWriter;
		this.boardPass = boardPass;
		this.createdAt = createdAt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBoardContents() {
		return boardContents;
	}

	public void setBoardContents(String boardContents) {
		this.boardContents = boardContents;
	}

	public String getBoardWriter() {
		return boardWriter;
	}

	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}

	public String getBoardPass() {
		return boardPass;
	}

	public void setBoardPass(String boardPass) {
		this.boardPass = boardPass;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "Board [id=" + id + ", boardContents=" + boardContents + ", boardWriter=" + boardWriter + ", boardPass="
				+ boardPass + ", createdAt=" + createdAt + "]";
	}
	 
	
}
