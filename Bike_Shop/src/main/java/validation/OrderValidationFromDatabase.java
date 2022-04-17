package validation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Util.ConnectionUtil;

public class OrderValidationFromDatabase {

	public static int phonenumberValidator(String phonenumber) throws Exception
	{
		Connection connection ;
	    PreparedStatement statement;
	    ResultSet rs = null;
	    connection = ConnectionUtil.databaseConnection();
	    String query = "SELECT phonenumber FROM orders WHERE phonenumber=?";
	    statement = connection.prepareStatement(query);
        statement.setString(1, phonenumber);  
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

	
	public static int aadharnumberValidator(String aadharnumber) throws Exception
	{
		Connection connection ;
	    PreparedStatement statement;
	    ResultSet rs = null;
	    connection = ConnectionUtil.databaseConnection();
	    String query = "SELECT aadharnumber FROM orders WHERE aadharnumber=?";
	    statement = connection.prepareStatement(query);
        statement.setString(1, aadharnumber);  
        rs = statement.executeQuery();
        String a=null;
	    while(rs.next())
	    {
	        a=rs.getString("aadharnumber");
	    }
	    if(a!=null)
	    {
		   throw new Exception("You are already an existing User!!!!,Please Login");
	    }
	   else
	   {
		   return 1;
	   }
	}


}
