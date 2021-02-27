import java.util.*;
public class CompanyMain 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Company Name: ");
		String n = sc.nextLine();
		
		System.out.println("Enter the employees: ");
		String em = sc.nextLine();
		String[] arr = em.split(",");
		
		System.out.println("Enter Team Lead: ");
		String tl = sc.nextLine();
		
		Company c = new Company();
		c.setName(n);
		c.setemp(em);
		c.setTL(tl);
		
		c.Display();
		
	}

}
