import java.util.Comparator;

public class PlayerComparator implements Comparator<Player> {


	@Override
	public int compare(Player o1, Player o2) {
		// TODO Auto-generated method stub
		if(o1.getSkill().compareTo(o2.getSkill())==0)
		{
			return o1.getName().compareTo(o2.getName());
		}
		else
			return o1.getSkill().compareTo(o2.getSkill());
	}

}


