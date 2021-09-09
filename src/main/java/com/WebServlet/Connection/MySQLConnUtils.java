package com.WebServlet.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;


import java.sql.Connection;

public class MySQLConnUtils {
	public static Connection getMySQLConnection() throws ClassNotFoundException, SQLException {
		// Chú ý: Thay đổi các thông số kết nối cho phù hợp.
		String hostName = "localhost";
		String dbName = "shopgiay";
		String userName = "root";
		String password = "123456";
		return getMySQLConnection(hostName, dbName, userName, password);
	}

	public static Connection getMySQLConnection(String hostName, String dbName, String userName, String password)
			throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");

		// Cấu trúc URL Connection đối với MySQL:
		// Ví dụ:
		// jdbc:mysql://localhost:3306/simplehr
		String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
		Connection conn = (Connection) DriverManager.getConnection(connectionURL, userName, password);
		return conn;
	}

}
