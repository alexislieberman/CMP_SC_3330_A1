package tickets;

public class Ticket {
	private final int id;
    private final Event event;
    private final TicketType ticketType;
    private final String studentName;
    private boolean canceled;
    private boolean admitted;

   
    public Ticket(int id, Event event, TicketType ticketType, String studentName) {
    	if (event == null) {
    	    throw new IllegalArgumentException("Event cannot be null.");
    	}
    	if (ticketType == null) {
    	    throw new IllegalArgumentException("Ticket type cannot be null.");
    	}
        
        this.id = id;
        this.event = event;
        this.ticketType = ticketType;
        this.studentName = studentName;
        this.canceled = false; 
        this.admitted = false; 
    }

    public boolean cancel() {
        if (!isActive()) {
            return false;
        }
        canceled = true;
        return true;
    }
    
    public boolean admit() {
        if (!isActive()) {
            return false;
        }
        admitted = true;
        return true;
    }
    
    public boolean isCanceled() { return canceled; }
    public boolean isAdmitted() { return admitted; }
    public boolean isActive() { return !canceled && !admitted; }
    
    public String getStatus() {
        if (canceled) return "CANCELED";
        if (admitted) return "ADMITTED";
        return "ACTIVE";
    }
 
    public int getId() { return id; }
    public Event getEvent() { return event; }
    public TicketType getTicketType() { return ticketType; }
    public String getStudentName() { return studentName; }
    
    public String toString() {
    	return String.format("Ticket #%d | %s | %s | %s | %s",
    	        id, studentName, event.getName(), ticketType.getName(), getStatus());
    }
   
}
