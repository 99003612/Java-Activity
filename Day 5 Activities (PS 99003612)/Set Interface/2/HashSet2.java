import java.util.*;

public class HashSet2 {

	public static void main(String[] args) {
		
		HashSet<String> h= new HashSet<String>();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of players");
		int t=sc.nextInt();
		System.out.println("Enter the name of players");
		for(int i=0;i<t;i++)
		{
			h.add(sc.next());
		}
		
		TreeSet<String> treeSet = new TreeSet<String>(h);
		
		System.out.println(treeSet);
		
		
	}
}
