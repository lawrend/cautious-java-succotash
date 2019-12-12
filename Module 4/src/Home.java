import java.util.*;

public class Home {
	
	private int numberOfBedrooms;
	private double numberOfBathrooms;
	private boolean forSale;
	
	private static int numB = 0;
	private int numA = 0;
	
	private void methodA() {
		System.out.println(numB);
	}
	
    private static void methodB() {
    	
		System.out.println(numB);
	}
	
	public static final int NUMOFBEDROOMS = 1; 
	public static final double NUMOFBATHROOMS = 1; 
	public static final boolean FORSALE = true; 
	
	public Home(int numOfBed, double numOfBath, boolean forSale) {
		this.numberOfBedrooms = numOfBed;
		this.numberOfBathrooms = numOfBath;
		this.forSale = forSale;
	}
	
	public Home() {
		this.numberOfBedrooms = NUMOFBEDROOMS;
		this.numberOfBathrooms = NUMOFBATHROOMS;
		this.forSale = FORSALE;
	}
	
	
	public int getBedrooms() {
		return numberOfBedrooms;
	}
	
	public double getBathrooms() {
		return numberOfBathrooms;
	}
	
	public boolean isForSale() {
		return forSale;
	}
	
	public void setBedrooms(int num) {
		if(num >= 0) {
			this.numberOfBedrooms = num;
		}
	}
	
	public void setBathrooms(double num) {
		if(num >= 0) {
			this.numberOfBathrooms = num;
		}
	}
	
	public void setForSale(boolean b) {
		this.forSale = b;
	}
	
	@Override
	public String toString() {
		return "Number of bedrooms:\t" + numberOfBedrooms + "\nNumber of Bathrooms:\t" + numberOfBathrooms + "\nFor Sale?\t\t"
				+ forSale;
	}
	
	public static boolean similarAndBothForSale(Home house1, Home house2) {
		if((house1.getBedrooms() == house2.getBedrooms() || house1.getBathrooms() == house2.getBathrooms())
				&& house1.isForSale() == house2.isForSale() ) {
      		return true;
		} else {
			return false;
		}
	}


    public static int countSaleHomes(ArrayList<Home> list) {
		int n = 0;
		for(Home h : list) {
		    if(h.isForSale() == true) {
		        n++;
			}
		}
	return n;
			
	}
    
    
    
}
