import java.time.LocalDate;
import java.util.Date;  
public class ClassPlayer 
{
	private String name;
	private LocalDate date1;
	private String skill;
	private int number;
	private int runs;
	private int wickets;
	private String nationality;
	private double power;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDate1() {
		return date1;
	}
	public void setDate1(LocalDate date1) {
		this.date1 = date1;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
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
	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		this.power = power;
	}
	
	//Default Constructor
	public ClassPlayer() {
		super();
	}
	
	//Parameterized constructor
	public ClassPlayer(String name, LocalDate date1, String skill, int number, int runs, int wickets,
			String nationality, double power) {
		super();
		this.name = name;
		this.date1 = date1;
		this.skill = skill;
		this.number = number;
		this.runs = runs;
		this.wickets = wickets;
		this.nationality = nationality;
		this.power = power;
	}
	
	

}
