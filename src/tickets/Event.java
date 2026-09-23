package tickets;

public class Event{
	
	private String name = "Cybersecurity Guest Lecture ";
	private String location = " Memorial Union";
	
	
	public Event(String name, String location) {
		this.name = name;
		this.location = location;
	}
	
	public String getName(){
		return name;
	}
	
	public String getlocation(){
		return location;
	}
	
	public String toString() {
		return "Event Profile -> Name: " + name + " | Location: " + location;
	}
} 


