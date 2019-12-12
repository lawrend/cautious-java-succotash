import java.util.ArrayList;

public class Mod4HW {

	public static void main(String[] args) {
				
		String a = "3", b = "2";
		int y = 4, z = 5;
		
		System.out.println(a + b + y + z);
		
		ArrayList<Integer> tester = new ArrayList<Integer>();
		tester.add(3);
		tester.add(-3);
		tester.add(-4);
		tester.add(4);
		tester.add(0);
		
		tester.remove(1);
		System.out.println(tester.get(1));
		
		System.out.println(tester);
		
		int[] testy = new int[3];
		testy[0] = 1;
		testy[1] = 1;
		testy[0] = 1;
		
		int[] jokey = {1,2,3};
		System.out.println(jokey);
		
		
		Home house = new Home(3, 2.5, true);
		Home rental = new Home();
		Home rental2 = new Home(1, 2, true);
		Home rental3 = new Home(1, 1, false);
		
		ArrayList<Home> houseList = new ArrayList<Home>();
		houseList.add(house);
		houseList.add(rental);
		houseList.add(rental2);
		houseList.add(rental3);
		
		
		System.out.println(Home.countSaleHomes(houseList));
		
		System.out.println(Home.similarAndBothForSale(house, rental2));
		System.out.println(Home.similarAndBothForSale(rental, rental2));
		System.out.println(Home.similarAndBothForSale(rental, rental3));
		
		System.out.println(rental.toString());
		
		HouseBoat hb = new HouseBoat(2, 2, false, "Jolly Joe");
		
		System.out.println(hb.toString());
		
/*		
		
		Dinosaur myDino = (Dinosaur.VELOCIRAPTOR);
		Dinosaur secondDino = Dinosaur.VELOCIRAPTOR;
		
		String[] oneStr = new String[7];
		oneStr[0] = "apple";
		oneStr[1] = "pear";
		oneStr[4] = "lemon";
		oneStr[6] = "cherry";
		
		
		System.out.println(returnCount(oneStr));
		System.out.println(returnCount(oneStr, 4));
		System.out.println(returnCount(oneStr, 7));
		
		Customer jake = new Customer("Jake");
		
		Order firstOrder = new Order("1", 12.00);
		Order secondOrder = new Order("2", 33.24);
		
		Order thirdOrder = new Order("3", 23.24);
		Order fourthOrder = new Order("4", 3.55);
		Order fifthOrder = new Order("5", 35.51);
		Order bigOrder = new Order("6", 800.00);
		
		Customer hank = new Customer("Hank", firstOrder);
		hank.addOrder(secondOrder);
		hank.addOrder(bigOrder);
		double totalFromHank = hank.getTotalOwed();
		System.out.println("Hank owes $" + totalFromHank);
		
		System.out.println(hank.toString());
	
		Customer wanda = new Customer("Wanda");
		Customer petra = new Customer("Petra");
		Customer solange = new Customer("Solange");
		
		System.out.println(Customer.getCustomerCount());
	MyClass myClassObject = new MyClass();
	myClassObject.doSomething(6);
		
	Student joe = new Student("Joe", "12");
	Student laika = new Student();
	System.out.println(joe.getName());
	System.out.println(joe.getMaxAge());
	
    public int method() {
		return 4;
	}
	
	public double method(int num) {
		return 4.5;
	}
	*/
	
	}
	
	
	public static int[] getAbsoluteValueArray(ArrayList<Integer> list) {
		int[] newList = new int[list.size()];
		
		int n = 0;
		for(int num : list) {
			newList[n] = Math.abs(num);
			n++;
		}
		
		return newList;
	}	
	
	
	
	
	
	public int returnOne() {
		return 1;
	}
	
	public static int returnCount(String[] str, int num) {
		if(num >= str.length) {
			return 0;
		}
		int count = 0;
		for(int i = num; i<str.length; i++) {
			if(str[i] == null) {
				count ++;
			}
		}
		return count;
	}
	
	public static int returnCount(String[] str) {
		return returnCount(str, 0);
	}
	
}


