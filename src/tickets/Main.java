package tickets;

public class Main {
    public static void main(String[] args) {
        
        Event lecture = new Event("Cybersecurity Guest Lecture", "Memorial Union");
        System.out.println(lecture);

  
        TicketType student = new TicketType("Student", 5.00);
        TicketType general = new TicketType("General", 15.00);
        TicketType vip = new TicketType("VIP", 40.00);
        System.out.println(student);
        System.out.println(general);
        System.out.println(vip);
        System.out.println();

        
        Ticket t1 = new Ticket(1, lecture, student, "Alice");
        Ticket t2 = new Ticket(2, lecture, general, "Bob");
        Ticket t3 = new Ticket(3, lecture, vip, "Carla");

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
    }
}

