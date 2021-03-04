import java.util.ArrayList;
import java.util.List;

public class Team {
	private String name;

	ArrayList<Player1> playerList = new ArrayList<Player1>();
	
	

	public Team() {
		super();
	}

	public Team(String name, ArrayList<Player1> playerList) {
		super();
		this.name = name;
		this.playerList = playerList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Player1> getPlayerList() {
		return playerList;
	}

	public void setPlayerList(ArrayList<Player1> playerList) {
		this.playerList = playerList;
	}
	public void addPlayerToTeam(Player1 p1) {
		playerList.add(p1);
		System.out.println("Player "+(p1).getName()+" successfully added");
	}
	
	public Boolean removePlayerFromTeam(String name) {
		
		if(playerList.contains(name)) {
			
			
		playerList.remove(name);
		return true;
		}
		else 
		return false;
		
	}
	
	public void displayPlayers() {
		
		if(playerList.contains(name)) {
			System.out.println(playerList);
		}
		else
		{
			System.out.println("No Players to show");
		
	}
	
}}