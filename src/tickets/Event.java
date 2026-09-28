package tickets;

public class Event{
	
	private String name;
	private String location;
	
	
	public Event(String name, String location) {
		if(name==null || name.length()==0) {
			throw new IllegalArgumentException("Event name cannot be null or blank.");
		}
		if(location==null || location.length()==0) {
			throw new IllegalArgumentException("Event location cannot be null or blank.");
		}
		
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


