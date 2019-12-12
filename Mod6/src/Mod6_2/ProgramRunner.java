package Mod6_2;
import java.util.*;

public class ProgramRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hey");
		String bap = new String("papp");
		AudioItem fleek = new AudioItem("fleek", 12.22, 499);
		AudioMusicItem fleekmix = new AudioMusicItem("Fleek - Remix", 2.33, 200, "JeepKeys", "Splatteton");
		
		
		
		
		
		ArrayList<Cookbook> twoCookbooks = new ArrayList<Cookbook>();
		Cookbook julia = new Cookbook("Julia's Chompin", "Julie Cee", 1993, 144);
		Cookbook kroop = new Cookbook("Koops's Kitch", "Kooper Kook", 2018, 156);
		Cookbook kroop2 = new Cookbook("koops's kitch", "Kooper Cook");
		twoCookbooks.add(julia);
		twoCookbooks.add(kroop);	
		twoCookbooks.add(kroop2);	
		Collections.sort(twoCookbooks);
		for(Cookbook book: twoCookbooks) {
			if(book.isFeatured(2015, 100)) {
				System.out.println(book.toString());
			}
		}
		
		ChildrensBook bunnyTale = new ChildrensBook("Bunny Tale", "Jodi Wabbit", 2014);
		ChildrensBook horseVoices = new ChildrensBook("Horse Voices", "Ras P. Cough", 1972);
		
		
		Book[] bookList = new Book[4];
		bookList[0] = (julia);
		bookList[1] = (kroop);
		bookList[2] = (bunnyTale);
		bookList[3] = (horseVoices);
		
		int totalRecipes = 0;
		
		for(Book b : bookList) {
			if(b instanceof Cookbook) {
				totalRecipes += ((Cookbook)b).getNumberOfRecipes();
			}
		}
		
		System.out.println("recipe total is " + totalRecipes);
		
		
		/*
		System.out.println(julia.toString());
		System.out.println(kroop.toString());
		kroop.read();
		
		System.out.println(kroop.equals(kroop2));
		System.out.println("compare to " + kroop.compareTo(kroop2));
		
		System.out.println("compare to " + kroop.compareTo(julia));
		
		System.out.println("Kroop featured? " + kroop.isFeatured(1998, 200));
*/		

		
		
	}

}

/*
ClassA = Book; 
ClassB = Dictionary; 
ClassC = undergraduate; 
ClassD = Teacher;



Scanner scan = new Scanner(System.in);
System.out.println("What kind of object?");
int type = Integer.parseInt(scan.nextLine());
*/