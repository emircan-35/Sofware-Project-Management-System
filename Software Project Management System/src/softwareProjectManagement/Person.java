package softwareProjectManagement;

public abstract class Person {
	private int id;
	private String title;
	private String personName;
	private String personSurname;
	private String personPhone;
	
	public Person(int id,String title,String personName,String personSurname,String personPhone) {
		this.id=id;
		this.title=title;
		this.personName=personName;
		this.personSurname=personSurname;
		this.personPhone=personPhone;
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPersonSurname() {
		return personSurname;
	}

	public void setPersonSurname(String personSurname) {
		this.personSurname = personSurname;
	}

	public String getPersonPhone() {
		return personPhone;
	}

	public void setPersonPhone(String personPhone) {
		this.personPhone = personPhone;
	}
	
	
}
