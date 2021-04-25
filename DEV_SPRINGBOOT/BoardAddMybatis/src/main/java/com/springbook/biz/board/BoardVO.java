package com.springbook.biz.board;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter 
public class BoardVO {
	private String board_no;
	private String board_title;
	private String board_contents;
	private Date board_date;
	private String user_code;
	private int board_hits;
	private int rating;
	private String searchCondition;
	private String searchKeyword;
	
	
	@Override
	public String toString() {
		return "BoardVO [board_no=" + board_no + ", board_title=" + board_title + ", user_code=" + user_code
				+ ", board_contents=" + board_contents + ", board_date=" + board_date + ", board_hits=" + board_hits
				+ ", rating=" + rating + ", searchCondition=" + searchCondition + ", searchKeyword=" + searchKeyword
				+ "]";
	}



}