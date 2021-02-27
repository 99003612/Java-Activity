import java.util.*;

public class Handling2 
{
	public static void main(String[] args) throws Exception
	{
		
		try
		{
			Scanner sc = new Scanner(System.in);
		
			System.out.println("Enter the number of overs");
			int overs = sc.nextInt();
			int [] arr = new int[overs];
		
			System.out.println("Enter the number of runs for each over : ");
			for (int i=0;i<overs;i++)
			{
			
				int no = sc.nextInt();
				arr[i]=no;
			
			}
		
			System.out.println("Enter the over number : ");
			int overno = sc.nextInt();
		    int a=arr[overno];
			int n=arr.length;
			
			
			for(int i =0;i<arr.length;i++) { if ((overno-1)== i) {
				System.out.println("Runs Scored in " + overno + " over " + arr[i]); } }
			 
		}
		catch(Exception a)
		{
			System.out.println(a.getClass().getName());
			System.exit(0);
			
		}
//		catch(NegativeArraySizeException n)
//		{
//			System.out.println(n);
//			System.exit(0);
//			
//		}
		

		
	}
	

}
