package softwareProjectManagement;

import java.sql.Time;
import java.util.ArrayList;

public class Meet {
	private String name;
	private String description;
	private Time meetingTime;
	private ArrayList<Person> attendees;
	private boolean status;

	

	public Meet(String name, String description, Time meetingTime, ArrayList<Person> attendees) {
		this.name = name;
		this.description = description;
		this.meetingTime = meetingTime;
		this.attendees = attendees;
	}


	public void discardAttendee(Person attendee) {
		attendees.remove(attendee);
	}
	
	public void addAttendee(Person attendee) {
		attendees.add(attendee);
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


	public ArrayList<Person> getAttendees() {
		return attendees;
	}


	public void setAttendees(ArrayList<Person> attendees) {
		this.attendees = attendees;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}
