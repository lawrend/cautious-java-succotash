
public class BedroomProject extends HouseProject {

	public BedroomProject(String nickname, int estimatedCost, int actualCost) {
		super(nickname, estimatedCost, actualCost);
	}
	
	@Override
	public String toString() {
		return "Bedroom Project: \n" + super.toString();
	}
}
