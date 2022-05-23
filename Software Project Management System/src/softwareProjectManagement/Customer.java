package softwareProjectManagement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import databaseProcesses.GeneralDB;

public class Customer extends Person {

	private Project project;
	private GeneralDB DB=GeneralDB.getObject();
	public Customer(int id,String title, String personName, String personSurname, String personPhone) throws SQLException {
		
		super(id,title, personName, personSurname, personPhone);
		this.project=project;
		// TODO Auto-generated constructor stub
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	
	

	
}