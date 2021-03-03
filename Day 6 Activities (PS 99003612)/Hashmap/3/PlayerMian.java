import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class PlayerMian {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		TreeMap<Integer,Player1> map=new TreeMap<Integer,Player1>();
		
		System.out.println("Enter the number of players:");
		int n=sc.nextInt();
//		sc.nextLine();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the details of player " + (i+1));
			
		    int capn=sc.nextInt();
		    sc.nextLine();
		    String name=sc.nextLine();
		    
		    String team=sc.nextLine();
		    
		    String skill=sc.nextLine();
		    
		    //sc.nextLine();
		    
		    Player1 p=new Player1();
		    p.setName(name);
		    p.setTeam(team);
		    p.setSkill(skill);
		    map.put(capn, p);
		    
		}
		
            System.out.println("Player details:\n");
            Set<Map.Entry<Integer,Player1>>entries=map.entrySet();
            for(Map.Entry<Integer,Player1>entry:entries) {
            	 System.out.println(entry.getKey()+"--"+entry.getValue());
            }
	        }
	}


