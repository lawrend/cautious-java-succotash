
public class HouseProjectFactory {
	public static HouseProject getProject(String kind, String nickname, int estimatedCost, int actualCost) {
		if("Bathroom".equalsIgnoreCase(kind)) return new BathroomProject(nickname, estimatedCost, actualCost);
		else if("Bedroom".equalsIgnoreCase(kind)) return new BedroomProject(nickname, estimatedCost, actualCost);
		else if("Outdoor".equalsIgnoreCase(kind)) return new OutdoorProject(nickname, estimatedCost, actualCost);
		else return new HouseProject(nickname, estimatedCost, actualCost);
	}
}
