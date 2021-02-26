import java.util.Scanner;
public class Count_Occurrence
{
		public static void findElementCount()
		{
			int n, x, count = 0, i = 0;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter no. of elements you want in array:");
	        n = s.nextInt();
	        if (n>0)
	        {
	        	int a[] = new int[n];
	 	       
	        	System.out.println("Enter all the elements:");
	        
	        	for(i = 0; i < n; i++)
	        	{
	        		a[i]= s.nextInt();
	        		k:
	        		if (a[i]<0) 
	        		{

	        			System.out.println("Invalid Input");
	        			break k;
	        					
	        		}
	        	}
	        	
	        	for(i = 0; i < n; i++)
	        	{
	        		if(a[i]>0)
	        		{
	        			System.out.print("Enter the element of which you want to count number of occurrences:");
	    	        	x = s.nextInt();
	    	        	if(a[i] == x)
	    	        	{
	    	        		count++;
	    	        	}
	        		}
	        		System.out.println("Number of Occurrence of the Element:" + count);
	        	}
	        }
	        else 
	        {
	        	System.out.print("Invalid Input");
	        }
	        k:;
	       }
	        
			
	    public static void main(String[] args) 
	    {
	    	findElementCount();
	        
	    }
}
