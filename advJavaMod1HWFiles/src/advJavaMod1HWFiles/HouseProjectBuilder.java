
public class HouseProjectBuilder {
	private String nickname;
	private int estimatedCost, actualCost;
	
	public HouseProjectBuilder(String nickname, int estimatedCost, int actualCost) {
		this.nickname = nickname;
		this.estimatedCost = estimatedCost;
		this.actualCost = actualCost;
	}
	
	public HouseProjectBuilder setNickname(String nickname) {
		this.nickname = nickname; 
		return this;
	}
	
	public HouseProjectBuilder setEstimatedCost(int estimatedCost) {
		this.estimatedCost = estimatedCost;
		return this;
	}
	
	public HouseProjectBuilder setActualCost(int actualCost) {
		this.actualCost = actualCost;
		return this;
	}
	
	public HouseProject build() {
		return new HouseProject(nickname, estimatedCost, actualCost);
	}

}
