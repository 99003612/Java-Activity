import java.util.*;
public class String1 
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the First Name: ");
	String n = sc.next();
	System.out.println("Enter the Last Name: ");
	String n1 = sc.next();
	
	String firstLetter = n.substring(0, 1);
    String remainingLetters = n.substring(1, n.length());

    // change the first letter to uppercase
    firstLetter = firstLetter.toUpperCase();
    remainingLetters = remainingLetters.toLowerCase();

    // join the two substrings
    n = firstLetter + remainingLetters;
    n1 = n1.toUpperCase();
    System.out.println( n + " "+ n1);
	}
}
