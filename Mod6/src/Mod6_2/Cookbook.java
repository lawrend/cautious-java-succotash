package Mod6_2;

public class Cookbook extends Book implements Comparable<Cookbook> {
	private int numberOfRecipes;
	private static final int DEFAULT_NUMBER_OF_RECIPES = 100;
	
    public Cookbook(String title, String author, int yearPublished, int numberOfRecipes) {
    	super(title, author, yearPublished);
    	this.numberOfRecipes = numberOfRecipes;
    }
    
    public Cookbook(String title, String author) {
    	super(title, author);
    	this.numberOfRecipes = DEFAULT_NUMBER_OF_RECIPES;
    }
    
    public int getNumberOfRecipes() {
    	return numberOfRecipes;
    }
    
    public void setNumberOfRecipes(int numberOfRecipes) {
    	if(numberOfRecipes > 0) {
    	    this.numberOfRecipes = numberOfRecipes;
    	}
    }
    
   public boolean isFeatured(int cutoffYear, int cutoffNumberOfRecipes) {
    	if(this.getYearPublished() >= cutoffYear && this.numberOfRecipes >= cutoffNumberOfRecipes) {
    		return true;
    	} else {
    		return false;
    	}
    }
    
    @Override
    public int compareTo(Cookbook cookbook) {
    	int returnCompare;
    	int titleCompare = this.getTitle().compareToIgnoreCase(cookbook.getTitle());
    	if(titleCompare != 0) {
    		returnCompare = titleCompare;
    	} else {
    		int authorCompare = this.getAuthor().compareToIgnoreCase(cookbook.getAuthor());
    		if(authorCompare != 0) {
    			returnCompare = authorCompare;
    		} else {
    			returnCompare = Integer.compare(this.numberOfRecipes, cookbook.numberOfRecipes);
    		}
    	}
    	return returnCompare;
    }
    
    @Override 
    public String toString() {
    	return super.toString() + "\n\ncontains " + numberOfRecipes + " recipes";
    }
	@Override
	public void read() {
		System.out.println(this.getTitle() + " needs a read method or else the class is abstract!");
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Cookbook) {
			Cookbook otherCookbook = (Cookbook) obj;
			
			boolean sameTitle, sameAuthor, sameYearPublished, sameNumberOfRecipes;
			
			if(this.getTitle().equalsIgnoreCase(otherCookbook.getTitle())) {
				sameTitle = true;
			} else {
				sameTitle = false;
			}
			
			if(this.getAuthor().contentEquals(otherCookbook.getAuthor()) ) {
				sameAuthor = true;
			} else {
				sameAuthor = false;
			}
			
			if(this.getYearPublished() == otherCookbook.getYearPublished() ) {
			    sameYearPublished = true;
			} else {
			    sameYearPublished = false;
			}
			
			if(this.numberOfRecipes == otherCookbook.numberOfRecipes) {
			    sameNumberOfRecipes = true;
			} else {
				sameNumberOfRecipes = false;
			}
			
			return sameTitle && sameAuthor && sameYearPublished && sameNumberOfRecipes;
			
		} else {
			return false;
		}
	}
}
