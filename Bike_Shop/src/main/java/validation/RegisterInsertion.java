package validation;

import java.sql.Connection;

import java.sql.PreparedStatement;

import Util.ConnectionUtil;
import model.Registration;


public class RegisterInsertion {
	@SuppressWarnings("unused")
	public static void insertUser(Registration registration ) throws Exception 
	{
		Connection connection ;
	    PreparedStatement statement;
	    connection = ConnectionUtil.databaseConnection();
		String query1="insert into Register(name,mail_id,password,mobilenumber)values(?,?,?,?)";
		statement = connection.prepareStatement(query1);
       
        statement.setString(1, registration.getUserName());
        statement.setString(2, registration.getUsermail_id());
        statement.setString(3, registration.getUserPassword());
        statement.setString(4, registration.getUserMobileNumber());
        
        int rows = statement.executeUpdate();
       // System.out.println("No of rows inserted:" + rows);
	
	}
}

