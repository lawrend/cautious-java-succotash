package advJavaMod2;

public class InventoryItem {
	private String name, id;
	private double price;
	private static boolean isThereStoreWideDiscount = true;
	private static double storeWideDiscount = 0.10;
	
	
	public static double checkForDiscount() {
		if(isThereStoreWideDiscount == true) {
			return storeWideDiscount;
		
		} else {
			return 0;
		}
	}
	
	public InventoryItem (String name, String id, double price) {
		this.name = name;
		this.id = id;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public String getId() {
		return id;
	}
	
	public double getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "Product Name: " + name + "\nProduct ID: " + id + "\nPrice: " + price;
	}
	



}
