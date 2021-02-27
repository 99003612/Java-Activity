import java.util.*;
import java.lang.*;
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
			Match o = new ODIMatch();
			o.setCurrentscore(cs);
			float f = cs;
			
			System.out.println("Enter the current Over:");
			int co = s.nextInt();
			o.setCurrentover(co);
			float f1 = co;
			
			System.out.println("Enter the Target Score:");
			int ts = s.nextInt();
			o.setTarget(ts);
			float f2 = ts;
			
			float f3 = (float)(300-(co*6));
			
			
			
			o.calculateRunRate();
			o.calculateBalls();
			o.display((f2-f)/f1, (f3));
		}
		
		if(n==2)
		{
			System.out.println("Enter the Current Score:");
			int cs = s.nextInt();
			float f = cs;
			Match t = new T20Match();
			t.setCurrentscore(cs);
			
			System.out.println("Enter the Current Over:");
			int co = s.nextInt();
			float f1 = co;
			t.setCurrentover(co);
			
			System.out.println("Enter the Target Score:");
			int ts = s.nextInt();
			float f2 = ts;
			t.setTarget(ts);
			
			float f3 = (float)(120-(co*6));
			
			
			
			t.calculateRunRate();
			t.calculateBalls();
			t.display((f2-f)/f1, (f3));
		}
		
		if(n==3)
		{
			System.out.println("Enter the Current Score:");
			int cs = s.nextInt();
			Match m = new TestMatch();
			m.setCurrentscore(cs);
			float f = cs;
			
			System.out.println("Enter the current Over:");
			int co = s.nextInt();
			m.setCurrentover(co);
			float f1 = co;
			
			
			System.out.println("Enter the Target Score:");
			int ts = s.nextInt();
			m.setTarget(ts);
			float f2 = ts;
			
			float f3 = (float)(120-(co*6));
			
			
			
			m.calculateRunRate();
			m.calculateBalls();
			m.display((f2-f)/f1, (f3));
		}
	}
	

}