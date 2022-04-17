package validation;


import java.util.Scanner;


public class SelectingOption {
	
	static Scanner sc = new Scanner(System.in);

	public static void View() {
		System.out.println("Enter 1 for Classic ");
		System.out.println("Enter 2 for interceptor");
		System.out.println("Enter 3 for continentalgt");
		System.out.println("Enter 4 for Himalayan");
		System.out.println("Enter 5 for Scram");
		 System.out.println("Choose the number: ");
		
		
		   int r=sc.nextInt();
		   while (r>=5 || r<=0) {
			  
		   r=sc.nextInt();
		   }		   

		// System.out.println(r);
		   switch(r) {
		   case 0:
			System.out.println("No model found");
		    break;
		   case 1: 
			ListOfBikes.Classic();
		break;
		   case 2: 
			 ListOfBikes.interceptor();
		break;
		   case 3:
			ListOfBikes.continentalgt();
		break;
		   case 4:
			ListOfBikes.himalayan();
		break;
		   case 5:
			ListOfBikes.scram();
		break;
	}

	}
}

