package advJavaMidTerm;
import java.util.*;

public class advJavaMidTermDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dd = new Dog("dd", 12, AnimalStatus.NEW);
		dd.toString();
			
	}
	
	public static class AnimalAgeComparator implements Comparator<Animal> {
		public int compare(Animal a1, Animal a2) {
			Integer a1Age = a1.getAge();
			Integer a2Age = a2.getAge();

			return a1Age.compareTo(a2Age);
		}
    }	

}
