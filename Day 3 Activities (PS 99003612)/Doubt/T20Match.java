
public class T20Match extends Match 
{
	public float calculateRunRate()
	{
		int reqRunrate = (getCurrentscore()/getCurrentover());
		return reqRunrate;
	}
	
	public int calculateBalls()
	{
    	int balls = 120-(getCurrentover() * 6);
    	return balls;
    }
	
	public void display(double reqRunrate, int balls)
	{
		int req = getCurrentscore()-getTarget();
		System.out.println("Requirements: ");
    	
    	System.out.println("Need"+req+"in"+balls);
    	
    	System.out.println("Required Runrate: "+reqRunrate);
    }
}
