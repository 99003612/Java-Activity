import java.util.Date;


public class Matchclass implements Comparable<Matchclass> {
	Date date = new Date();
	String teamOne;
	String teamtwo;
	
	public Matchclass() {
		super();
	}
	public Matchclass(Date date, String teamOne, String teamtwo) {
		super();
		this.date = date;
		this.teamOne = teamOne;
		this.teamtwo = teamtwo;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getTeamOne() {
		return teamOne;
	}
	public void setTeamOne(String teamOne) {
		this.teamOne = teamOne;
	}
	public String getTeamtwo() {
		return teamtwo;
	}
	public void setTeamtwo(String teamtwo) {
		this.teamtwo = teamtwo;
	}
	@Override
	public int compareTo(Matchclass arg0) {
		return date.compareTo(arg0.getDate());
	}
	@Override
	public String toString() {
		return "date=" + date + ", teamOne=" + teamOne + ", teamtwo=" + teamtwo;
	}
	
	
	
	
	
	
}