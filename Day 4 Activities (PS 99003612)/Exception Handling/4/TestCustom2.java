import java.util.Scanner;

public class TestCustom2 {

	static String teamName1;
	static String teamName2;
	
	public static void main(String[] args) throws TeamNameNotFound {
		
	
		
		
		
		
		try 
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the expected winner team of IPL Season 13");
			
			teamName1=sc.nextLine();
			
		if((teamName1.equalsIgnoreCase("Chennai Super Kings")|| teamName1.equalsIgnoreCase("Sun Risers Hyderabad")|| teamName1.equalsIgnoreCase("Delhi Capitals")|| teamName1.equalsIgnoreCase("Kings XI Punjab")|| teamName1.equalsIgnoreCase("Kolkata Knight Riders") || teamName1.equalsIgnoreCase("Mumbai Indians")|| teamName1.equalsIgnoreCase("Rajasthan Royals") || teamName1.equalsIgnoreCase("Royal Challengers Bangalore"))) 
		{
			//System.out.println("Expected IPL Season 13 winner: "+teamName1);
		}
		else
		{
			throw new TeamNameNotFound("Entered team is not a part of IPL Season 13");
		}
		
		System.out.println("Enter the expected runner Team of IPL Season 13");
		
		teamName2=sc.nextLine();
		
		if((teamName2.equalsIgnoreCase("Chennai Super Kings")|| teamName2.equalsIgnoreCase("Sun Risers Hyderabad")|| teamName2.equalsIgnoreCase("Delhi Capitals")|| teamName2.equalsIgnoreCase("Kings XI Punjab")|| teamName2.equalsIgnoreCase("Kolkata Knight Riders") || teamName2.equalsIgnoreCase("Mumbai Indians")|| teamName2.equalsIgnoreCase("Rajasthan Royals") || teamName2.equalsIgnoreCase("Royal Challengers Bangalore")))
		{
			System.out.println("Expected IPL Season 13 winner: "+teamName1);
			System.out.println("Expected IPL Season 13 runner: "+teamName2);
		}
		else
		{
			throw new TeamNameNotFound("Entered team is not a part of IPL Season 13");
		}
		}
		catch(TeamNameNotFound t)
		{
			System.out.println(t);
		}
		
		// TODO Auto-generated method stub

	}

}