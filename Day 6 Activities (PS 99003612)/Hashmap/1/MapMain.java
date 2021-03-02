import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.lang.Object.*;

public class MapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Wicket1> w = new ArrayList<Wicket1>();
		Scanner sc = new Scanner(System.in);
		HashMap<Bowler1,Wicket1> hm = new HashMap<Bowler1,Wicket1>();
		
		boolean b = true;
		
		boolean c = true;
		String result = Boolean.toString(c);
		
		
		boolean d = true;
		String result1 =Boolean.toString(d);
		
		
		
	
	
			System.out.println("Enter the player name ");
			String bname = sc.nextLine();
			
		//HashMap<Bowler,Wicket> hm = new HashMap<Bowler,Wicket>();
			
			Bowler1 b1 = new Bowler1(bname);
		
			hm.put(b1,null);
		
			System.out.println("Enter wickets - seperated by | symbol. ");
			hm.put(b1, new Wicket1(sc.nextLine(), b1));
		
			System.out.println("Do you want to add another player(YES/NO)");
			result = sc.next();
			if(result.equalsIgnoreCase("yes"))
			 {
				 c=true;
			 }
			 else
			 {
				 c=false;
			 }
			
			 while(c==true)
			 {
				
				 System.out.println("Enter the player name ");
				 bname = sc.nextLine();
				 sc.nextLine();
		
	//HashMap<Bowler,Wicket> hm = new HashMap<Bowler,Wicket>();
		
				 b1 = new Bowler1(bname);
	
				 hm.put(b1,null);
	
				 System.out.println("Enter wickets - seperated by | symbol. ");
				 hm.put(b1, new Wicket1(sc.nextLine(), b1));
	
				 System.out.println("Do you want to add another player(YES/NO)");
				 result = sc.nextLine();
				 if(result.equalsIgnoreCase("yes"))
				 {
					 c=true;
				 }
				 else
				 {
					 c=false;
				 }
						
			}
			 
			
		
		
		Wicket1 w1 = hm.get(b1);
		
		String bow=b1.getName(); 
		
		String w2= w1.getPlayerName();
		
		
		String [] wrr = w2.split("\\|");
//		System.out.println(wrr[0]);
//		System.out.println(b1.toString());
		
		System.out.println("Enter the player name to search ");
		
		String ser = sc.next();
			//System.out.println(wrr[0]);
		
		if(ser.equals(bow))
		{
			for(String e:wrr)
			{
				System.out.println(e);	
				
			}
		}
			else
			{
				System.out.println("No Player found with the name "+ ser);
			
			}
	}
}		