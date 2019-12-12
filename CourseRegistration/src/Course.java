import java.util.*;

public class Course {
	
	private String name;
	private ArrayList<Student> roster;
	private ArrayList<Student> waitlist;
	private int maxRoster;
	private int maxWaitlist;
	
	public Course(String name, int maxRoster, int maxWaitlist) {
		this.name = name;
		this.maxRoster = maxRoster;
		this.maxWaitlist = maxWaitlist;
		roster = new ArrayList<Student>(maxRoster);
		waitlist = new ArrayList<Student>(maxWaitlist);
	}
	
	public ArrayList<Student> getWaitlist() {
		return waitlist;
	}
	
	public ArrayList<Student> getroster() {
		return roster;
	}
	
	public String getStudentInfo(Student student) {
		return "Name: " + student.getName() + "\n\tID: " + student.getID() + "\tTuition Paid? " + student.isTuitionPaid() + "\n";
	}
	
	public String getClassInfo(ArrayList<Student> classList) {
		String classInfo = "";
		for(Student student: classList) {
			classInfo = classInfo + getStudentInfo(student);
		}
		return classInfo;
	}
	
	public ArrayList<String> getEnrolledNames() {
		ArrayList<String> namesList = new ArrayList<String>(roster.size());
		for (Student student: roster) {
			namesList.add(student.getName());
		}
		return namesList;
	}
	
	public ArrayList<String> getWaitlistNames() {
		ArrayList<String> namesList = new ArrayList<String>(waitlist.size());
		for (Student student: waitlist) {
			namesList.add(student.getName());
		}
		return namesList;
	}
	
	public String toString() {
		
		return "Name: " + name +
				"\n\nCurrently Enrolled: " + roster.size() +
				"\nMaximum Enrollment: " + maxRoster +
				"\nEnrolled Students:\n" + getClassInfo(roster)  +
				"\nCurrent Waitlist: " + waitlist.size() +
				"\nMaximum Waitlist: " + maxWaitlist +
				"\nWaitlist Students:\n" + getClassInfo(waitlist);
	}
	
	public boolean addStudent(Student student) {
		boolean returnAnswer = false;
		if(student.isTuitionPaid() == false) {
			returnAnswer = false;
		} else {
		    if (roster.size() < maxRoster) {
		        if(isOnRoster(student) == false) {
			        roster.add(student);
		            returnAnswer = true;
		        } 
		    } else if(waitlist.size() < maxWaitlist) {
			    if(isOnWaitlist(student) == false) {
			    	waitlist.add(student);
			    	returnAnswer = true;
			    }
		    } else {
		    	returnAnswer = false;
		    }
		}
		return returnAnswer;
	}
	
	public boolean dropStudent(Student student) {
		boolean returnAnswer = false;
		if(isOnWaitlist(student)) {
			waitlist.remove(student);
			returnAnswer = true;
		}  else if(isOnRoster(student)) {
			roster.remove(student);
			returnAnswer = true;
			if(waitlist.isEmpty() == false) {
				roster.add(waitlist.get(0));
				waitlist.remove(0);
			}
		}  else {
			returnAnswer = false;
		}
		return returnAnswer;
	}
	
	public boolean isOnRoster(Student student) {
		if(roster.contains(student)) {
			return true;
		} else {
			return false;
		}
	}
	
    public boolean isOnWaitlist(Student student) {
		if(waitlist.contains(student)) {
			return true;
		} else {
			return false;
		}
	}
	
}
