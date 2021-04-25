package com.springbook.biz.user.impl;




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
		UserVO user = mybatis.selectOne("User.getUser", vo);
		return user;
    }
	
	
	public void createUser(UserVO vo) {
		mybatis.insert("User.createUser",vo);
	}


		
	
}