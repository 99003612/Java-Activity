public class Playerone 
{
	private String bowlername;
	private int wicketCount;

	
	
	public String getBowlername() {
		return bowlername;
	}

	public void setBowlername(String bowlername) {
		this.bowlername = bowlername;
	}

	public int getWicketCount() {
		return wicketCount;
	}

	public void setWicketCount(int wicketCount) {
		this.wicketCount = wicketCount;
	}

	public Playerone(String bowlername, int wicketCount) {
		super();
		this.bowlername = bowlername;
		this.wicketCount = wicketCount;
	}

	
	@Override
	public String toString() {
		return "Playerone [bowlername=" + bowlername + ", wicketCount=" + wicketCount + "]";
	}
}	