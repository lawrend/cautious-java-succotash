public enum Triangle {
	EQUILATERAL(3), ISOCELES(2), SCALENE(0);
	
	private int equalSides;
	
	private Triangle(int equalSides) {
		this.equalSides = equalSides;
	}
	
	public boolean hasEqualSides() {
		if(equalSides != 0) {
			return true;
		}
		else {
			return false;
		}
	}
}
