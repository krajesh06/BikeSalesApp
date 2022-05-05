package validation;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Util.ConnectionUtil;
import model.BikeItems;


public class SelectingOption {

	

		public static List<BikeItems> showAll() throws SQLException, ClassNotFoundException {
			List<BikeItems> bike = new ArrayList<BikeItems>();
			String sql = "select * from bikedetails";
			Connection connection;
			PreparedStatement statement;
			connection = ConnectionUtil.databaseConnection();
			statement = connection.prepareStatement(sql);
			// 3.execute query
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				String bikename = rs.getString("bikename");
				String model = rs.getString("model");
				String color = rs.getString("color");
				Integer millage = rs.getInt("millage");
				String warranty = rs.getString("warranty");
				Integer Year= rs.getInt("year");
				Integer Price=rs.getInt("price");
				// create object s
				BikeItems b = new BikeItems();
				b.setBikename(bikename);
				b.setModel(model);
				b.setColor(color);
				b.setMillage(millage);
				b.setWarranty(warranty);
				b.setYear(Year);
				b.setPrice(Price);
				bike.add(b);
			}
			return bike;
		}
		public static List<BikeItems> BikeName(String bikename) throws SQLException, ClassNotFoundException {
			List<BikeItems> BikeName = new ArrayList<BikeItems>();
			Connection connection;
			PreparedStatement statement;
			connection = ConnectionUtil.databaseConnection();
			String sql = "SELECT bikename,model,color,millage,warranty,YEAR,price FROM bikedetails WHERE bikename=?";
			statement = connection.prepareStatement(sql);
			statement.setString(1, bikename);
			// 3.execute query
			ResultSet rs1 = statement.executeQuery();
			// iterate rows
			while (rs1.next()) {
					@SuppressWarnings("unused")
					String bikename1 = rs1.getString("bikename");
					String model = rs1.getString("model");
					String color = rs1.getString("color");
					Integer millage = rs1.getInt("millage");
					String warranty = rs1.getString("warranty");
					Integer Year= rs1.getInt("year");
					Integer Price=rs1.getInt("price");
					// create object s
					BikeItems b1 = new BikeItems();
					b1.setBikename(bikename);
					b1.setModel(model);
					b1.setColor(color);
					b1.setMillage(millage);
					b1.setWarranty(warranty);
					b1.setYear(Year);
					b1.setPrice(Price);
					BikeName.add(b1);
				}
				return BikeName;
			}
		public static List<BikeItems> Model(String model) throws SQLException, ClassNotFoundException {
			List<BikeItems> Model = new ArrayList<BikeItems>();
			Connection connection;
			PreparedStatement statement;
			connection = ConnectionUtil.databaseConnection();
			String sql = "SELECT bikename,model,color,millage,warranty,YEAR,price FROM bikedetails WHERE model=?";
			statement = connection.prepareStatement(sql);
			statement.setString(1, model);
			// 3.execute query
			ResultSet rs2 = statement.executeQuery();
			// iterate rows
			while (rs2.next()) {
					String bikename1 = rs2.getString("bikename");
					@SuppressWarnings("unused")
					String model1 = rs2.getString("model");
					String color = rs2.getString("color");
					Integer millage = rs2.getInt("millage");
					String warranty = rs2.getString("warranty");
					Integer Year= rs2.getInt("year");
					Integer Price=rs2.getInt("price");
					// create object s
					BikeItems b2 = new BikeItems();
					b2.setBikename(bikename1);
					b2.setModel(model);
					b2.setColor(color);
					b2.setMillage(millage);
					b2.setWarranty(warranty);
					b2.setYear(Year);
					b2.setPrice(Price);
					Model.add(b2);
				}
				return Model;
			}
	}

