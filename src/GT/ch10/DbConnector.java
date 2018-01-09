package GT.ch10;

import java.sql.*;

public class DbConnector {
	/**
	 * S G Ganesh and Tushar Sharma
	 * @param args
	 */
	public static Connection connectToDb() throws SQLException{
		String url = "jdbc:mysql://localhost:3306/";
		String database = "address_book";
		String userName = "root";
		String password = "root";
		return DriverManager.getConnection(url + database, userName, password);
	}
}
