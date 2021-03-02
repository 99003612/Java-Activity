public class Wicket1 {

	
	private String playerName;
	private Bowler1 bowlerObject;
	
	
	
	public Wicket1(String playerName, Bowler1 bowlerObject) {
		super();
		this.playerName = playerName;
		this.bowlerObject = bowlerObject;
	}
	
	
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public Bowler1 getBowlerObject() {
		return bowlerObject;
	}
	public void setBowlerObject(Bowler1 bowlerObject) {
		this.bowlerObject = bowlerObject;
	}


	@Override
	public String toString() {
		return "Wicket [playerName=" + playerName + ", bowlerObject=" + bowlerObject + "]";
	}
}
	