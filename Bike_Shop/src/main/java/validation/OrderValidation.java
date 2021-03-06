package validation;

import model.Orders;

public class OrderValidation {
	
	public static void validatingOrders(Orders order)throws Exception
	{
		int isNameValid=NameValidation(order.getName());
		int isPhonenumberValid=PhonenumberValidation(order.getPhonenumber());
		int isAadharnumberValid=AadharnumberValidation(order.getAadharnumber());
		int isPayment_methodValid=Payment_methodValidation(order.getPayment_method());
		int isBikenameValid=BikenameValidation(order.getBikename());
		int isColorValid=ColorValidation(order.getColor());
		int isModelValid=ModelValidation(order.getModel());
		
		if(isNameValid+isPhonenumberValid+isAadharnumberValid+isPayment_methodValid+isBikenameValid+isColorValid+isModelValid==7)
		{
			System.out.println("Welcome");
			OrderInsertion.insertOrder(order);
		 }
		else
		{
			throw new Exception("Please Re-Enter Your Details");
		}
	}
	
	public static int NameValidation(String Name)
	{
		return 1;
	}
	public static int PhonenumberValidation(String phonenumber) throws Exception
	{
		
		char[] mobile=phonenumber.toCharArray();
	
		@SuppressWarnings("unused")
		int count=0;
		if(mobile.length>10 || mobile.length<10)
		{
			throw new Exception("Phone Number Must Be 10 Digits Long");
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
		return 1;
	
		
	}
	
	
	public static int AadharnumberValidation(String aadharnumber) throws Exception
	{
		
		char[] aadhar=aadharnumber.toCharArray();
		
		@SuppressWarnings("unused")
		int count=0;
		if(aadhar.length>12 || aadhar.length<12)
		{
			throw new Exception("Aadhar Number Must Be 12 Digits Long");
		}
		else
		{
			count++;
		}
		for(char i:aadhar)
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
		return 1;
		
		
		
	}
	
	public static int Payment_methodValidation(String Payment_method)
	{
		return 1;
	}
	
	public static int BikenameValidation(String Bikename)
	{
		return 1;
	}
	
	public static int ColorValidation(String Color)
	{
		return 1;
	}

	public static int ModelValidation(String Model)
	{
		return 1;
	}
}
