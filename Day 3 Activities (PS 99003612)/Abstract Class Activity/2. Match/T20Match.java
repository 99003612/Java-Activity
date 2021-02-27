public class T20Match extends Match 
{
	double reqRunrate1 =0;
	@Override
	public float calculateRunRate() {
		
		
		reqRunrate1 = (getTarget()-getCurrentscore())/(20-getCurrentover());
		System.out.println("Required runrate is : " +((getTarget()-getCurrentscore())/(20-getCurrentover() )));
		
		return  (float) reqRunrate1;
	}

	@Override
	public int calculateBalls() {
		int co= getCurrentover();
		int balls = co*6;
		//System.out.println("Need "+(getTarget()-getCurrentScore())+" runs in "+((540-(getCurrentOver()*6)))) ;
		return balls;
	}


	@Override
	public void display(double reqRunrate, float balls) {
		
		reqRunrate = reqRunrate1;
		
		System.out.println("Need "+(getTarget()-getCurrentscore())+" runs in "+((120-(getCurrentover()*6)))+" balls") ;
		System.out.println("Required runrate is : " +String.format("%.2f",reqRunrate));
		
		
	}
}