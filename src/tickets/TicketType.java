package tickets;

public class TicketType {
	
	private String name = "Student, General, VIP";
	private double price;
	
	public TicketType(String name, double price) {
		if(name==null || name.length()==0) {
			throw new IllegalArgumentException("Ticket Type cannot be null or blank.");
		}
		if(price<0) {
			throw new IllegalArgumentException("Price must be greater than or equal to 0");
		}
		
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
	
	