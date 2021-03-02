import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ComMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Player> ls=new ArrayList<Player>();
		System.out.println("Please provide the number of players to be registered");
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++)
		{
			sc.nextLine();
			System.out.println("Please enter player name");
			String name=sc.nextLine();
			
			String skill = null;
			System.out.println("Please select the skill of the player\r\n"+ "1.All Rounder\r\n"+ "2.Batsman\r\n"+ "3.Bowler\r\n"+ "");
			int sk=sc.nextInt();
			if(sk==1)
			{
				skill="All Rounder";
				
			}
			else if(sk==2)
			{
				skill="Batsman";
			}
			else if(sk==3)
			{
				skill="Bowler";
			}
			
			ls.add(new Player(name,skill));
		}
		Collections.sort(ls,new PlayerComparator());
		for(Player e:ls)
		{
			System.out.println(e);
		}
		
	}

}

