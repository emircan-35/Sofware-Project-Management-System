package softwareProjectManagement;

import java.util.ArrayList;

public class Customer extends Person {

	private ArrayList<Project> projects;
	
	public Customer(int id,String title, String personName, String personSurname, String personPhone) {
		
		super(id,title, personName, personSurname, personPhone);
		projects=new ArrayList<Project>();
		// TODO Auto-generated constructor stub
	}
	public void addProject(Project newProject) {
		projects.add(newProject);
	}
	
}