package assignment_class_and_objecjt;

public class PlayersList {

	private String playerName;
	private int jersyNumber;
	private int playerRank;
	
	PlayersList(String playerName,int jersyNumber,int playerRank){
		this.playerName=playerName;
		this.jersyNumber=jersyNumber;
		this.playerRank=playerRank;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getJersyNumber() {
		return jersyNumber;
	}

	public void setJersyNumber(int jersyNumber) {
		this.jersyNumber = jersyNumber;
	}

	public int getPlayerRank() {
		return playerRank;
	}

	public void setPlayerRank(int playerRank) {
		this.playerRank = playerRank;
	}

	@Override
	public String toString() {
		return "PlayersList [playerName=" + playerName + ", jersyNumber=" + jersyNumber + ", playerRank=" + playerRank
				+ "]";
	}
	
	
}
