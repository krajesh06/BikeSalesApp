package Admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Util.ConnectionUtil;
import model.Orders;


public class ListOfOrders {

	public static List<Orders> showAll() throws SQLException, ClassNotFoundException {
		List<Orders> order = new ArrayList<Orders>();
		String sql = "select * from orders";
		Connection connection;
		PreparedStatement statement;
		connection = ConnectionUtil.databaseConnection();
		statement = connection.prepareStatement(sql);
		// 3.execute query
		ResultSet rs = statement.executeQuery(sql);
		while (rs.next()) {
			String name = rs.getString("name");
			String phonenumber = rs.getString("phonenumber");
			String aadharnumber = rs.getString("aadharnumber");
			String payment_method = rs.getString("payment_method");
			String bikename = rs.getString("bikename");
			String color = rs.getString("color");
			String model = rs.getString("model");
						// create object s
			Orders r = new Orders();
			r.setName(name);
			r.setPhonenumber(phonenumber);
			r.setAadharnumber(aadharnumber);
			r.setPayment_method(payment_method);
			r.setBikename(bikename);
			r.setColor(color);
			r.setModel(model);
			order.add(r);
		}
		return order;
}
}