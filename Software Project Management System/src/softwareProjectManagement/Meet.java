package softwareProjectManagement;

public class Meet {
	private String meetingId;
	private String name;
	private String description;
	private String meetingTime;

	public Meet(String meetingId, String name, String description, String meetingTime) {
		this.meetingId = meetingId;
		this.name = name;
		this.description = description;
		this.meetingTime = meetingTime;

	}

	public String getMeetingId() {
		return meetingId;
	}

	public void setMeetingId(String meetingId) {
		this.meetingId = meetingId;
	}

	public String getMeetingTime() {
		return meetingTime;
	}

	public void setMeetingTime(String meetingTime) {
		this.meetingTime = meetingTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
