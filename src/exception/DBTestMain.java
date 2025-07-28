package exception;

import java.sql.Connection;
import java.sql.SQLException;

public class DBTestMain {

	public static void main(String[] args) {
		Connection conn = null;
		DBTest dbtest = new DBTest();
		try {
			conn = dbtest.conn();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}