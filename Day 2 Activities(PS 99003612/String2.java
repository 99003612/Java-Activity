
import java.util.Scanner;
public class String2 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Player's Name: ");
		String n = sc.nextLine();
		System.out.println("Enter the Second Player's Name: ");
		String n1 = sc.nextLine();
	
		String[] arrSplit = n.split(" ");
    
		String[] arrSplit1 = n1.split(" ");
	
		if(arrSplit[1].equals(arrSplit1[1]))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}

	}
}
