package softwareProjectManagement;

import softwareProjectManagement.Project.Task;

public class Report {
	private int id;
	private ITWorker owner;
	private String description;
	private Task task;

	public Report(int id,ITWorker owner, String description, Task task) {
		this.id=id;
		this.task = task;
		this.owner = owner;
		this.description = description;

	}




	public String getDescription() {
		return description;
	}



}
