package dataStructsMod2;

public class Trio<T> {
	
	private T item1, item2, item3;
	
	public Trio(T item1, T item2, T item3) {
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
	}
	
	public Trio(T item) {
		this.item1 = item;
		this.item2 = item;
		this.item3 = item;
	}
	
	public T getItem1() {
		return item1;
	}
	
	public T getItem2() {
		return item2;
		
	}public T getItem3() {
		return item3;
	}
	
	public void setItem1(T item) {
		this.item1 = item;
	}
	
	public void setItem2(T item) {
		this.item2 = item;
	}

	public void setItem3(T item) {
		this.item3 = item;
	}
	
	public void reset(T item) {
		this.item1 = item;
		this.item2 = item;
		this.item3 = item;
	}
	
	public int count(T item) {
		int count = 0;
		if(this.item1.equals(item)) {
			count++;
		}
		
		if(this.item2.equals(item)) {
			count++;
		}
		
		if(this.item3.equals(item)) {
			count++;
		}
		
		return count;
	}
	
	
	
	public boolean hasDuplicates(T item) {
		if(this.count(item) > 1) {
			return true;
		} else {
			return false;
		}
	}
	
	
	@Override
	public String toString() {
		return "Item 1: " + item1 + "\nItem 2: " + item2
				+ "\nItem 3: " + item3;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Trio<?>) {
			Trio<?> otherTrio = (Trio<?>) obj;
			
			boolean elementsFound = 
					(this.item1.equals(otherTrio.item1) ||
					this.item1.equals(otherTrio.item2) ||
					this.item1.equals(otherTrio.item3))
					&&
					(this.item2.equals(otherTrio.item1) ||
					this.item2.equals(otherTrio.item2) ||
					this.item2.equals(otherTrio.item3))
					&&
					(this.item3.equals(otherTrio.item1) ||
					this.item3.equals(otherTrio.item2) ||
					this.item3.equals(otherTrio.item3));
			return elementsFound;
			//I know this does not check for duplicates
			//i was going to figure it out and would use the local variable
			//but i know that the local var elementsFound is not nec here
		} else {
			return false;
		}
	}
	
}
