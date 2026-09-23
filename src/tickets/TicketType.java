package tickets;

public class TicketType {
	
	private String name = "Student, General, VIP";
	private double price;
	
	public TicketType(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName(){
		return name;
	}
	
	public double getPrice(){
		return price;
	}
	
	public String toString() {
		return "Ticket Type -> Name: " + name + " | Price: $" + String.format("%.2f", price);
	}

}
	
	