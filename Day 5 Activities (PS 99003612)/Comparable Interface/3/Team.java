import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Team implements Comparable<Team> {
	
	private String name;
	private List<Player> playerList=new ArrayList<Player>();
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Player> getPlayerList() {
		return playerList;
	}

	
	public Team(String name) {
		super();
		this.name = name;
	}


	public void setPlayerList(List<Player> playerList) {
		this.playerList = playerList;
	}

	public void addPlayer(Player playername)
	{
		playerList.add(playername);
		
	}
	
	public List<Player> getPlayerList1()
	{
		Collections.sort(playerList);
		return playerList ;
	}
	@Override
	public int compareTo(Team o) {
		// TODO Auto-generated method stub
		return 0;
	}


	public List<Player> addPlayer1(String playername) {
		// TODO Auto-generated method stub
		playerList.add(playername);
		return playerList;
		
	}

}
