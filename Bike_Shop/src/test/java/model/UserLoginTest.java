package model;

import java.util.Scanner;
import validation.UserLoginValidationFromDatabase;

public class UserLoginTest {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter a name:");
		String name = sc.next();

		System.out.println("Enter a mail id:");
		String mail_id = sc.next();

		System.out.println("Enter a password:");
		String password = sc.next();

		try {
			int logincheck = UserLoginValidationFromDatabase.validateUser(name, mail_id, password);
			if(logincheck==1){
				System.out.println("success");
				ListOfBikesTest.view();
				ListOfBikesTest.items();
				ListOfBikesTest.items1();
			}else {
				throw new Exception("Enter a valid credentials");
			}

		} catch (Exception e) {

			System.out.println("error:" + e.getMessage());

		}

	}
}