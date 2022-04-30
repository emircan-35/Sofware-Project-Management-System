package softwareProjectManagement;

import java.sql.Time;
import java.util.ArrayList;

public class Meet {
	private String name;
	private String description;
	private Time meetingTime;
	private ArrayList<Integer> attendeesIds;
	private boolean status;

	

	public Meet(String name, String description) {
		this.name = name;
		this.description = description;
		//MEETING TIME SHOULD BE ADDED!!
	}



	
	public ArrayList<Integer> getAttendeesIds() {
		return attendeesIds;
	}




	public void setAttendeesIds(ArrayList<Integer> attendeesIds) {
		this.attendeesIds = attendeesIds;
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
	public Time getMeetingTime() {
		return meetingTime;
	}
	public void setMeetingTime(Time meetingTime) {
		this.meetingTime = meetingTime;
	}





	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}
