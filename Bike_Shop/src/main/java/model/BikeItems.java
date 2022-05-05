package model;

public class BikeItems {
	
	private String bikename;
	private String model;
	private String color;
	private Integer millage;
	private String warranty;
	private Integer year;
	private Integer price;
	public String getBikename() {
		return bikename;
	}
	public void setBikename(String bikename) {
		this.bikename = bikename;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getMillage() {
		return millage;
	}
	public void setMillage(Integer millage) {
		this.millage = millage;
	}
	public String getWarranty() {
		return warranty;
	}
	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "BikeItems [bikename=" + bikename + ", model=" + model + ", color=" + color + ", millage=" + millage
				+ ", warranty=" + warranty + ", year=" + year + ", price=" + price + "]";
	}
	

}
