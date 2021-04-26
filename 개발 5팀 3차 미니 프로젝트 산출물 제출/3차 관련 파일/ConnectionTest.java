package com.springbook.biz.user;


import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","boardThird","boardThird");
		System.out.println("정상적으로 연결 되었습니다. ");
	}
}
