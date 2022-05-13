package softwareProjectManagement;

import softwareProjectManagement.Project.Task;

public class Report {

	private ITWorker owner;
	private String description;
	private Task task;

	public Report(ITWorker owner, String description, Task task) {
		this.task = task;
		this.owner = owner;
		this.description = description;

	}

	public ITWorker getOwner() {
		return owner;
	}

	public void setOwner(ITWorker owner) {
		this.owner = owner;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

}
