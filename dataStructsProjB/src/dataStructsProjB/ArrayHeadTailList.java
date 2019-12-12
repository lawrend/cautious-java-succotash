package dataStructsProjB;
import java.util.Arrays;

//Cannot do this 
//T[] array = new T[size]
//Must do this
//T[] genericArray = (T[]) new Object[size];

public final class ArrayHeadTailList<T> implements HeadTailListInterface<T> {
	//inside the class 'this' is an ArrayHeadTailList object
	//this.listArray will be the array
	
	private T[] listArray;
	private int numberOfElements;
	private static final int DEFAULT_CAPACITY = 20;
	
    public ArrayHeadTailList()  {
    	this(DEFAULT_CAPACITY);
    }
    
	public ArrayHeadTailList(int initialCapacity) {
		T[] list = (T[])new Object[initialCapacity];
		this.listArray = list;
		this.numberOfElements = 0;
	}
	
	public ArrayHeadTailList(T[] contents) 
   {
	  @SuppressWarnings("unchecked")
	  T[] list = (T[])new Object[contents.length];
      list = Arrays.copyOf(contents, contents.length);
      this.listArray = list;
      this.numberOfElements = contents.length;
   }
	
	public void addFront(T newEntry) {
		checkCapacity(numberOfElements + 1);
	    T[] list = (T[])new Object[listArray.length];
		for(int i=0; i<numberOfElements; i++) {
			list[i+1] = listArray[i];
		}
		  list[0] = newEntry;
		  listArray = list;
		  this.numberOfElements++;
	}
	
	public void addBack(T newEntry) {
		checkCapacity(numberOfElements + 1);
		listArray[numberOfElements] = newEntry;
		this.numberOfElements++;
	}
	
	public T removeFront() {
		if(numberOfElements>0) {
		 T returnVal = listArray[0];
		 for (int i = 0; i < numberOfElements; i++) {
		    listArray[i] = listArray[i + 1];
		}
		numberOfElements = numberOfElements - 1;
		return returnVal;
		} else {
			return null;
		}
	}
	
	public T removeBack() {
		if(numberOfElements > 0) {
		T returnVal = listArray[numberOfElements -1];
		listArray[numberOfElements - 1] = null;
	    numberOfElements = numberOfElements - 1;
		return returnVal;
		} else {
			return null;
		}
	}
	
	public void clear() {
		listArray = (T[])new Object[listArray.length];
		this.numberOfElements = 0;
		
	}
	
	public T getEntry(int givenPosition) {
		if((givenPosition >= 0) && (givenPosition < listArray.length -1)) {
		  return listArray[givenPosition];
		}  else {
			return null;
		}
	}
	
	public T[] removeNulls() {
        T[] removedNulls = (T[]) new Object[numberOfElements];
		for(int i=0; i < listArray.length; i++) {
			if(listArray[i] != null) {
				removedNulls[i] = listArray[i];
			}
		}
		return removedNulls;
	}
	
	
	public void display() {
		System.out.println(numberOfElements + " elements; " 
	     + "capacity = " + listArray.length + "\t" + Arrays.toString(removeNulls()));
		
	}
	
	public int indexOf(T anEntry) {
		int where = -1;
		boolean found = false;
		int index = 0;
      
      while (!found && (index < numberOfElements))
		{
			if (anEntry.equals(listArray[index]))
			{
				found = true;
				where = index;
			} 
         index++;
		}       
		return where;	
	}
	
	public int lastIndexOf(T anEntry) {
	  int where = -1;
      for(int i = 0; i < listArray.length -1; i++)
		{
			if (anEntry.equals(listArray[i]))
			{
				where = i;
			} 
		}       
		return where;
	}
	
	public boolean contains(T anEntry) {
		boolean returnVal = false;
		int index = 0;
		while(!returnVal && (index < numberOfElements)) {
			if(anEntry.equals(listArray[index])) {
				returnVal = true;
		}
			index++;
		}
		return returnVal;
	}
	
	public int size() {
		return numberOfElements;
	}
	
	public boolean isEmpty() {
	    if(size() == 0) {
			return true;
		} else {
		    return false;
	    }
	}
	
	private void doubleSize() {
		int newSize = listArray.length * 2;
        listArray = Arrays.copyOf(listArray, newSize);
   }
	
	private void checkCapacity(int capacity) {
	      if (capacity > listArray.length) {
	    	  doubleSize();
	      }
	   }
	

}
