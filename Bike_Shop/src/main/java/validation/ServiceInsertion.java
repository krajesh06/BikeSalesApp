package validation;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Util.ConnectionUtil;
import model.Services;

public class ServiceInsertion {

	public static void insertService(Services service ) throws Exception 
	{
		Connection connection ;
	    PreparedStatement statement;
	    connection = ConnectionUtil.databaseConnection();
		String query1="insert into service(name,phonenumber,queries,complaints)values(?,?,?,?)";
		statement = connection.prepareStatement(query1);
       
        statement.setString(1, service.getName());
        statement.setString(2, service.getPhonenumber());
        statement.setString(3, service.getQueries());
        statement.setString(4, service.getComplaints());
        
        @SuppressWarnings("unused")
		int rows = statement.executeUpdate();
       // System.out.println("No of rows inserted:" + rows);
	
	}

	
}
