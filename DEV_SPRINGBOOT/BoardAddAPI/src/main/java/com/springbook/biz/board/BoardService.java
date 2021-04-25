package com.springbook.biz.board;

import java.util.List;



public interface BoardService {
	void insertBoard(BoardVO vo);

	void updateBoard(BoardVO vo);

	void deleteBoard(BoardVO vo);

	BoardVO getBoard(BoardVO vo);

	//List<BoardVO> getBoardList(BoardVO vo);
	List<BoardVO> getBoardList(Criteria cri) throws Exception;
	
	public int listCount() throws Exception;
	
}
