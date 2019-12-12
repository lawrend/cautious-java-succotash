
public class HouseBoat extends Home {
	private String name;
	
	public HouseBoat(int numBeds, double numBaths, boolean forSale, String name) {
		super(numBeds, numBaths, forSale);
		this.name = name;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nName:\t\t\t" + name;
	}

}
