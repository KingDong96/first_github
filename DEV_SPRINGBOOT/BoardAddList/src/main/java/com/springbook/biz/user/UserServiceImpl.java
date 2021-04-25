package com.springbook.biz.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbook.biz.user.UserService;
import com.springbook.biz.user.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAOMybatis userDAO;
	
	@Override//회원가입
	public void createUser(UserVO vo) {
		userDAO.createUser(vo);
	}

	@Override//회원정보수정
	public void updateUser(UserVO vo) {
		userDAO.updateUser(vo);
	}

	@Override//회원탈퇴
	public void deleteUser(UserVO vo) {
		userDAO.deleteUser(vo);
	}

	@Override
	public UserVO getUser(UserVO vo) {
		return userDAO.getUser(vo);
	}

	@Override
	public String getId(UserVO vo) {
		return userDAO.getId(vo);
	}

	@Override
	public String getPw(UserVO vo) {
		return userDAO.getPw(vo);
	}



	
}
