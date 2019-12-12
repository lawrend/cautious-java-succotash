//package advJavaMod8HW;
import java.util.*;

public class RandomBox<T>{
	private ArrayList<T> list;
	private Random randomSelector;
	
	public RandomBox() {
		list = new ArrayList<T>();
		randomSelector = new Random();
	}
	
	public void addEntry(T item) {
		list.add(item);
	}
	
	public T drawWinner() {
		int index = randomSelector.nextInt(list.size());
		T returnVal = list.get(index);
		list.remove(index);
		return returnVal;
	}
	
	public int size() {
		return list.size();
	}
	
	public void displayEntries() {
		for(int i = 0; i < list.size() - 1; i++) {
			System.out.println(list.get(i));
		}
	}
	
	@Override
	public String toString() {
		return "The size of the random box is " + list.size();
	}

}
