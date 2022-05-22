package softwareProjectManagement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import databaseProcesses.GeneralDB;

public class Customer extends Person {

	private ArrayList<Project> projects;
	private GeneralDB DB=GeneralDB.getObject();
	public Customer(int id,String title, String personName, String personSurname, String personPhone) throws SQLException {
		
		super(id,title, personName, personSurname, personPhone);
		projects=new ArrayList<Project>();
		addProjects();
		// TODO Auto-generated constructor stub
	}
	@SuppressWarnings("unused")
	private void addProjects() throws SQLException {
		ResultSet rs=DB.selectData("select * from project where Customer_idCustomer="+this.getId());
		while (rs.next()) addProject(new Project(this.getId(),this.getId(),rs.getString(2),rs.getString(3),rs.getInt(8)));
	}
	public void addProject(Project newProject) {
		projects.add(newProject);
	}
	public ArrayList<String> getProjectNames() {
		ArrayList<String> projectNames=new ArrayList<>();
		for (Project project : projects) {
			projectNames.add(project.getProjectName());
		}
		return projectNames;
	}
	
}