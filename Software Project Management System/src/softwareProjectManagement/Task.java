package softwareProjectManagement;

public class Task {
	
	private String taskDescription;
	private boolean taskStatus;
	private ITWorker taskOwner;
	
	
	public Task(String taskDescription,boolean taskStatus,ITWorker taskOwner) {
		
		this.taskDescription=taskDescription;
		this.taskStatus=taskStatus;
		this.taskOwner=taskOwner;
		
	}


	public String getTaskDescription() {
		return taskDescription;
	}


	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}


	public boolean isTaskStatus() {
		return taskStatus;
	}


	public void setTaskStatus(boolean taskStatus) {
		this.taskStatus = taskStatus;
	}


	public ITWorker getTaskOwner() {
		return taskOwner;
	}


	public void setTaskOwner(ITWorker taskOwner) {
		this.taskOwner = taskOwner;
	}
	

}
