package java6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DisplayTeamMain {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of players..");
		int no=Integer.parseInt(br.readLine());
		
		Set<Team> stteam=new TreeSet<Team>();
		String teamname;
		String playername;
		boolean b=false;
		for(int i=0;i<no;i++)
		{
			String str=br.readLine();
			String[] pro=str.split("\\|");
			teamname=pro[0];
			playername=pro[1];
			b=false;
			for(Team t:stteam) {
			
				if(t.getName().equals(teamname)) {
						t.addPlayer(playername);
						b=true;
				}
			}
			if(b==false) {
			
				Team t=new Team(teamname);
				t.addPlayer(playername);
				stteam.add(t);
			}
			
		}
		System.out.println("Team and Details");
		for(Team t:stteam) {
			System.out.println(t.getName());
			List<Player> li=t.getPlayerList();
			for(Player p:li) {
				System.out.println("--"+p.getName());
			}
		}
		
	}
}