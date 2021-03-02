import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapPlayerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Wicket> w = new ArrayList<Wicket>();
		Scanner sc = new Scanner(System.in);
		HashMap<Bowler,Wicket> hm = new HashMap<Bowler,Wicket>();
		
		boolean b = true;
		
		
	
			System.out.println("Enter the player name ");
			String bname = sc.nextLine();
			
		//HashMap<Bowler,Wicket> hm = new HashMap<Bowler,Wicket>();
			
			Bowler b1 = new Bowler(bname);
		
			hm.put(b1,null);
		
			System.out.println("Enter wickets - seperated by | symbol. ");
			hm.put(b1, new Wicket(sc.nextLine(), b1));
		
			System.out.println("Do you want to add another player(YES/NO");
			boolean c = sc.nextBoolean();
		
		
			
		
		
		Wicket w1 = hm.get(b1);
		
		String bow=b1.getName(); 
		
		String w2= w1.getPlayerName();
		
		String [] wrr = w2.split("\\|");
		System.out.println(wrr[0]);
		System.out.println(b1.toString());
		System.out.println("Enter the player name to search ");
		
		String ser = sc.next();
		//System.out.println(wrr[0]);
		int count = 0 ;
		int a = 0;
	if(ser.equals(bow))
			{
	
			
			for(String e:wrr)
			{
				
				a = wrr.length;
			
			}
		
			System.out.println(a);
		//for (int i =0; i<wrr.length;i++){
			
			
			//System.out.println(wrr[i]);
			
		}
//		else
//		{
//			System.out.println(w2);
//		}
//		}
//		
//		
}	
}
		