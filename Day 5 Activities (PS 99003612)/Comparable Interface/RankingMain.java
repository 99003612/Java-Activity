import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RankingMain {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		ArrayList<Ranking> arr= new ArrayList<Ranking>();
		
		System.out.println("Enter the number of players");
		int p=sc.nextInt();
		
		for(int i=0;i<p;i++)
		{
			System.out.println("ENTER THE NAME OF PLAYER "+(i+1));
			String str=sc.next();
			
			System.out.println("ENTER THE SCORE OF PLAYER "+(i+1));
			int scr=sc.nextInt();
			
		arr.add(new Ranking(str,scr));
		}
		
		Collections.sort(arr);
		for(Ranking r:arr)
		{
			System.out.println(r);
		}
		
		

	}

}
