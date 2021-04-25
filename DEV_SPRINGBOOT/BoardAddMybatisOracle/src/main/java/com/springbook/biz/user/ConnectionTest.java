package com.springbook.biz.user;


import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","boardthird","boardthird");//이놈이 문제, 대문자가 문제였음
		System.out.println("정상적으로 연결 되었습니다. ");
	}
}
