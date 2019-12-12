package CourseWithList;

public class Course {
	private int maxRoster, maxWaitlist;
	private String name;
	private Student[] roster;
	private Student[] waitlist;
	
	
	public Course(String name, int maxWaitlist, int maxRoster) {
		this.name = name;
		this.maxWaitlist = maxWaitlist;
		this.maxRoster = maxRoster;
		roster = new Student[maxRoster];
		waitlist = new Student[maxWaitlist];
	}
	
	public Student[] getWaitlist() {
		return waitlist;
	}
	
	public Student[] getRoster() {
		return roster;
	}
	
	public String getName() {
		return name;
	}
	

	public int getMaxRoster() {
	return maxRoster;
	}
	
	public int getActualRosterNum() {
		int n = 0;
		for(Student s : roster) {
			if(s != null) {
				n++;
			}
		}
		return n;
	}
	
	public int getMaxWaitlist() {
		return maxWaitlist;
	}
	
	public int getActualWaitlistNum() {
		int n = 0;
		for(Student s : waitlist) {
			if(s != null) {
				n++;
			}
		}
		return n;
	}	
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setMaxWaitlist(int maxWaitlist) {
		this.maxWaitlist = maxWaitlist;
	}
		
	public void setMaxRoster(int maxRoster) {
		this.maxRoster = maxRoster;
	}
	
	static boolean isSpace(Student[] lst) {
		for(int i =0; i<lst.length; i++) {
			if(lst[i] == null) {
				return true;
			} 
		}
		return false;
	}
	
	public boolean addStudent(Student student) {
		if(student.isTuitionPaid() == false) {
			return false;
		} else {
			if(isSpace(roster) == true) {
		        for(int i = 0; i<roster.length; i++) {
			        if (roster[i] == null) {
				        roster[i] = student;
				        return true;
		                }
		            }
			} else if(isSpace(waitlist) == true)
				for(int i = 0; i<waitlist.length; i++) {
			        if (waitlist[i] == null) {
				        waitlist[i] = student;
				        return true;
		                }
		            }
		}
	    return false;	
	}
	
	public boolean dropStudent(Student student) {
		for(int i = 0; i<roster.length; i++) {
			if(waitlist[i] == student) {
				waitlist[i] = null;
				return true;
			} else if (roster[i] == student) {
				roster[i] = null;
			    this.addFromWaitlist();
			    return true;
			}
		}
		return false; 
	}
	
	static String getStudentInfo(Student student) {
	    return student.getName() + "\tTuition Paid? " + student.isTuitionPaid();
	}
		
    static String getEnrolledNames(Student[] roster) {
		String namesList = new String();
		for (Student student : roster) {
			if(student != null) {
			    namesList = namesList + getStudentInfo(student) + " \n";
			}
		}
		return namesList;
	}
    
    public boolean addFromWaitlist() {
    	for(int i=0; i<waitlist.length; i++) {
    		if (waitlist[i] != null) {
    			this.addStudent(waitlist[i]);
    			waitlist[i] = null;
    		}
    	}
    	return false;
    }
	
	
	@Override
	public String toString() {
		return "Name: " + name + "\n\nRoster: " + this.getActualRosterNum() + "/" + this.getMaxRoster() 
		+ "\n" + getEnrolledNames(roster) + "\nWaitlist: " + this.getActualWaitlistNum() + "/" + this.getMaxWaitlist() 
		+ "\n" + getEnrolledNames(waitlist); 
	}
}