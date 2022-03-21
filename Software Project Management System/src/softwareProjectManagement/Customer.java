package softwareProjectManagement;

public class Customer extends Person {

	private Project project;
	
	public Customer(String title, String personName, String personSurname, String personPhone,Project project) {
		
		super(title, personName, personSurname, personPhone);
		// TODO Auto-generated constructor stub
		this.project = project;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}
	
}