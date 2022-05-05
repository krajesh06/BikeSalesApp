package model;

import java.util.Scanner;


import validation.OrderValidation;

public class OrderTest {

	public static void main(String[] args) throws Exception
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter your name");
		String Name = sc.nextLine();
		System.out.println("Enter your phone number");
		String Phonenumber=sc.nextLine();
		System.out.println("Enter your Aadhar Number");
		String Aadharnumber = sc.nextLine();
		System.out.println("Enter your Payment_method");
		String Payment_method = sc.nextLine();
		System.out.println("Enter Bike name");
		String Bikename=sc.nextLine();
		System.out.println("Enter Bike color");
		String Color=sc.nextLine();
		System.out.println("Enter Bike model");
		String Model=sc.nextLine();
		
		
		Orders order=new Orders();
		order.setName(Name);
		order.setPhonenumber(Phonenumber);
		order.setAadharnumber(Aadharnumber);
		order.setPayment_method(Payment_method);
		order.setBikename(Bikename);
		order.setColor(Color);
		order.setModel(Model);
		
		try
		{
		OrderValidation.validatingOrders(order);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}


}
