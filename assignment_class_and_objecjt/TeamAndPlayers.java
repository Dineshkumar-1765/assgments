package assignment_class_and_objecjt;

public class TeamAndPlayers {

	public static void main(String[] args) {
		
		PlayersList players1= new PlayersList("Dhoni",7,1);
		PlayersList players2= new PlayersList("Jadeja",9,2);
		PlayersList players3= new PlayersList("Raina",3,3);
		PlayersList players4= new PlayersList("Ruthuraj",31,4);
		
		
		PlayersList [] a=new PlayersList[4];
		
		a[0]=players1;
		a[1]=players2;
		a[2]=players3;
		a[3]=players4;
		
		
		TeamDetails team=new TeamDetails("CSK",11,"BRAVO",a);
		team.displayTeamDetails();

	}

}
