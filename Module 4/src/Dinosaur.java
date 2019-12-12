
public enum Dinosaur {
	APATOSAURUS(4), TREX(2), VELOCIRAPTOR(2);
	
	private int legsWalkedOn;
	
	private Dinosaur(int legsWalkedOn) {
		this.legsWalkedOn = legsWalkedOn;
	}
	
	public int getLegsWalkedOn() {
		return legsWalkedOn;
	}
	

}
