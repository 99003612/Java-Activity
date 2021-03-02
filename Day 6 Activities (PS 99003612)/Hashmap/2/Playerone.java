public class Playerone 
{
	private String bowlername;
	private int wicketCount;

	
	
	public Playerone(String bowlername, int wicketCount) {
		super();
		this.bowlername = bowlername;
		this.wicketCount = wicketCount;
	}

	public String getName() {
		return bowlername;
	}

	public void setName(String bowlername) {
		this.bowlername = bowlername;
	}

	@Override
	public String toString() {
		return "Bowler [name=" + bowlername + "]";
	}
}	