package java6;

import java.util.Collections;
import java.util.*;
import java.util.List;

public class Team implements Comparable<Team>{

	private String name;
	private List<Player> playerList = new ArrayList<Player>(); ;
	public String getName() {
		return name;
	}
	
	
	public Team(String name) {
		super();
		this.name = name;
	}


	public void setName(String name) {
		this.name = name;
	}
	public List<Player> getPlayerList() {
		
		Collections.sort(playerList);
		return playerList;
	}
	public void setPlayerList(List<Player> playerList) {
		this.playerList = playerList;
	}
	
	public void addPlayer(String name) 
	{
		
		playerList.add(new Player(name));
	}
	@Override
	public int compareTo(Team o) {
		
		return name.compareTo(o.getName());
		
	}
	
}