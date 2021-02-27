public class ODIMatch extends Match 
{	
	
	double reqRunratenum;
	double reqRunrateden;
	double reqRunrate1;
	@Override
	public float calculateRunRate() {
		
		
		reqRunratenum = (getTarget()-getCurrentscore());
		reqRunrateden = (50-getCurrentover());
		reqRunrate1 = reqRunratenum/reqRunrateden ;
		System.out.println("Required Run Rate is: "+String.format("%.2f",reqRunrate1));
		return (float) reqRunrate1 ;
	}

	@Override
	public int calculateBalls() {
		// TODO Auto-generated method stub
		int co= getCurrentover();
		int balls = co*6;
		//System.out.println("Need "+(getTarget()-getCurrentScore())+" runs in "+((540-(getCurrentOver()*6)))) ;
		return balls;
	}
	
	@Override
	public void display(double reqRunrate, float balls) 
	{
		reqRunrate = reqRunrate1;
		System.out.println("Need "+(getTarget()-getCurrentscore())+" runs in "+((300-(getCurrentover()*6)+" balls")));
		System.out.println("Required runrate is : " +String.format("%.2f",reqRunrate));
		
		
	}

}