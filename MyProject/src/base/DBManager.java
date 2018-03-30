package base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {

	public static Connection getConnection() {

		Connection con = null;

		try {
			Class.forName("com.mysql.jdbc,Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bfm_db?useUnicode=true&characterEncoding=utf8", "root", "password");
			return con;
		} catch (ClassNotFoundException | SQLException e) {
			throw new IllegalMonitorStateException();
		}

	}

}
