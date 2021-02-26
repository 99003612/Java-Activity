
public class ODIMatch extends Match 
{	
	int balls1;
	float reqRunrate1;
	public float calculateRunRate()
	{
		float reqRunrate1 = ((getTarget()-getCurrentscore())/(50-getCurrentover()));
		System.out.println(reqRunrate1);
		return reqRunrate1;
	}
	
	public int calculateBalls()
	{
    	int ball = 50-getCurrentover();
    	balls1 = (ball * 6);
    	System.out.println(balls1); 
    	return balls1;
    }
	
	public void display(float reqRunrate, int balls) {
		balls= balls1;
		reqRunrate = reqRunrate1;
		int req = getTarget()-getCurrentscore();
		System.out.println("Requirements: ");
    	
    	System.out.println("Need "+req+" runs in "+balls+" balls");
    	
    	System.out.println("Required Runrate: "+String.format("%.2f",reqRunrate));
	}

}
