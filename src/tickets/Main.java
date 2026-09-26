package tickets;

public class Main {
    public static void main(String[] args) {
        
        Event lecture = new Event("Cybersecurity Guest Lecture", "Memorial Union");
        Event meeting = new Event("Programming club", "Laffere Hall");
        
        System.out.println(lecture.toString());
        System.out.println(meeting.toString());

  
        TicketType student = new TicketType("Student", 5.00);
        TicketType general = new TicketType("General", 15.00);
        TicketType vip = new TicketType("VIP", 40.00);
        
        System.out.println();
        System.out.println(student.toString());
        System.out.println(general.toString());
        System.out.println(vip.toString());

        
        TicketBook TB = new TicketBook(5);
        TicketManager tickets = new TicketManager(TB);
        
        tickets.createTicket(meeting, vip, "Alice");
        tickets.createTicket(lecture, student, "Bob");
        tickets.createTicket(lecture, general, "Carla");
        tickets.createTicket(meeting, vip, "Joe");
        tickets.createTicket(meeting, general, "Tommy");
        
        tickets.cancelTicket(4);
        tickets.admitTicket(5);
        
        //invalid behavior
        tickets.admitTicket(4);

        TB.printAll();
        TB.printForEvent(meeting);
        
        
        
        /*
        System.out.println("--- New tickets ---");
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println();

        System.out.println("--- Testing rules ---");
        System.out.println("Admit t1: " + t1.admit());           
        System.out.println("Admit t1 again: " + t1.admit());     
        System.out.println("Cancel t1: " + t1.cancel());       

        System.out.println("Cancel t2: " + t2.cancel());         
        System.out.println("Cancel t2 again: " + t2.cancel());   
        System.out.println("Admit t2: " + t2.admit());       

        System.out.println("t3 active? " + t3.isActive());       
        System.out.println();

        System.out.println("--- Final status ---");
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println();

        
        System.out.println("--- Testing invalid tickets ---");
        try {
            new Ticket(0, lecture, student, "Dan");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }
        try {
            new Ticket(4, lecture, student, "   ");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }
        try {
            new Ticket(5, null, student, "Eve");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }
        */
    }
}

