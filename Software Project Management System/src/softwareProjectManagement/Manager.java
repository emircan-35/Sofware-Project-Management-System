package softwareProjectManagement;

public class Manager extends Person {
	
	private String managerid;
	private int salary;
	
	public Manager(String managerid,String title, String personName, String personSurname, String personPhone, int salary) {
		super(title, personName, personSurname, personPhone);
		this.salary= salary;
		this.managerid=managerid;
		// TODO Auto-generated constructor stub
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getManagerid() {
		return managerid;
	}

	public void setManagerid(String managerid) {
		this.managerid = managerid;
	}
	
	
	
}