package tickets;

public class TicketBook {
	private Ticket[] tickets;
	private int count;
	
	public TicketBook(int capacity) {
		if(capacity <= 0) {
			throw new IllegalArgumentException("Capacity must be >0");
		}
		
		this.tickets = new Ticket[capacity];
		this.count = 0;
	}
	
	public Ticket createTicket(int id, Event event, TicketType type, String studentName) {
		if(this.count >= this.tickets.length){
			throw new IllegalArgumentException("TicketBook is already full");
		}
		
		Ticket newTicket = new Ticket(id, event, type, studentName);
		this.tickets[this.count] = newTicket;
		this.count++;
		
		return newTicket;
	}
	
	public Ticket findById(int id) {
		for (int i = 0; i < this.count; i++) {
			if(this.tickets[i].getId() == id) {
				return this.tickets[i];
			}
		}
		
		return null;
	}
	
	public void printAll() {
		for (int i = 0; i < this.count; i++) {
			System.out.println(this.tickets[i].toString());
		}
	}
	
	public void printForEvent(Event event) {
		if(event==null) {
			return;
		}
		
		for (int i = 0; i < this.count; i++) {
			//checks equality by reference, not value
			if(this.tickets[i].getEvent() == event) { 
				System.out.println(this.tickets[i].toString());
			}
		}
	}
}
