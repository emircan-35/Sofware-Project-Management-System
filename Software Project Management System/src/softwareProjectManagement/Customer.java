package softwareProjectManagement;

public class Customer extends Person {

	private Project project;
	
	public Customer(String title, String personName, String personSurname, String personPhone) {
		super(title, personName, personSurname, personPhone);
		// TODO Auto-generated constructor stub
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}
	
	

}
