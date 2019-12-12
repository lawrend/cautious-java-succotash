
package dataStructsMod2;
public class Pair<T> {
	
	private T item1, item2;
	
	public Pair(T item1, T item2) {
		this.item1 = item1;
		this.item2 = item2;
	}
	
	public T getItem1() {
		return item1;
	}
	public T getItem2() {
		return item2;
	}
	public void setItem1(T item1) {
		this.item1 = item1;
	}
	public void setItem2(T item2) {
		this.item2 = item2;
	}
	
	@Override
	public String toString() {
		return item1.toString() + "\t" + item2.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Pair) {
			Pair otherPair = (Pair) obj;
			return (this.item1.equals(otherPair.item1) && this.item2.equals(otherPair.item2)) || 
					(this.item1.equals(otherPair.item2) && this.item2.equals(otherPair.item1));
		} else {
			return false;
		}
	}
	
	public boolean sameItems() {
		return item1.equals(item2);
		// return item1==item2; INCORRECT! tests for aliases, not logical equivalence
	}

}
