package softwareProjectManagement;

import java.util.ArrayList;

public class Team {

	private ArrayList<ITWorker> members;

	public Team(String name, ArrayList<ITWorker> members) {
		this.members = members;
	}

	public ArrayList<ITWorker> getMembers() {
		return members;
	}

	public void setMembers(ArrayList<ITWorker> members) {
		this.members = members;
	}

}
