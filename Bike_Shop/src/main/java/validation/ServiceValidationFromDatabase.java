package validation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Util.ConnectionUtil;

public class ServiceValidationFromDatabase {

	public static int phonenumberValidator(String phone) throws Exception
	{
		Connection connection ;
	    PreparedStatement statement;
	    ResultSet rs = null;
	    connection = ConnectionUtil.databaseConnection();
	    String query = "SELECT phonenumber FROM service WHERE phonenumber=?";
	    statement = connection.prepareStatement(query);
        statement.setString(1, phone);  
        rs = statement.executeQuery();
        String mob=null;
	    while(rs.next())
	    {
	        mob=rs.getString("phonenumber");
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
