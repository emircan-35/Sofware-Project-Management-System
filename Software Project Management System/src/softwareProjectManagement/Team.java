package softwareProjectManagement;

import java.util.ArrayList;

public class Team {
	private String name;
	private ArrayList<ITWorker> members;
	
	
	
	
	public Team(String name, ArrayList<ITWorker> members) {
		this.name = name;
		this.members = members;
	}
	
	
	public void deleteMember(ITWorker newMember) {
		int index=members.indexOf(newMember);
		if (index!=-1) members.remove(newMember);
		//else condition should be coded in the future 
	}
	
	
	public void addMember(ITWorker newMember) {
		if (members.contains(newMember)) members.add(newMember);
		//else condition should be coded in the future 
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<ITWorker> getMembers() {
		return members;
	}
	public void setMembers(ArrayList<ITWorker> members) {
		this.members = members;
	}

	
	
	
}
