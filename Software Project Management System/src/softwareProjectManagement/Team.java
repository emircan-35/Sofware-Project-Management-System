package softwareProjectManagement;

import java.util.ArrayList;

public class Team {
	
	private ArrayList<ITWorker> members;
	
	public Team(String name, ArrayList<ITWorker> members) {
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
	
	public ArrayList<ITWorker> getMembers() {
		return members;
	}
	public void setMembers(ArrayList<ITWorker> members) {
		this.members = members;
	}

	
	
	
}
