
public class OutdoorProject extends HouseProject {
	
	public OutdoorProject(String nickname, int estimatedCost, int actualCost) {
		super(nickname, estimatedCost, actualCost);
	}
	
	@Override
	public String toString() {
		return "Outdoor Project: \n" + super.toString();
	}

}
