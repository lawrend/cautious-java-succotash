
public class Book {
	
	private String title, author;
	private int publicationYear;
	public static final int MINIMUM_VALUE = 1000, MAXIMUM_VALUE = 2200;
	
	public Book(String theTitle, String theAuthor, int thePublicationYear) {
		title = theTitle;
		author = theAuthor;
		publicationYear = thePublicationYear;
	}
	
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getPublicationYear() {
		return publicationYear;
	}
	
	public void setTitle(String newTitle) {
		title = newTitle;
	}
	public void setAuthor(String newAuthor) {
		author = newAuthor;
	}
	public void setPublicationYear(int newPublicationYear) {
		if(newPublicationYear >= MINIMUM_VALUE && newPublicationYear <= MAXIMUM_VALUE) {
		publicationYear = newPublicationYear;
		} else {
			System.out.println("\nError: Invalid Value - 'Publication Year' - Object not modified");
		}
	}
	
	public String toString() {
		String s = "\nTitle: " + title + "\nAuthor: " + author + "\nPublication Year: " + publicationYear + "\n";
		return s;
	}
	
	public boolean isBeforeDigitalAge() {
		return publicationYear <= 1990;
	}
	
	public int countAuthors() {
		int authorCount = 1;
		char amp = '&';
		for(int i=0; i<author.length(); i++) {
			if(author.charAt(i) == amp) {
				authorCount++;
			}
		}
		return authorCount;
		
	}

}
