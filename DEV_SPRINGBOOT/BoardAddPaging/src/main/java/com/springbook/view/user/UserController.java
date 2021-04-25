package com.springbook.view.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.UserServiceImpl;

@Controller
public class UserController {
	
	@Autowired
	private UserServiceImpl userservice;

	@RequestMapping("/createUser.do")
	public String Createuser(UserVO vo) {
		userservice.createUser(vo);
		return "index.jsp";
	}
	@RequestMapping("/login.do")
	public String getUser(UserVO vo, HttpSession session) {
		
			
			UserVO user = userservice.getUser(vo);
			session.setAttribute("user", user);
			
			if(user != null) {
				return "index.jsp";
			}else {
			return "login.jsp";
			}
	}
	@RequestMapping("/logout.do")
	public String logout(HttpSession session) {
		
		session.invalidate();
		return "index.jsp";
		
	}
	
	@RequestMapping("/deleteUser.do")
	public String deleteUser(UserVO vo,HttpSession session) {
		userservice.deleteUser(vo);
		session.invalidate();
		return "index.jsp";
	}
	
	@RequestMapping(value="/updateUser.do")
	public String updateUser(UserVO vo,HttpSession session) {
		userservice.updateUser(vo);
		session.setAttribute("user",vo);
		return "index.jsp";
	}
	@RequestMapping("/getPw.do")
	public String getPw(UserVO vo, HttpServletRequest req){ 
		String userPw = userservice.getPw(vo);
		req.setAttribute("userPw", userPw);
		
		if(userPw != null) {
			System.out.println(userPw);
			return "foundPw.jsp";
		}else {
			return "getPw.jsp";
		}
	}
	
	@RequestMapping("/getId.do")
	public String getId(UserVO vo, HttpServletRequest req){ 
		String userId = userservice.getId(vo);
		req.setAttribute("userId", userId);
		if(userId != null) {
			System.out.println(userId);
			return "foundId.jsp";
		}else {
			return "getId.jsp";
		}
	}
	

	
	

	
}
