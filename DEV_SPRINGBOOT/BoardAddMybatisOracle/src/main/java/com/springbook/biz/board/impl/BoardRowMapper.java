package com.springbook.biz.board.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springbook.biz.board.BoardVO;

public class BoardRowMapper implements RowMapper<BoardVO> {
	public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		BoardVO board = new BoardVO();
		board.setBoard_no(rs.getString("BOARD_NO"));
		board.setBoard_title(rs.getString("BOARD_TITLE"));
		board.setBoard_contents(rs.getString("BOARD_CONTENTS"));
		board.setBoard_date(rs.getDate("BOARD_DATE"));
		board.setUser_code(rs.getString("USER_CODE"));
		board.setBoard_hits(rs.getInt("BOARD_HITS"));
		board.setRating(rs.getInt("BOARD_RATING"));
		return board;
	}
}