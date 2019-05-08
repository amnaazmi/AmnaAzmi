package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	
	static {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws SQLException {
		
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String username = System.getenv("reimbursement");
		String password = System.getenv("fullaccess");
		Connection connection = DriverManager.getConnection(url, username, password);
		return connection;
	}
}