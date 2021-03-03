import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class Player implements Comparator<Player> {

	private String name;
	private LocalDate dateOfBirth;
	private String skill;
	private int numberOfMatches;
	private int runs;
	private int wickets;
	private String nationality;
	private double powerRating;
	
	
	
	
	
	public Player() {
		super();
	}
	
	
	public Player(String name, LocalDate dateOfBirth, String skill, int numberOfMatches, int runs, int wickets,
			String nationality, double powerRating) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.skill = skill;
		this.numberOfMatches = numberOfMatches;
		this.runs = runs;
		this.wickets = wickets;
		this.nationality = nationality;
		this.powerRating = powerRating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public int getNumberOfMatches() {
		return numberOfMatches;
	}
	public void setNumberOfMatches(int numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public double getPowerRating() {
		return powerRating;
	}
	public void setPowerRating(double powerRating) {
		this.powerRating = powerRating;
	}
	
	public static Map<String,Integer> calculateNationalityCount(List<Player> list){
	
		int count=0;
		for(Player e: list)
		{
			String []arrr = new String[110];
			
			for(int i=0;i<arrr.length;i++){
				
			
			arrr[i]= e.getNationality();
			for(int j=0;i<arrr.length;i++){
				if(arrr[i]==arrr[i+1]){
					count+=1;
					
				}
				
			}
			
			}
			
		}
		
		TreeMap tm = new TreeMap<>();
		
		//if(list.get(6)==)
		
			tm.put(list.get(6),count);
		
		
		System.out.println(tm.toString());
		
		return tm;
		
	}


	@Override
	public int compare(Player arg0, Player arg1) {
		
		
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public String toString() {
		return "Player [name=" + name + ", dateOfBirth=" + dateOfBirth + ", skill=" + skill + ", numberOfMatches="
				+ numberOfMatches + ", runs=" + runs + ", wickets=" + wickets + ", nationality=" + nationality
				+ ", powerRating=" + powerRating + "]";
	}
	
	
	
	
	
	
	
	
}
