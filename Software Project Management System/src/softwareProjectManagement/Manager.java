package softwareProjectManagement;

public class Manager extends Person {
	
	
	private int salary;
	
	public Manager(String title, String personName, String personSurname, String personPhone) {
		super(title, personName, personSurname, personPhone);
		// TODO Auto-generated constructor stub
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
}
