package Mod6_2;

public class Employee {

	private String name, id, phone;
	private Status status;
	
	public static final String COMPANY_PHONE = "555-5555";
	public static final Status DEFAULT_STATUS = Status.FULL_TIME;
	
	static enum Status {
		FULL_TIME(true, "Full"), PART_TIME(true, "Part"), INACTIVE(false, "Inactive");
		
		private boolean benefits;
		private String outputText;
		
		private Status(boolean benefits, String outputText) {
			this.benefits = benefits;
			this.outputText = outputText;
		}
		
		public boolean getBenefits() {
			return this.benefits;
		}
		
		public String toString() {
			return outputText;
		}
	};
	
	public Employee(String name, String id, String phone, Status status) {
		this.name = name;
		this.id = id;
		this.phone = phone;
		this.status = status;
	}
	
	public Employee(String name, String id, Status status) {
		this(name, id, COMPANY_PHONE, status);
	}
	public Employee(String name, String id) {
		this(name, id, COMPANY_PHONE, DEFAULT_STATUS);
	}
	
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public String getPhone() {
		return phone;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		String s = name + " (" + id + ")";
		return s;
	}
	
	public void pay() {
		System.out.println("Paying employee " + name);
	}
	
	public void review() {
		System.out.println("Conducting a review of " + name);
	}
	
	public void benefits() {
		if(status.getBenefits()) {
			System.out.println("Processing benefits for " + name);
		} else { 
			System.out.println("This employee does not receive benefits.");
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Employee) {
			Employee otherEmployee = (Employee) obj;
			//return this.id.equals(otherEmployee.id);
			//return this.id.equalsIgnoreCase(otherEmployee.id);
			return this.name.equalsIgnoreCase(otherEmployee.name) &&
					this.id.equalsIgnoreCase(otherEmployee.id) &&
					this.phone.equalsIgnoreCase(otherEmployee.phone) &&
					this.status.equals(otherEmployee.status);
			
			
		} else {
			return false;
		}
		
	}
	
	
}

