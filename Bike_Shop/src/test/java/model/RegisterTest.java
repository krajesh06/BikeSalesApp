package model;

import java.util.Scanner;

import validation.RegisterValidation;


public class RegisterTest {
	public static void main(String[] args) throws Exception
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter your Username");
		String userName = sc.next();
		System.out.println("Enter your Email");
		String usermail_id=sc.next();
		System.out.println("Enter your Mobile Number");
		String userMobileNumber = sc.next();
		System.out.println("Enter your Password");
		String userPassword = sc.next();
		Registration registration=new Registration();
		registration.setUserName(userName);
		registration.setUsermail_id(usermail_id);
		registration.setUserPassword(userPassword);
		registration.setUserMobileNumber(userMobileNumber);
		try
		{
		RegisterValidation.validatingRegistration(registration);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}

}
