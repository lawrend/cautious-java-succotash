
public class BathroomProject extends HouseProject {
	
	public BathroomProject(String nickname, int estimatedCost, int actualCost) {
		super(nickname, estimatedCost, actualCost);
	}
	
	@Override
	public String toString() {
		return "Bathroom Project: \n" + super.toString() + Financing.BANK_LOAN.thanksForTheMoney() + "\n"; //M2 HOMEWORK ENUM USE
	}

}
