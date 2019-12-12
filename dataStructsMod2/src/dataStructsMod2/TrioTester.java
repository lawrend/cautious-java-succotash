package dataStructsMod2;

public class TrioTester {

	public static void main(String[] args) {
		Trio t1 = new Trio("hey", "every", "body");
		Trio t2 = new Trio(3, 5, 5);
		Trio t3 = new Trio(3.444);
		Trio t4 = new Trio(3, 3, 4);
		Trio t5 = new Trio(3, 4, 4);
		
		System.out.println(t2.toString());
		System.out.println(t2.count(5));
		System.out.println(t2.hasDuplicates(5));
		System.out.println(t2.hasDuplicates(3));
		
		t2.reset("hey");
		
		System.out.println(t2.toString());
		
		System.out.println(t2.count("hey"));
		t1.reset("hey");
		System.out.println(t4.equals(t5));
		

	}

}
