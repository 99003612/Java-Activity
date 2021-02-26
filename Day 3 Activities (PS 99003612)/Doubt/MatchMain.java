import java.util.*;
public class MatchMain 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the match format");
	
		System.out.println("1. ODI");
		System.out.println("2. T20");
		System.out.println("3. Test");
		
		int n = s.nextInt();
		
		if(n==1)
		{
			System.out.println("Enter the Current Score:");
			int cs = s.nextInt();
			ODIMatch o = new ODIMatch();
			o.setCurrentscore(cs);
			
			System.out.println("Enter the current Over:");
			int co = s.nextInt();
			o.setCurrentover(co);
			
			System.out.println("Enter the Target Score:");
			int ts = s.nextInt();
			o.setTarget(ts);
			
			o.calculateRunRate();
			o.calculateBalls();
			o.display(cs, co);
		}
		
		if(n==2)
		{
			System.out.println("Enter the Current Score:");
			int cs = s.nextInt();
			T20Match t = new T20Match();
			t.setCurrentscore(cs);
			
			System.out.println("Enter the current Over:");
			int co = s.nextInt();
			t.setCurrentover(co);
			
			System.out.println("Enter the Target Score:");
			int ts = s.nextInt();
			t.setTarget(ts);
			
			t.calculateRunRate();
			t.calculateBalls();
			t.display(cs, co);
		}
		
		if(n==3)
		{
			System.out.println("Enter the Current Score:");
			int cs = s.nextInt();
			TestMatch m = new TestMatch();
			m.setCurrentscore(cs);
			
			System.out.println("Enter the current Over:");
			int co = s.nextInt();
			m.setCurrentover(co);
			
			System.out.println("Enter the Target Score:");
			int ts = s.nextInt();
			m.setTarget(ts);
			
			
			m.calculateRunRate();
			m.calculateBalls();
			m.display(cs,co);
		}
	}
	

}
