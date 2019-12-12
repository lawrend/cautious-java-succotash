package newAdvJavaMidterm;

public class Dog extends Animal implements Exercisable {
	public Dog(String name, int age, Exercisable exercise, AnimalStatus status) {
		super(name, age, exercise, status);
	}
}
