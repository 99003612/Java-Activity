import java.util.*;
import java.lang.*;

public class activityarraylist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		ArrayList<String> arr=new ArrayList<String>();//genesis
		System.out.println("Enter the player details");
		System.out.println("Enter player name");
		String str= s.next();
		arr.add(str);
		System.out.println("Enter age");
		String var = s.next();
		arr.add(var);
		s.nextLine();
		System.out.println("Enter Country");
		String str1= s.next();
		arr.add(str1);
		System.out.println("Player details");
		for(String h:arr)
			System.out.println(h);
		System.out.println("Enter Skill");
		String str4= s.next();
		if(str4.equalsIgnoreCase("Batsman") || str4.equalsIgnoreCase("Bowler") || str4.equalsIgnoreCase("AllRounder")||str4.equalsIgnoreCase("Wicket Keeper") )
		{
			arr.add(str4);
		}
		System.out.println("Enter the position to add the skill");
		int n1 = s.nextInt();
		arr.set(n1,str4);
		System.out.println("Player Details");
		for(String h:arr)
			System.out.println(h);
		System.out.println("Enter the position of the detail to be removed");
		int n = s.nextInt();
		arr.remove(n);
		System.out.println("Player details");
		for(String h:arr)
			System.out.println(h);
	}

}
