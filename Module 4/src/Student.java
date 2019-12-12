
public class Student {
	private String name, id;
	private static int maxAge = 22;
	
	
	public Student(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public static int getMaxAge() {
		return maxAge;
	}

}
