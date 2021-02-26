
public class TestMatch extends Match 
{
	public float calculateRunRate()
	{
		int reqRunrate = (getCurrentscore()/getCurrentover());
		return reqRunrate;
	}
	
	public int calculateBalls()
	{
    	int balls = getCurrentover() * 6;
    	return balls;
    }
	
	public void display(double reqRunrate, int balls)
	{
    	System.out.println(reqRunrate);
    	System.out.println(balls);
    }
    
	
	 
}
