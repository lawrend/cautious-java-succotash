package newAdvJavaMidterm;


public enum AnimalStatus {
	NEW (false),
	SHORT_TERM (true),
	LONG_TERM (false),
	FORMER_RESIDENT (false)
	;
	
	private final boolean isEligible;
	
	AnimalStatus(boolean isEligible) {
		this.isEligible = isEligible;
	}
	
	public boolean getAdoptionEligibility() {
		return this.isEligible;
	}

}