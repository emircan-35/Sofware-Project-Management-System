package softwareProjectManagement;

import java.sql.Time;
import java.util.ArrayList;

public class Project {

	private String projectName;
	private String projectDescription;
	private boolean status;
	private Team responsibleTeam;
	private ArrayList<Task> tasks;
	private Meet[] meets;

	public Project(String projectName, String projectDescription) {
		this.projectName=projectName;
		this.projectDescription=projectDescription;
		this.status=false;
	}
	public class Task {
		private ITWorker responsibleEmployee;
		private String taskDescription;
		private boolean status; // done --> completed, otherwise false
		private Time deadline;

		public Task(ITWorker responsibleEmployee, String taskDescription, boolean status, Time deadline) {
			this.responsibleEmployee = responsibleEmployee;
			this.taskDescription = taskDescription;
			this.status = status;
			this.deadline = deadline;
		}

		public ITWorker getResponsibleEmployee() {
			return responsibleEmployee;
		}

		public void setResponsibleEmployee(ITWorker responsibleEmployee) {
			this.responsibleEmployee = responsibleEmployee;
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

		public Time getDeadline() {
			return deadline;
		}

		public void setDeadline(Time deadline) {
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
