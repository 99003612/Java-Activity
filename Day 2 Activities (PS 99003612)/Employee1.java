import java.util.*;
public class Employee1
{
	private String name;
	private String address;
	private String mobile;
	
	public String getName()
	{
		return name;
	}
	public void setName(String nam)
	{
		name = nam;
	}
	public String getAdd()
	{
		return address;
	}
	public void setAdd(String add)
	{
		address = add;
	}
	public String getMob()
	{
		return mobile;
	}
	public void setMob(String mob)
	{
		mobile = mob;
	}
	
	public void Display()
	{
		System.out.println("Employee Details" );
		System.out.println("Name: "+ getName());
		System.out.println("Address: "+getAdd());
		System.out.println("Mobile: "+getMob());
		
	}
	
	public void Update()
	{
		System.out.println("Verify and Update the Details : ");

		System.out.println("Menu ");

		System.out.println("1.	Update Employee name");

		System.out.println("2.	Update Employee Address ");

		System.out.println("3.	Update Employee mobile ");
		
		System.out.println("4.	All information correct/Exit ");
		
		System.out.println("1/2/3/4");
		
		Scanner scn = new Scanner(System.in);
		
		int s = scn.nextInt();
		
		if(s==4)
		{
			Display();
		}
		else
		{
			if(s==1)
		{
				System.out.println("Current Name is: "+getName());
				System.out.println("Enter the Update Name: " );
				String name = scn.next();
				setName(name);
				Update();
				
			}
			else if(s==2)
			{
				System.out.println("Current Address is: "+getAdd());
				System.out.println("Enter the Update Address: " );
				String ad = scn.next();
				setAdd(ad);
				Update();
				
			}
			else if(s==3)
			{
				System.out.println("Current Mobile Number is: "+getMob());
				System.out.println("Enter the Update Mobile Number: " );
				String mo = scn.next();
				setMob(mo);
				Update();
				
			}
		}

	}
}
