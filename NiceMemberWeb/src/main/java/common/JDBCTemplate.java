package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTemplate {

	// 연결 싱글톤 적용
	private static Connection conn;
	private static final String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "MEMBERWEB";
	private static final String PASSWORD = "MEMBERWEB";

	private JDBCTemplate() {
	}

	public static Connection getConnection() {
		try {
			if (conn == null || conn.isClosed()) {
				Class.forName(DRIVER_NAME);
				conn = DriverManager.getConnection(URL, USER, PASSWORD);
				// 오토커밋 해제
				conn.setAutoCommit(false);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// 싱글톤이 적용된 연결 생성 완료
		return conn;
	}

	public static void commit(Connection conn) {
		try {
			if (conn != null && !conn.isClosed()) {
				conn.commit();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void rollback(Connection conn) {
		try {
			if (conn != null && !conn.isClosed()) {
				conn.rollback();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
