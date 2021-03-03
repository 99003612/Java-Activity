import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Playermain {
String name;
Date dateOfBirth;
String skill;
int numberOfMatches;
int runs;
int wickets;
String nationality;
double powerRating;
public Playermain(String name, Date dateOfBirth, String skill, int numberOfMatches, int runs, int wickets,
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
public Playermain(String name2, String string, String skill2, String string2, String string3, String string4,
		String nationality2, String string5) throws ParseException {
	// TODO Auto-generated constructor stub
	this.name = name2;
	  SimpleDateFormat formatter1=new SimpleDateFormat("dd-MM-yyyy");  
	  Date date1=formatter1.parse(string);
	  this.dateOfBirth=date1;
	  this.skill = skill2;
	  this.numberOfMatches = Integer.parseInt(string2);
	  this.runs =  Integer.parseInt(string3);
	  this.wickets = Integer.parseInt(string4);
	  this.nationality = nationality2;
	  this.powerRating =Double.parseDouble(string5);
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Date getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(Date dateOfBirth) {
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
public static Playermain createPlayer(String detail) throws ParseException {
	String[] st=detail.split(",");
	Playermain P=new Playermain(st[0],st[1],st[2],st[3],st[4],st[5],st[6],st[7]);
	return P;
	
}
}