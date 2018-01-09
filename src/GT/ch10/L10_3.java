package GT.ch10;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class L10_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try(Connection connection = DbConnector.connectToDb();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("select * from contact")
				){
					System.out.println("ID \tfName \tlName \temail \t\tphoneNo");
					while(resultSet.next()){
						System.out.println(resultSet.getInt("id") + "\t"
								+ resultSet.getString("firstName") + "\t"
								+ resultSet.getString("lastname") + "\t"
								+ resultSet.getString("email") + "\t"
								+ resultSet.getString("phoneno"));
					}
				}catch(SQLException e){
					e.printStackTrace();
					System.exit(-1);
				}
	}

}
