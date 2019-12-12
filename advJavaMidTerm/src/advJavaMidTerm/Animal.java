package advJavaMidTerm;
import java.io.*;
import java.util.*;

public abstract class Animal implements Comparable<Animal> {

    private String name;
    private int age;
    private Exercisable exercise;
    private AnimalStatus status;
 
    public Animal(String name, int age, Exercisable exercise, AnimalStatus status) {
        this.name = name;
        this.exercise = exercise;
        this.age = age;
        this.status = status;
    }

    public AnimalStatus getStatus() {
        return status;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public Exercisable getExercise() {
        return exercise;
    }

    public void setExercise(Exercisable exercise) {
        this.exercise = exercise;
    }

    public void exercise() {
    	
    	   // YOUR CODE HERE
   } 
    
    @Override
    public String toString() {
        return name + " (Age: " + age + ")";
    }
    
    @Override
    public boolean equals(Object other) {
    	if(other instanceof Animal) {
    		Animal otherAnimal = (Animal) other;
    		return this.name.equalsIgnoreCase(otherAnimal.name) 
    				&& this.age == otherAnimal.age;
    	} else {
    		return false;
    	}
    }
    
    @Override 
    public int compareTo(Animal obj) {
    	if(this.name.compareTo(obj.name) == 0) {
    		Integer age1 = this.age;
    		Integer age2 = obj.age;
    		return age1.compareTo(age2);
    	} else {
    	    return this.name.compareTo(obj.name);
    	}
    }
    
}
