package validation;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Util.ConnectionUtil;
import model.Orders;

public class OrderInsertion {
	public static void insertOrder(Orders order ) throws Exception 
	{
		Connection connection ;
	    PreparedStatement statement;
	    connection = ConnectionUtil.databaseConnection();
		String query1="INSERT INTO orders(NAME,phonenumber,aadharnumber,payment_method,bikename,color,model)values(?,?,?,?,?,?,?)";
		statement = connection.prepareStatement(query1);
       
        statement.setString(1, order.getName());
        statement.setString(2, order.getPhonenumber());
        statement.setString(3, order.getAadharnumber());
        statement.setString(4, order.getPayment_method());
        statement.setString(5, order.getBikename());
        statement.setString(6, order.getColor());
        statement.setString(7, order.getModel());
        
        @SuppressWarnings("unused")
		int rows = statement.executeUpdate();
       // System.out.println("No of rows inserted:" + rows);
	
	}


}
