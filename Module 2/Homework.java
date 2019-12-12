
public class Homework {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p = new Person("Johnny Dude", "2332 UpButt Alley", 18);
		System.out.println(p);
		System.out.println(p.getAddress());
		
		Book b = new Book("The Grapes of Brad", "Sammy Hagar, Jr.", 1982);
		System.out.print(b.toString());
		System.out.print(b);
		Book wrong = new Book("Totally Totally", "Karl", 2000);
		wrong.setPublicationYear(2777);
		System.out.print(wrong);
		Book multi = new Book("We got this!", "Charles & Diana", 1997);
		System.out.print(multi.toString());
		System.out.print(b.isBeforeDigitalAge());
		int multiCount = multi.countAuthors();
		int bCount = b.countAuthors();
		System.out.println("\n\'" + multi.getTitle() + "\' has " + multi.countAuthors() + " authors");
		System.out.println("\nIt is " + b.isBeforeDigitalAge() + " that '" + b.getTitle() + "' was published before 1990, the 'digital age'.");
		
		
	}

}
