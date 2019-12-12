package dataStructsMod1HWFiles;

public class OvernightParcel extends Parcel {
	private boolean isSigRequired;
	
	public OvernightParcel(String id, double weight, boolean isSigRequired) {
		super(id, weight);
		this.isSigRequired = isSigRequired;
	}

}
