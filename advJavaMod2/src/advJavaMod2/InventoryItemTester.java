package advJavaMod2;

public class InventoryItemTester {

	public static void main(String[] args) {
		
		InventoryItem one = new InventoryItem("sponges", "123123", 12.99);
		System.out.println(one.toString());
		
		AbstractItem abstractOne = new AbstractItem("hope", "1254", 11.33);
		System.out.println(abstractOne.toString());
		
		System.out.println(InventoryItem.checkForDiscount());
	}

}
