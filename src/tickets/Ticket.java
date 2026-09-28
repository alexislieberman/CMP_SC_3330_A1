package tickets;

public class Ticket {
	private final int id;
    private final Event event;
    private final TicketType ticketType;
    private final String studentName;
    private boolean canceled;
    private boolean admitted;

   
    public Ticket(int id, Event event, TicketType ticketType, String studentName) {
    	if(id <=0 ) {
    		throw new IllegalArgumentException("id must be greater than 0.");
    	}
    	if (event == null) {
    	    throw new IllegalArgumentException("Event cannot be null.");
    	}
    	if (ticketType == null) {
    	    throw new IllegalArgumentException("Ticket type cannot be null.");
    	}
    	if (studentName == null || studentName.length()==0) {
    	    throw new IllegalArgumentException("Student name cannot be null or blank.");
    	}
        
        this.id = id;
        this.event = event;
        this.ticketType = ticketType;
        this.studentName = studentName;
        this.canceled = false; 
        this.admitted = false; 
    }

    public boolean cancel() {
        if (isCanceled()) {
    		System.out.println("\nERROR: Ticket already cancelled.");
            return false;
        }
        
        canceled = true;
        return canceled;
    }
    
    public boolean admit() {
        if (isAdmitted()) {
        	System.out.println("\nERROR: Ticket already admitted.");
            return false;
        }
        if (isCanceled()) {
        	System.out.println("\nERROR: Ticket cancelled. Cannot admit.");
            return false;
        }
        
        admitted = true;
        return admitted;
    }
    
    public boolean isCanceled() { 
    	return canceled; 
    }
    public boolean isAdmitted() { 
    	return admitted; 
    }
    public boolean isActive() { 
    	return !canceled && !admitted; 
    }
    
    
    public String getStatus() {
        if (canceled) 
        	return "CANCELED";
        if (admitted) 
        	return "ADMITTED";
        
        return "ACTIVE";
    }
 
    public int getId() { 
    	return id; 
    }
    public Event getEvent() { 
    	return event; 
    }
    public TicketType getTicketType() { 
    	return ticketType; 
    }
    public String getStudentName() { 
    	return studentName; 
    }
    
    public String toString() {
    	return String.format("Ticket #%d | %s | %s | %s | %s",
    	        id, studentName, event.getName(), ticketType.getName(), getStatus());
    }
   
}
