import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapPlayerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Playerone> w = new ArrayList<Playerone>();
		Scanner sc = new Scanner(System.in);
		HashMap<Playerone> hm = new HashMap<Playerone	>();
		
		boolean b = true;
		
		boolean c = true;
		String result = Boolean.toString(c);
		
		
		boolean d = true;
		String result1 =Boolean.toString(d);
		
		
		
	
	
			System.out.println("Enter the player name: ");
			String bname = sc.nextLine();
			
			System.out.println("Enter the wicket count: ");
			int wcount = sc.nextInt();
			
		//HashMap<Bowler,Wicket> hm = new HashMap<Bowler,Wicket>();
			
			Playerone b1 = new Playerone(bname,wcount);
		
			hm.put(b1,null);
		
			System.out.println("Enter wickets - seperated by | symbol. ");
			hm.put(b1, new Playerone(sc.nextLine(), b1));
		
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
//		System.out.println(bow);
		String w2= w1.getPlayerName();
		
//		System.out.println(w2);
		String [] wrr = w2.split("\\|");
//		System.out.println(wrr[0]);
//		System.out.println(b1.toString());
		
		System.out.println("Enter the player name to search ");
		
		String ser = sc.next();
			//System.out.println(wrr[0]);
//		 for(int i=0;i<wrr.length;i++){
//			 System.out.println(wrr[i]);
//	            }    
//		int a =0;
		if(ser.equals(bow))
		{
			for(String e:wrr)
			{
				int a = wrr.length;
				System.out.println(a);	
				
			}
		}
			else
			{
				System.out.println("No Player found with the name "+ ser);
			
			}
	}
}
