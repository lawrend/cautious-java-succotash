package advJavaMod7;
import java.util.*;

public class EndangeredSpecies implements Comparable<EndangeredSpecies>{
	private String id, name, location, state, type;
	
	public EndangeredSpecies(String id, String name, String location, String state, String type) {
		this.id = id;
		this.name = name;
		this.location = location;
		this.state = state;
		this.type = type;
	}
	
	//id getter
	public String getId() {
		return id;
	}
	
	//name getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//location getter/setter
	public String getLocation() {
		return location;
	}	
	public void setLocation(String location) {
		this.location = location;
	}
	//state getter/setter
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
    //type getter/setter	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Name: " + name + "\nLocation: " + location + "\nType: " + type; 
	}
	
	@Override
	//sorts by id
	public int compareTo(EndangeredSpecies es) {
		return this.id.compareTo(es.id);
	}
	//public int compareTo(EndangeredSpecies es) {
	//	return Integer.compare(this.id, es.id);
	//}
	
	@Override
	//returns true for same species regardless of location
	public boolean equals(Object obj) {
		if(obj instanceof EndangeredSpecies) {
			EndangeredSpecies otherEndangeredSpecies = (EndangeredSpecies) obj;
			return this.name.equalsIgnoreCase(otherEndangeredSpecies.name) &&
					this.type == otherEndangeredSpecies.type;
		} else {
			return false;
		}
	}
}
