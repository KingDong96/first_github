package com.springbook.biz.user.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springbook.biz.user.UserVO;



@Repository
public class UserDAO {
	//JDBC ����
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	//SQL
	private final String USER_CREATE = "INSERT INTO USERS VALUES(?,?,?,?)";
	private final String USER_GET = "SELECT * FROM USERS WHERE ID=? AND PASSWORD=?";
	private final String UPDATE_PW = "UPDATE USERS SET PASSWORD=? WHERE ID=?";
	
	
	//���
	public void createUser(UserVO vo) {
		System.out.println("===> Spring JDBC�� createUser() ��� ó��");
		jdbcTemplate.update(USER_CREATE, vo.getId(),vo.getPassword(),vo.getName(),vo.getRole());
	}


	public UserVO getUser(UserVO vo) {
		System.out.println("===> Spring JDBC�� getUser() ��� ó��");
		Object[] args={vo.getId(),vo.getPassword()};
        return jdbcTemplate.queryForObject(USER_GET, args, new UserRowMapper());
    }

	public void changePassword(UserVO vo) {
		System.out.println("===> Spring JDBC�� changePassword() ��� ó��");
		jdbcTemplate.update(UPDATE_PW, vo.getPassword(), vo.getId());
		
		
	}
	
		
	
}