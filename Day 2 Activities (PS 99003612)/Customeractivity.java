public class Customeractivity 
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
		address=add;
	}
	
	public String getMob()
	{
		return mobile;
	}
	public void setMob(String mob)
	{
		mobile = mob;
	}
	
	public void display()
	{
		System.out.println("Name: "+getName());
		System.out.println("Address: "+getAdd());
		System.out.println("Mobile: "+getMob());
		
	}





}



