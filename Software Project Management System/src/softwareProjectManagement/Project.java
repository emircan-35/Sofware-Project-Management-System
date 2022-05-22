package softwareProjectManagement;

import java.sql.Time;
import java.util.ArrayList;

public class Project {
	private int projectId;
	private int customerID;
	private String projectName;
	private String projectDescription;
	private boolean status;
	private Team responsibleTeam;
	private ArrayList<Task> tasks;
	private Meet[] meets;

	public Project(int projectId, int customerID, String projectName, String projectDescription) {
		this.setCustomerID(customerID);
		this.setProjectId(projectId);
		this.projectName = projectName;
		this.projectDescription = projectDescription;

		this.status = false;
	}

	public class Task {
		private String workerName;
		private String taskDescription;
		private boolean status; // done --> completed, otherwise false
		private String deadline;
		private int id;

		public Task(int id, String workerName, String taskDescription, boolean status, String deadline) {
			this.id = id;
			this.workerName = workerName;
			this.taskDescription = taskDescription;
			this.status = status;
			this.deadline = deadline;
		}

		public String getWorkerName() {
			return workerName;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
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

		public String getStatus() {
			if (isStatus()) {
				return "True";
			} else
				return "False";
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

	public String getStatus() {
		if (isStatus()) {
			return "True";
		} else
			return "False";
	}

	public Meet[] getMeets() {
		return meets;
	}

	public void setMeets(Meet[] meets) {
		this.meets = meets;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

}
