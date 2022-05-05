package model;

import java.util.Scanner;

import validation.ServiceValidation;

public class ServicesTest {
	
	public static void main(String[] args) throws Exception
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter your name");
		String Name = sc.nextLine();
		System.out.println("Enter your phone number");
		String Phonenumber=sc.nextLine();
		System.out.println("Enter your Queries");
		String Queries = sc.nextLine();
		System.out.println("Enter your Complaints");
		String Complaints = sc.nextLine();
		Services service=new Services();
		service.setName(Name);
		service.setPhonenumber(Phonenumber);
		service.setQueries(Queries);
		service.setComplaints(Complaints);
		try
		{
		ServiceValidation.validatingService(service);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}



}
