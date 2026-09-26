package tickets;

public class TicketManager {
	private final TicketBook ticketBook;
	private int nextID = 1;
	
	public TicketManager(TicketBook ticketBook) {
		if(ticketBook==null) {
			throw new IllegalArgumentException("TicketBook cannot be null");
		}
		
		this.ticketBook = ticketBook;
	}
	
	
	public Ticket createTicket(Event event, TicketType type, String studentName) {
		Ticket newTicket = ticketBook.createTicket(this.nextID, event, type, studentName);
		this.nextID++;
		return newTicket;
	}
	
	public boolean cancelTicket(int id) {
		Ticket ticket = ticketBook.findById(id);
		
		if(ticket==null) {
			return false;
		}
		
		return ticket.cancel();
	}
	
	public boolean admitTicket(int id) {
		Ticket ticket = ticketBook.findById(id);
		
		if(ticket==null) {
			return false;
		}
		
		return ticket.admit();
	}
	
}
