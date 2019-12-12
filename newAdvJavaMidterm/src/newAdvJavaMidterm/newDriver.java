package newAdvJavaMidterm;
import java.util.*;

public class newDriver {

	public static void main(String[] args) {
		Exercisable oh = new OutsideExerciser();
		System.out.println("Okay");
		Dog dd = new Dog("dd", 12, oh, AnimalStatus.NEW);
		dd.exercise();

	}
	
	public static int countAdoptableAnimals(List<Animal> animals) {
		int counter = 0;
		for(int i = 0; i < animals.size(); i++) {
			if(animals.get(i).getStatus().equals("NEW")) {
				counter ++;
			}
		}
		return counter;
	}

}
