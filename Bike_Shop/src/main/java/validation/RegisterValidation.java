package validation;

import model.Registration;

public class RegisterValidation {
	public static void validatingRegistration(Registration registration)throws Exception
	{
		int isUserNameValid=userNameValidation(registration.getUserName());
		int isEmailValid=userEmailValidation(registration.getUsermail_id());
		int isPasswordValid=userPasswordValidation(registration.getUserPassword());
		int isMobileValid=userMobileNumberValidation(registration.getUserMobileNumber());
		
		if(isUserNameValid+isMobileValid+isEmailValid+isPasswordValid==4)
		{
			System.out.println("Order placed successfully");
	 	    System.out.println("It takes upto 3 months.We will reach you once the bike reach us");
	        System.out.println("Thank you for choosing us.");RegisterInsertion.insertUser(registration);
		    Registration.setSessionMail(registration.getUserName());
		    
		     
			
		}
		else
		{
			throw new Exception("Please Re-Enter Your Details");
		}
	}
	
	public static int userNameValidation(String userName)
	{
		return 1;
	}
	public static int userMobileNumberValidation(String mobileNumber) throws Exception
	{
		int result=0;
		char[] mobile=mobileNumber.toCharArray();
		int count=0;
		if(mobile.length>10 || mobile.length<10)
		{
			throw new Exception("Mobile Number Must Be 10 Digits Long");
		}
		else
		{
			count++;
		}
		for(char i:mobile)
		{
			if(Character.isAlphabetic(i))
			{
				throw new Exception("Enter only Numeric values");
			}
			else
			{
				count++;
			}
		}
		if(count==11)
		{
			result=RegisterValidationFromDatabase.mobileValidator(mobileNumber);
			if(result==1)
			{
				return 1;
				
			}
			
		}
		else
		{
			throw new Exception("Please Enter a Valid Mobile Number");
		}
		return result;
		
	}
	
	public static int userEmailValidation(String email)throws Exception
	{
		int result=0;
		if(email.contains("@"))
		{
		    result=RegisterValidationFromDatabase.emailValidator(email);
			if(result==1)
			{
				return 1;
			}
		}
		else
		{
			throw new Exception("Enter a valid Email address");

		}
		return result;
	}
	public static int userPasswordValidation(String password)throws Exception
	{
		if(password.length()<8)
		{
			throw new Exception("Password must be 8 characters long");
		}
		else
		{
			return 1;
		}
	}




}