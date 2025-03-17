package assignment_class_and_objecjt;

import java.util.*;

public class TeamDetails {
	
	private String teamName;
	private int teamCount;
	private String coachName;
	private List<PlayersList> playerList=new ArrayList<>();
	
	TeamDetails(String teamName,int teamCount,String coachName,PlayersList [] details){
		this.teamName=teamName;
		this.teamCount=teamCount;
		this.coachName=coachName;
		for(PlayersList i :details) {
			playerList.add(i);
		}
	}
	void displayTeamDetails() {
		System.out.println("TEAM NAME :" +teamName);
		System.out.println("TEAM SIZE :" +teamCount);
		System.out.println("COACH :"+coachName);
		for(PlayersList i:playerList)
		{
			System.out.println(i);
		}

	}
}	
