package softwareProjectManagement;

public class ITWorker extends Person {
	
	private int teamId;
	private int salary;
	private int experience;

	public ITWorker(int id, String title, String personName, String personSurname, String personPhone, int salary,
			int experience, int teamId) {
		super(id, title, personName, personSurname, personPhone);
		// TODO Auto-generated constructor stub
		this.salary = salary;
		this.experience = experience;
		this.teamId = teamId;

	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
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


}
