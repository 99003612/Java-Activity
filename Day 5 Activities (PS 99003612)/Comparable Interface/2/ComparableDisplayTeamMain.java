package java6;

import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;

public class ComparableDisplayTeammain {

	public static void main(String[] args) throws ParseException {
		boolean b = true;
		Scanner s=new Scanner(System.in);
		ArrayList<Matchclass> arr=new ArrayList<Matchclass>();
		System.out.println("Enter the number of matches");
		int n = s.nextInt();
		for(int i=0;i<n;i++)
		{  
			
	System.out.println("Enter  match date in (MM-dd-yyyy) ");
	String d=s.next();
	Date d1=new SimpleDateFormat("dd/MM/yyyy").parse(d);
	System.out.println("Enter Team 1 ");
	String n1=s.next();
	System.out.println("Enter Team 2 ");
	String n2=s.next();
	arr.add(new Matchclass(d1,n1,n2));	
		}
	Collections.sort(arr);
	
	for(Matchclass lse:arr)
		System.out.println(lse);
}
}
