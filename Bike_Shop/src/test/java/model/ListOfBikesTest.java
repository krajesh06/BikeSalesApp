package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import validation.SelectingOption;
public class ListOfBikesTest {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		items();
		items1();
	}
	public static void view() throws Exception {
		List<BikeItems> bike = new ArrayList<BikeItems>();
		bike = SelectingOption.showAll();
		show(bike);
	}
	public static void items() throws Exception {
		System.out.println("Enter the bikename:");
		String BikeName = sc.next();
		List<BikeItems> bikename = new ArrayList<BikeItems>();
		bikename = SelectingOption.BikeName(BikeName);
		categories(bikename);
	}
	public static void items1() throws Exception {
		System.out.println("Enter the Model:");
		String Model = sc.next();
		List<BikeItems> model = new ArrayList<BikeItems>();
		model = SelectingOption.Model(Model);
		categories1(model);	}
	public static void show(List<BikeItems> bike) {
		System.out.println("BikeName        Model        Color     Millage     Warranty    Year Price");
		for (BikeItems i : bike) {
			System.out.println(i.getBikename() + "\t\t" + i.getModel() + "\t\t" + i.getColor() + "\t\t"
					+ i.getMillage() + "\t" + i.getWarranty()+"\t"+i.getYear()+"\t"+i.getPrice());
		}
	}
	public static void categories(List<BikeItems> bikename) {
		for (BikeItems i : bikename) {
			System.out.println(i.getBikename() + "\t\t" + i.getModel() + "\t\t" + i.getColor() + "\t\t"
					+ i.getMillage() + "\t" + i.getWarranty()+"\t"+i.getYear()+"\t"+i.getPrice());
		}
	}
	public static void categories1(List<BikeItems> model) {
		for (BikeItems i : model) {
			System.out.println(i.getBikename() + "\t\t" + i.getModel() + "\t\t" + i.getColor() + "\t\t"
					+ i.getMillage() + "\t" + i.getWarranty()+"\t"+i.getYear()+"\t"+i.getPrice());
		}
	}
}