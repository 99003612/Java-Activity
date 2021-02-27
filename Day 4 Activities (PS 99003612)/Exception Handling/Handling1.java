import java.io.*;
import java.util.*;
import java.lang.*;
public class Handling1{
	public static void main(String[] args) throws Exception
	{
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		int runs, over;
		float runRate = 0;
		
		
		
        try{
        	
        	System.out.println("Enter Runs Scored: ");
            runs=Integer.parseInt(reader.readLine());
            System.out.println("Enter Balls Delivered: ");
            over=Integer.parseInt(reader.readLine());
            runRate=runs/over;
            System.out.println("Current Run Rate : "+(float)runRate);
        }
        catch(ArithmeticException a)
        {
            System.out.println(a.getClass().getName());
            System.exit(0);
        }
        
        catch(NumberFormatException e){
           System.out.println(e);
           System.exit(0);
       }
      
    }
}
