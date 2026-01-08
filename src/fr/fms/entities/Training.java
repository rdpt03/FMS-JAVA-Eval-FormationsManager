package fr.fms.entities;

public class Training {
	private int id;
	private String name;
	private String summary;
	private int duration;
	private boolean isInPerson;
	private boolean isRemotely;
	private double price;


	public Training(){}


	public Training(int id, String name, String summary, int duration, boolean isInPerson, boolean isRemotely, double price) {
		this.id = id;
		this.name = name;
		this.summary = summary;
		this.duration = duration;
		this.isInPerson = isInPerson;
		this.isRemotely = isRemotely;
		this.price = price;
	}

	
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
	
	
	//getters setters for duration
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		if(duration < 1) {
			duration = 1;
		}
		this.duration = duration;
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


	@Override
	public String toString() {
		return "Training{" +
				"id=" + id +
				", name='" + name + '\'' +
				", summary='" + summary + '\'' +
				", duration=" + duration +
				", isInPerson=" + isInPerson +
				", isRemotely=" + isRemotely +
				", price=" + price +
				'}';
	}


	public String btShow() {
		//adapt format
		String format = "%-3s | %-15s | %-30s | %-10s | %-8s | %-15s | %-15s";

		//bools
		String inPerson = isInPerson ? "en presentiel" : "";
		String remotely = isRemotely ? "en distanciel" : "";

		//return
		return String.format(format,
				id,
				name,
				summary,
				duration + " jours",
				price + "€",
				inPerson,
				remotely);
	}
}
