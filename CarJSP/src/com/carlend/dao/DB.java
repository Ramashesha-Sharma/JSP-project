package com.carlend.dao;

import java.sql.*;

public class DB {
	public static Connection getCon() {
		Connection con = null;
		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");

			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspproject", "root", "MyNewPass");
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}
}
