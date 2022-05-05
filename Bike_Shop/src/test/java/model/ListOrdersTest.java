package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Admin.ListOfOrders;


public class ListOrdersTest {

	static Scanner sc = new Scanner(System.in);
	public static void view() throws Exception {
		List<Orders> order = new ArrayList<Orders>();
		order = ListOfOrders.showAll();
		show(order);
	}
	public static void show(List<Orders> order) {
		System.out.println("Name        phonenumber        aadharnumber   payment_method  bikename  color        model");
		for (Orders i : order) {
			System.out.println(i.getName() + "\t\t" + i.getPhonenumber() + "\t\t" + i.getAadharnumber()+ "\t\t" + i.getPayment_method()+ "\t\t" + i.getBikename()+ "\t\t" + i.getColor()+ "\t\t" + i.getModel());
		}
	}
}
