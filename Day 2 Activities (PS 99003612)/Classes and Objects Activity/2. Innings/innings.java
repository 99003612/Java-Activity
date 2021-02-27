public class innings 
{
	private String teamname;
	private String inningsname;
	private int runs;
	
	public String getTeam()
	{
		return teamname;
	}
	public void setTeam(String name)
	{
		teamname = name;
	}
	
	public String getInnings()
	{
		return inningsname;
	}
	public void setInnings(String innings)
	{
		inningsname = innings;
	}
	
	public int getRuns()
	{
		return runs;
	}
	public void setRuns(int runs)
	{
		this.runs = runs;
	}
	
	public void displayinningsdetails()
	{
		System.out.println("Name : "+getTeam());
		System.out.println("Scored : "+getRuns());
		if(inningsname.equals("First"))
		{
			System.out.println("Need "+ (runs+1) + " to win");
		}
		if(inningsname.equals("Second"))
		{
			System.out.println("Match Ended");
		}
		
	}
}
