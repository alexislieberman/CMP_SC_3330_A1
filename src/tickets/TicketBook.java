package tickets;

public class TicketBook {
	private Ticket[] tickets;
	private int count;
	
	private TicketBook(Ticket[] tickets, int count) {
		this.tickets = new Ticket[5];
		this.count = 0;
	}
	
	private void createTicket(int id, Event event, TicketType type, String studentName) {
		if(this.count >= 5){
			throw new IllegalArgumentException("TicketBook is already full");
		}
		
		Ticket newTicket = new Ticket(id, event, type, studentName);
		this.tickets[this.count] = newTicket;
		this.count++;
	}
	
	private Ticket findById(int id) {
		for (int i = 0; i < this.count; i++) {
			if(this.tickets[i].getId() == id) {
				return this.tickets[i];
			}
		}
		
		return null;
	}
	
	private void printAll() {
		for (int i = 0; i < this.count; i++) {
			String toPrint = this.tickets[i].toString();
			System.out.println(toPrint);
		}
	}
	
	private void printForEvent(Event event) {
		for (int i = 0; i < this.count; i++) {
			if(this.tickets[i].getEvent() == event) {
				String toPrint = this.tickets[i].toString();
				System.out.println(toPrint);
			}
		}
	}
}
