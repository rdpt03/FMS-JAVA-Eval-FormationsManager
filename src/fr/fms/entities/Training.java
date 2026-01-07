package fr.fms.entities;

public class Training {
	private int id;
	private String name;
	private String summary;
	private boolean isInPerson;
	private boolean isRemotely;
	private double price;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	
	
	public boolean isInPerson() {
		return isInPerson;
	}
	public void setInPerson(boolean isInPerson) {
		this.isInPerson = isInPerson;
	}
	
	
	public boolean isRemotely() {
		return isRemotely;
	}
	public void setRemotely(boolean isRemotely) {
		this.isRemotely = isRemotely;
	}
	
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		//if the price is negative put it free
		if(price < 0) {
			price = 0;
		}
	}
	
	
	
}
