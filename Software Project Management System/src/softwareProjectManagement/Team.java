package softwareProjectManagement;

import java.util.ArrayList;

public class Team {
	private int teamId;
	private ArrayList<ITWorker> members;

	public Team(int teamId,ArrayList<ITWorker> members) {
		this.members = members;
		this.teamId=teamId;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public void addTeamMember(ITWorker worker) {

		members.add(worker);

	}

	public ArrayList<ITWorker> getMembers() {
		return members;
	}

	public void setMembers(ArrayList<ITWorker> members) {
		this.members = members;
	}

}
