package softwareProjectManagement;

public class Meet {
	private int meetingId;
	private String name;
	private String description;
	private String meetingTime;
	private int teamID;
	public Meet(int meetingId, int teamID,String name, String description, String meetingTime) {
		this.meetingId = meetingId;
		this.teamID=teamID;
		this.name = name;
		this.description = description;
		this.meetingTime = meetingTime;

	}


	public int getMeetingId() {
		return meetingId;
	}


	public void setMeetingId(int meetingId) {
		this.meetingId = meetingId;
	}


	public int getTeamID() {
		return teamID;
	}


	public void setTeamID(int teamID) {
		this.teamID = teamID;
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
