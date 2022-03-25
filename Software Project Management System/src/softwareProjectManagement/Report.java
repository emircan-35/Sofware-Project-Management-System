package softwareProjectManagement;

public class Report {
	
	private ITWorker owner;
	private String description;
	
	
	public Report(ITWorker owner, String description) {
		this.owner = owner;
		this.description = description;
		
	}
	
	public Person getOwner() {
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
}
