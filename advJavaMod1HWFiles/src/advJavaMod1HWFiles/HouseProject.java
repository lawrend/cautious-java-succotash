import java.util.*;

public class HouseProject implements Comparable<HouseProject>{
	private String nickname;
	private int estimatedCost, actualCost;
	private boolean isFundingSecured;
	private static double availableFunds; //M2 HOMEWORK STATIC
	private RequestService serviceRequest;  //M3 HOMEWORK STRATEGY
	
	public HouseProject(String nickname, int estimatedCost, int actualCost) {
		this.nickname = nickname;
		this.estimatedCost = estimatedCost;
		this.actualCost = actualCost;
		this.isFundingSecured = false;
	}
	
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public int getEstimatedCost() {
		return estimatedCost;
	}
	public void setEstimatedCost(int estimatedCost) {
		this.estimatedCost = estimatedCost;
	}
	
	
	public int getActualCost() {
		return actualCost;
	}
	public void setActualCost(int actualCost) {
		this.actualCost = actualCost;
	}
	
	public void flipFundingStatus() {
		this.isFundingSecured = !this.isFundingSecured;
	}
	
	public boolean getFundingStatus() {
		return isFundingSecured;
	}
	
	public void addToEstimatedCost(int expense) {
		this.estimatedCost = estimatedCost + expense;
		System.out.println("$" + expense + " has been added to the " + nickname + " project's estimated cost.");
	}
	
	public void subtractFromEstimatedCost(int reduction) {
		this.estimatedCost = estimatedCost - reduction;
		System.out.println("$" + reduction + " has been subtracted from the " + nickname + " project's estimated cost.");
	}
	
	public void addToActualCost(int expense) {
		this.actualCost = actualCost + expense;
		System.out.println("$" + expense + " has been added to the " + nickname + " project's actual cost.");
	}
	
	public void subtractFromActualCost(int reduction) {
		this.actualCost = actualCost - reduction;
		System.out.println("$" + reduction + " has been subtracted from the " + nickname + " project's actual cost.");
	}
	
	//M2 HOMEWORK STATIC
	public static double getAvailableFunds() {
		return availableFunds;
	}
	
	
	//M3 HOMEWORK STRATEGY
	//my god i am so confused
	public String executeServiceRequest(String projNickname, int extraCost) {
		return this.serviceRequest.pickService(projNickname, extraCost);
	}
	
	
	@Override 
	public String toString() {
		return "Nickname: " + nickname + "\nEstimated Cost: $" + estimatedCost + "\n";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof HouseProject) {
			HouseProject otherHouseProject = (HouseProject) obj;
			return this.nickname.equalsIgnoreCase(otherHouseProject.nickname) &&
					this.estimatedCost == otherHouseProject.estimatedCost;
		} else {
			return false;
		}
	}
	
	@Override
	public int compareTo(HouseProject hp) {
		return Integer.compare(this.estimatedCost, hp.estimatedCost);
	}
	

}
