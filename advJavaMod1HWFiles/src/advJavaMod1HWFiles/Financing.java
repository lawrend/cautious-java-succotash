
public enum Financing {
	CASH,
	CREDIT_CARD,
	BANK_LOAN,
	FAMILY_LOAN;
	
	private String whoPays;
	
	public String getWhoPays() {
		return this.whoPays;
	}
	
	public void setWhoPays(String name) {
		this.whoPays = name;
	}
	
	String thanksForTheMoney() {
		switch (this) {
		case CASH:
			return "Thanks to me!!";
		case CREDIT_CARD:
			return "Thanks credit card!";
		case BANK_LOAN:
			return "Thanks for the money, bank!";
		case FAMILY_LOAN:
			return "Thanks for the money, dear family member!!";
		default:
			return "I do not know who to thank for this money!";
		}
	}

}
