package validation;
import java.sql.ResultSet;

import Util.ConnectionUtil;
public class ListOfBikes {

	
	


	
		// For Classic
		public static void Classic() {
			try {
				System.out.println("The Available bikes in this model:  ");
				String model1="classic";
				String query = "select * from bikedetails where model='"+model1+"'";
				ResultSet details = ConnectionUtil.Show(query);
				while (details.next()) {
					String bikename = details.getString("bikename");
					String model = details.getString("model");
					String color = details.getString("color");
					int millage = details.getInt("millage");
					String warranty = details.getString("warranty");
					int year = details.getInt("year");
					int price = details.getInt("price");
					System.out.print("bikename : " + bikename+"  ");
					System.out.print("model :" + model+"  ");
					System.out.print("color: " + color+"  ");
					System.out.print("millage: " + millage+"  ");
					System.out.print("warranty: " + warranty+"  ");
					System.out.print("year: " + year+"  ");
					System.out.print("price :" + price+" ");
					System.out.println();
				}

			} catch (Exception e) {
				e.getMessage();
				e.printStackTrace();
			}
		}
		
		public static void interceptor() {
			try {
				System.out.println("The Available bikes in this model:  ");
				String model2="interceptor";
				String query = "select * from bikedetails where model='"+model2+"'";
				ResultSet details = ConnectionUtil.Show(query);
				while (details.next()) {
					String bikename = details.getString("bikename");
					String model = details.getString("model");
					String color = details.getString("color");
					int millage = details.getInt("millage");
					String warranty = details.getString("warranty");
					int year = details.getInt("year");
					int price = details.getInt("price");
					System.out.print("bikename : " + bikename+"  ");
					System.out.print("model :" + model+"  ");
					System.out.print("color: " + color+"  ");
					System.out.print("millage: " + millage+"  ");
					System.out.print("warranty: " + warranty+"  ");
					System.out.print("year: " + year+"  ");
					System.out.print("price :" + price+" ");
					System.out.println();
				}

			} catch (Exception e) {
				e.getMessage();
				e.printStackTrace();
			}
		}
		
		public static void continentalgt() {
			try {
				System.out.println("The Available bikes in this model:  ");
				String model3="continentalgt";
				String query = "select * from bikedetails where model='"+model3+"'";
				ResultSet details = ConnectionUtil.Show(query);
				while (details.next()) {
					String bikename = details.getString("bikename");
					String model = details.getString("model");
					String color = details.getString("color");
					int millage = details.getInt("millage");
					String warranty = details.getString("warranty");
					int year = details.getInt("year");
					int price = details.getInt("price");
					System.out.print("bikename : " + bikename+"  ");
					System.out.print("model :" + model+"  ");
					System.out.print("color: " + color+"  ");
					System.out.print("millage: " + millage+"  ");
					System.out.print("warranty: " + warranty+"  ");
					System.out.print("year: " + year+"  ");
					System.out.print("price :" + price+" ");
					System.out.println();
				}

			} catch (Exception e) {
				e.getMessage();
				e.printStackTrace();
			}
		}
		
		public static void himalayan() {
			try {
				System.out.println("The Available bikes in this model:  ");
				String model4="himalayan";
				String query = "select * from bikedetails where model='"+model4+"'";
				ResultSet details = ConnectionUtil.Show(query);
				while (details.next()) {
					String bikename = details.getString("bikename");
					String model = details.getString("model");
					String color = details.getString("color");
					int millage = details.getInt("millage");
					String warranty = details.getString("warranty");
					int year = details.getInt("year");
					int price = details.getInt("price");
					System.out.print("bikename : " + bikename+"  ");
					System.out.print("model :" + model+"  ");
					System.out.print("color: " + color+"  ");
					System.out.print("millage: " + millage+"  ");
					System.out.print("warranty: " + warranty+"  ");
					System.out.print("year: " + year+"  ");
					System.out.print("price :" + price+" ");
					System.out.println();
				}

			} catch (Exception e) {
				e.getMessage();
				e.printStackTrace();
			}
		}
		
		public static void scram() {
			try {
				System.out.println("The Available bikes in this model:  ");
				String model5="scram";
				String query = "select * from bikedetails where model='"+model5+"'";
				ResultSet details = ConnectionUtil.Show(query);
				while (details.next()) {
					String bikename = details.getString("bikename");
					String model = details.getString("model");
					String color = details.getString("color");
					int millage = details.getInt("millage");
					String warranty = details.getString("warranty");
					int year = details.getInt("year");
					int price = details.getInt("price");
					System.out.print("bikename : " + bikename+"  ");
					System.out.print("model :" + model+"  ");
					System.out.print("color: " + color+"  ");
					System.out.print("millage: " + millage+"  ");
					System.out.print("warranty: " + warranty+"  ");
					System.out.print("year: " + year+"  ");
					System.out.print("price :" + price+" ");
					System.out.println();
				}

			} catch (Exception e) {
				e.getMessage();
				e.printStackTrace();
			}
		}

	}


