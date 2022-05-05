package Admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Util.ConnectionUtil;
import model.Registration;

public class ListOfUsers {

	public static List<Registration> showAll() throws SQLException, ClassNotFoundException {
		List<Registration> reg = new ArrayList<Registration>();
		String sql = "select * from Register";
		Connection connection;
		PreparedStatement statement;
		connection = ConnectionUtil.databaseConnection();
		statement = connection.prepareStatement(sql);
		// 3.execute query
		ResultSet rs = statement.executeQuery(sql);
		while (rs.next()) {
			String username = rs.getString("name");
			String usermail_id = rs.getString("mail_id");
			String usermobilenumber = rs.getString("mobilenumber");
						// create object s
			Registration r = new Registration();
			r.setUserName(username);
			r.setUsermail_id(usermail_id);
			r.setUserMobileNumber(usermobilenumber);
			reg.add(r);
		}
		return reg;
}
	public static List<Registration> Username (String username) throws SQLException, ClassNotFoundException {
		List<Registration> Usernames = new ArrayList<Registration>();
		Connection connection;
		PreparedStatement statement;
		connection = ConnectionUtil.databaseConnection();
		String sql = "SELECT name,mail_id,mobilenumber FROM Register WHERE name=?";
		statement = connection.prepareStatement(sql);
		statement.setString(1, username);
		// 3.execute query
		ResultSet rs1 = statement.executeQuery();
		// iterate rows
		while (rs1.next()) {
				@SuppressWarnings("unused")
				String username1 = rs1.getString("username");
				String usermail_id = rs1.getString("usermail_id");
				String usermobilenumber = rs1.getString("usermobilenumber");
							// create object s
				Registration r1 = new Registration();
				r1.setUserName(username);
				r1.setUsermail_id(usermail_id);
				r1.setUserMobileNumber(usermobilenumber);
			
				Usernames.add(r1);
			}
			return Usernames;
		}
	
	public static List<Registration> Mobilenumber(String mobilenumber) throws SQLException, ClassNotFoundException {
		List<Registration> Mobilenumber = new ArrayList<Registration>();
		Connection connection;
		PreparedStatement statement;
		connection = ConnectionUtil.databaseConnection();
		String sql = "SELECT name,mail_id,mobilenumber FROM Register WHERE mobilenumber=?";
		statement = connection.prepareStatement(sql);
		statement.setString(1, mobilenumber);
		// 3.execute query
		ResultSet rs1 = statement.executeQuery();
		// iterate rows
		while (rs1.next()) {
			
				String username = rs1.getString("username");
				String usermail_id = rs1.getString("usermail_id");
				@SuppressWarnings("unused")
				String mobilenumber1 = rs1.getString("usermobilenumber");
							// create object s
				Registration r1 = new Registration();
				r1.setUserName(username);
				r1.setUsermail_id(usermail_id);
				r1.setUserMobileNumber(mobilenumber);
			
				Mobilenumber.add(r1);
			}
			return Mobilenumber;
		}
	
	
	
	
} 