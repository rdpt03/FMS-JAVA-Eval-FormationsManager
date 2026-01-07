package fr.fms.entities;

public class Training {
	private int id;
	private String name;
	private String summary;
	private boolean isInPerson;
	private boolean isRemotely;
	private double price;
	
	
	//getters setters for id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	//getters setters for name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	//getters setters for summary
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	
	
	//getters setters for isInPerson
	public boolean isInPerson() {
		return isInPerson;
	}
	public void setInPerson(boolean isInPerson) {
		this.isInPerson = isInPerson;
	}
	
	
	//getters setters for isRemotely
	public boolean isRemotely() {
		return isRemotely;
	}
	public void setRemotely(boolean isRemotely) {
		this.isRemotely = isRemotely;
	}
	
	
	//getters setters for getPrice 
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		//if the price is negative put it free
		if(price < 0) {
			price = 0;
		}
		
		//round if put fore than 2 decimals and set
		this.price = (double) Math.round(price * 100) / 100;
	}
	
	
	
}
