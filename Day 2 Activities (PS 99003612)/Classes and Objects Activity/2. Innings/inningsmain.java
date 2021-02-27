import java.util.*;
public class inningsmain 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the team name:");
		String name = sc.next();
		
		System.out.println("Enter session:");
		String session = sc.next();
		
		System.out.println("Enter runs:");
		int run = sc.nextInt();
		
		innings q = new innings();
		q.setTeam(name);
		
		q.setInnings(session);
		
		q.setRuns(run);
		
		q.displayinningsdetails();
		
		
	}

}
