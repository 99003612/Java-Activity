import java.util.LinkedList;
import java.util.Scanner;

public class List3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		LinkedList<String> l1 = new LinkedList<String>();
		LinkedList<String> l2 = new LinkedList<String>();
		
		System.out.println("Enter the top 5 scorers of IPL Season 13: ");
		
		try{
		for (int i=0;i<=4;i++){
			l1.add(sc.next());
		
		}
		
		
		System.out.println("Enter the top 5 scorers of IPL Season 12: ");
		
		for (int i=0;i<=4;i++){
			l2.add(sc.next());
		
		}
		
		
		LinkedList<String> l3 = new LinkedList<String>();
        for (String e : l1)
           if(l2.contains(e)){
        	   l3.add(e);
           }
        
        for(int i=0;i<l3.size();i++){
        	
        System.out.println(l3.get(i));
		}
   
		
		
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Only five player allowed");
		}
		
		
		

	}

}

