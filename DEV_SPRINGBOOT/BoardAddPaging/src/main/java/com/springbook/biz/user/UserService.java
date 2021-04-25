package com.springbook.biz.user;



public interface UserService {
	
	//회원가입
	void createUser(UserVO vo);
	//정보수정
	void updateUser(UserVO vo);
	//회원탈퇴
	void deleteUser(UserVO vo);
	//로그인
	UserVO getUser(UserVO vo);
	//아이디찾기
	String getId(UserVO vo);
	//비번찾기
	String getPw(UserVO vo);

}
