package validation;

import model.Services;

public class ServiceValidation {

		public static void validatingService(Services service)throws Exception
		{
			int isNameValid=NameValidation(service.getName());
			int isPhonenumberValid=phonenumberValidation(service.getPhonenumber());
			int isQueriesValid=QueriesValidation(service.getQueries());
			int isComplaintsValid=ComplaintsValidation(service.getComplaints());
			
			if(isNameValid+isPhonenumberValid+isQueriesValid+isComplaintsValid==4)
			{
				System.out.println("Thank you for choosing us.");
				ServiceInsertion.insertService(service);
			    
			     
				
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
		public static int phonenumberValidation(String phonenumber) throws Exception
		{
			int result=0;
			char[] a=phonenumber.toCharArray();
			int count=0;
			if(a.length>10 || a.length<10)
			{
				throw new Exception("Mobile Number Must Be 10 Digits Long");
			}
			else
			{
				count++;
			}
			for(char i:a)
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
				result=ServiceValidationFromDatabase.phonenumberValidator(phonenumber);
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
		public static int QueriesValidation(String Queries)
		{
			return 1;
		}
		public static int ComplaintsValidation(String Complaitns)
		{
			return 1;
		}
		

}
