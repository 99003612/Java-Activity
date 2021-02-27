public class employee 
{
	private String name;
	private String address;
	private String mobile;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	
	public String getMobile()
	{
		return mobile;
	}
	public void setMobile(String mob)
	{
		mobile = mob;
	}
	
	
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public void Display()
	{
		System.out.println("Employee Details");
		System.out.println("Name: " + getName() );
		System.out.println("Address: " + getAddress() );
		System.out.println("Mobile: " + getMobile() );
		
		
	}



}
