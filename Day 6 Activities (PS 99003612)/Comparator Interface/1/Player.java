public class Player {
	private String name;
	private String skill;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSkill(String skill) {
		this.skill = skill;
		
		
	}
	public String getSkill() {
		return skill;
	}
	@Override
	public String toString() {
		return "name=" + name + " skill=" + skill;
	}
	public Player(String name, String skill) {
		super();
		this.name = name;
		this.skill = skill;
	}
	
}
