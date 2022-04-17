package model;

import java.util.Scanner;

import validation.AdminLoginValidateFromDataBase;

public class AdminLoginTest {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter a id:");
		int id = sc.nextInt();

		System.out.println("Enter a mail id:");
		String mail_id = sc.next();

		System.out.println("Enter a password:");
		String password = sc.next();

		try {
			@SuppressWarnings("unused")
			int logincheck = AdminLoginValidateFromDataBase.validateAdmin(id, mail_id, password);
			if(logincheck==1){
				System.out.println("success");
			}else {
				throw new Exception("Enter a valid credentials");
			}

		} catch (Exception e) {

			System.out.println("error:" + e.getMessage());

		}

	}
}