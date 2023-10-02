package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	private static Connection conn;

	public static Connection getConn() throws ClassNotFoundException {
		try {
			if (conn == null) {
				Class.forName("oracle.jdbc.driver.OracleDriver");
                conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:system","system","singh");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return conn;
	}
}
