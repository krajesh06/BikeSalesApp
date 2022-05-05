package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Admin.ListOfUsers;


public class ListUsersTest {

	
		static Scanner sc = new Scanner(System.in);
		public static void main(String[] args) throws Exception {
			items();
			items1();
		}
		public static void view() throws Exception {
			List<Registration> reg = new ArrayList<Registration>();
			reg = ListOfUsers.showAll();
			show(reg);
		}
		public static void items() throws Exception {
			System.out.println("Enter the username:");
			@SuppressWarnings("unused")
			String Username1 = sc.next();
			List<Registration> username = null;
			username = ListOfUsers.Username(Username1);
			categories(username);
		}
		public static void items1() throws Exception {
			System.out.println("Enter the usermobilenumber:");
			String Mobilenumber = sc.next();
			List<Registration> mobilenumber = new ArrayList<Registration>();
			mobilenumber = ListOfUsers.Mobilenumber(Mobilenumber);
			categories1(mobilenumber);
		}
		public static void show(List<Registration> reg) {
			System.out.println("Username        mail_id        mobilenumber");
			for (Registration i : reg) {
				System.out.println(i.getUserName() + "\t\t" + i.getUsermail_id() + "\t\t" + i.getUserMobileNumber());
			}
		}
		public static void categories(List<Registration> username) {
			for (Registration i : username) {
				System.out.println(i.getUserName() + "\t\t" + i.getUsermail_id() + "\t\t" + i.getUserMobileNumber());
			}
		}
		public static void categories1(List<Registration> mobilenumber) {
			for (Registration i : mobilenumber) {
				System.out.println(i.getUserName() + "\t\t" + i.getUsermail_id() + "\t\t" + i.getUserMobileNumber());
			}
		}

}
