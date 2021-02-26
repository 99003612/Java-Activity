
public abstract class Match {
	private int currentscore;
	private int currentover;
	private int target;
	
	public int getCurrentscore() {
		return currentscore;
	}
	public void setCurrentscore(int currentscore) {
		this.currentscore = currentscore;
	}
	public int getCurrentover() {
		return currentover;
	}
	public void setCurrentover(int currentover) {
		this.currentover = currentover;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	
	
	public abstract float calculateRunRate();
	
    public abstract int calculateBalls();
    
    
    public abstract void display(float reqRunrate, int balls);
    
    
}
