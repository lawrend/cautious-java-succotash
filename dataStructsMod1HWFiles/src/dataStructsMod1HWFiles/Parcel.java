package dataStructsMod1HWFiles;

public class Parcel {
	private String id;
	private double weight;
	
	public final static double DEFAULT_WEIGHT = 1.00;
	
	public Parcel (String id, double weight) {
		this.id = id;
		this.weight = weight;
	}
	
	public Parcel (String id) {
		this(id, DEFAULT_WEIGHT);
	}
	
	public boolean checkId(char a, char b, int freq) {
		int firstChar = this.id.indexOf(a);
		int secondCharFreq = 
	}
}
