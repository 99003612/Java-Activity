import java.util.ArrayList;
import java.util.Scanner;

public class activityarraylist4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		ArrayList<Integer> arr=new ArrayList<Integer>();//genesis
		System.out.println("Gayle Record ");
		System.out.println("Enter the number of matches:");
		int n= s.nextInt();
		System.out.println("Enter the score in each of the "+n+" matches");
		for(int i =0; i<n;i++)
		{
			arr.add(s.nextInt());
		}
		
		for(Integer h:arr)
			System.out.println(h);
		int count = 0; 
		int count1 = 0;
		for (Integer num : arr) 
		{ 		      
	           if(num>=50 && num<100)
	           {
	        	   count++;
	           }
	           if(num>50 && num>=100)
	           {
	        	   count1++;
	           }
	    }
		System.out.println("Number of fifties: "+count);
		System.out.println("Number of hundreds: "+count1);
		
		
	
	}

}
