package dataStructsMod3;
import java.util.*;

public class Movie implements Comparable<Movie>{
	private String name;
	private int year;

	@Override
	public int compareTo(Movie movie) {
		if(Integer.compare(this.year, movie.year) == 0) {
			return this.name.compareTo(movie.name);
		} else {
		return Integer.compare(this.year, movie.year);
		}
	}
}
