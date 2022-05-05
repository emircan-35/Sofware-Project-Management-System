package softwareProjectManagement;

import java.sql.Time;
import java.util.ArrayList;

public class Project {
	private int customerID;
	private String projectName;
	private String projectDescription;
	private boolean status;
	private Team responsibleTeam;
	private ArrayList<Task> tasks;
	private Meet[] meets;
	private int money;

	public Project(int customerID, String projectName, String projectDescription, int money) {
		this.customerID = customerID;
		this.projectName = projectName;
		this.projectDescription = projectDescription;
		this.money = money;
		this.status = false;
	}

	public class Task {
		private String workerName;
		private String taskDescription;
		private boolean status; // done --> completed, otherwise false
		private String deadline;

		public Task(String workerName, String taskDescription, boolean status, String deadline) {
			this.workerName = workerName;
			this.taskDescription = taskDescription;
			this.status = status;
			this.deadline = deadline;
		}



		public String getWorkerName() {
			return workerName;
		}



		public void setWorkerName(String workerName) {
			this.workerName = workerName;
		}



		public String getTaskDescription() {
			return taskDescription;
		}

		public void setTaskDescription(String taskDescription) {
			this.taskDescription = taskDescription;
		}

		public boolean isStatus() {
			return status;
		}

		public void setStatus(boolean status) {
			this.status = status;
		}

		public String getDeadline() {
			return deadline;
		}

		public void setDeadline(String deadline) {
			this.deadline = deadline;
		}

	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public Team getResponsibleTeam() {
		return responsibleTeam;
	}

	public void setResponsibleTeam(Team responsibleTeam) {
		this.responsibleTeam = responsibleTeam;
	}

	public ArrayList<Task> getTasks() {
		return tasks;
	}

	public void setTasks(ArrayList<Task> tasks) {
		this.tasks = tasks;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Meet[] getMeets() {
		return meets;
	}

	public void setMeets(Meet[] meets) {
		this.meets = meets;
	}

}
