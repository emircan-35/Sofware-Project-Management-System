package softwareProjectManagement;

public class ITWorker extends Person {

	
	
	private int salary;
	private int experience;
	private String[] knowledge;
	private Project currentProject;
	
	
	public ITWorker(String title,String personName, String personSurname, String personPhone,int salary,int experience,String[] knowledge,Project currentProject) {
		
		super(title,personName, personSurname, personPhone);
		// TODO Auto-generated constructor stub
	
		this.salary=salary;
		this.experience=experience;
		this.knowledge=knowledge;
		this.currentProject=currentProject;
		
		
	}




	



	public int getSalary() {
		return salary;
	}




	public void setSalary(int salary) {
		this.salary = salary;
	}




	public int getExperience() {
		return experience;
	}




	public void setExperience(int experience) {
		this.experience = experience;
	}




	public String[] getKnowledge() {
		return knowledge;
	}




	public void setKnowledge(String[] knowledge) {
		this.knowledge = knowledge;
	}




	public Project getCurrentProject() {
		return currentProject;
	}




	public void setCurrentProject(Project currentProject) {
		this.currentProject = currentProject;
	}
	
	
}
