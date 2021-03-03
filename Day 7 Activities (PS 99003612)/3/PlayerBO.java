import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.lang.*;

public class PlayerBO 
{
		String a;
		String b;
		List<ClassPlayer> player1 = new ArrayList<ClassPlayer>();
		//ClassPlayer c = new ClassPlayer();
		public void findPlayer(List<ClassPlayer> player1,String nationality)
		{
			for(ClassPlayer e:player1)
			{
				if(e.getNationality().equals(e))
				{
					 a = e.getName();
					 System.out.println(a);
				}
		
			}
		}
		
		public  void findPlayer(List<ClassPlayer>player1,Date dateOfBirth)
		{
			for(ClassPlayer e1:player1)
			{
				if(e1.getDate1().equals(e1))
				{
					 b = e1.getName();
					 System.out.println(e1);
				}
			}
		}
		
//		public List<Player>findPlayer(List<ClassPlayer>playerList,Double power)
//		{
//			for(ClassPlayer e2:player1)
//			{
//				double d1=Double.parseDouble(e2); 
//				
//				if(Double.compare(e2.getPower(), e2) == 0)
//				{
//					 b = e2.getName();
//					 System.out.println(e2);
//				}
//			}
//		}
}