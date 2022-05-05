package validation;

import java.sql.Connection;



import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Util.ConnectionUtil;

public class RegisterValidationFromDatabase {
	

	public static int emailValidator(String email) throws Exception
	{
		Connection connection ;
	    PreparedStatement statement;
	    ResultSet rs = null;
	    connection = ConnectionUtil.databaseConnection();
		String query = "SELECT mail_id FROM Register WHERE mail_id=?";
		statement = connection.prepareStatement(query);
        statement.setString(1, email);  
        rs = statement.executeQuery();
        String mail=null;
		while(rs.next())
		{
		 mail=rs.getString("mail_id");
		}
		if(mail!=null)
		{
			throw new Exception("You are already an existing User!!!!,Please Login");
		}
		else
		{
			return 1;
		}
		
		
	}
	public static int mobileValidator(String mobile) throws Exception
	{
		Connection connection ;
	    PreparedStatement statement;
	    ResultSet rs = null;
	    connection = ConnectionUtil.databaseConnection();
	    String query = "SELECT mobilenumber FROM Register WHERE mobilenumber=?";
	    statement = connection.prepareStatement(query);
        statement.setString(1, mobile);  
        rs = statement.executeQuery();
        String mob=null;
	    while(rs.next())
	    {
	        mob=rs.getString("mobilenumber");
	    }
	    if(mob!=null)
	    {
		   throw new Exception("You are already an existing User!!!!,Please Login");
	    }
	   else
	   {
		   return 1;
	   }
	}
	
	


}