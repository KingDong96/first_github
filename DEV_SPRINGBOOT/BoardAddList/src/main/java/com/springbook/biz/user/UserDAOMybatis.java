package com.springbook.biz.user;




import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springbook.biz.user.UserVO;



@Repository("UserDAO")
public class UserDAOMybatis {
	@Autowired
	private SqlSessionTemplate mybatis;

	// 로그인
	public UserVO getUser(UserVO vo) {
		return mybatis.selectOne("User.getUser", vo);
    }
	// 비밀번호 찾기
	public String getPw(UserVO vo) {
		String userPw = mybatis.selectOne("User.getPw", vo);
		return userPw;
	}
	// 아이디 찾기
	public String getId(UserVO vo) {
		String userId = mybatis.selectOne("User.getId", vo);
		return userId;
	}
	//회원가입
	public void createUser(UserVO vo) {
		mybatis.insert("User.createUser",vo);
	}
	//정보수정
	public void updateUser(UserVO vo) {
		mybatis.update("User.updateUser",vo);
	}
	//회원탈퇴
	public void deleteUser(UserVO vo) {
		mybatis.delete("User.deleteUser",vo);
	}

		
	
}