package validation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Util.ConnectionUtil;

public class UserLoginValidationFromDatabase {

	public static int validateUser(String name, String mail_id, String password) throws Exception {

		Connection connection;
		PreparedStatement statement;
		ResultSet rs = null;

		connection = ConnectionUtil.databaseConnection();

		String query = "select  name,mail_id,password from  Register where name=? and  mail_id =? and password =?";
		statement = connection.prepareStatement(query);

		statement.setString(1, name);
		statement.setString(2, mail_id);
		statement.setString(3, password);
		

		rs = statement.executeQuery();

		int id1 = 0;
		

		while (rs.next()) {
			id1++;
			
		}
		
		return id1;
	}
}
