package softwareProjectManagement;

public class Report {
	
	private Person owner;
	private String Description;
	
	
	public Report(Person owner, String description) {
		this.owner = owner;
		Description = description;
	}
	
	public Person getOwner() {
		return owner;
	}
	
	public void setOwner(Person owner) {
		this.owner = owner;
	}
	
	public String getDescription() {
		return Description;
	}
	
	public void setDescription(String description) {
		Description = description;
	}
	
	
	
}
