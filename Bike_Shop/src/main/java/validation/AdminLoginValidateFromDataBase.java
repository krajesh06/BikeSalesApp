package validation;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Util.ConnectionUtil;



public class AdminLoginValidateFromDataBase {
	public static int validateAdmin(int id, String mail_id, String password) throws Exception {

		Connection connection;
		PreparedStatement statement;
		ResultSet rs = null;

		connection = ConnectionUtil.databaseConnection();

		String query = "select  id,mail_id,password from  shop_admin where mail_id =? and  id =? and password =?";
		statement = connection.prepareStatement(query);

		statement.setString(1, mail_id);
		statement.setInt(2, id);
		statement.setString(3, password);
		

		rs = statement.executeQuery();

		int id1 = 0;
		

		while (rs.next()) {
			id1++;
			
		}
		
		return id1;
	}
}
