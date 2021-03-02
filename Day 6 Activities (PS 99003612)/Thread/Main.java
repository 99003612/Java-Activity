import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		Scanner s= new Scanner(System.in);
       

		System.out.println("Enter the Match ");
        String str=s.next();
        System.out.println("Enter the Scores");
        String str1=s.nextLine();
        Thread t3=new SortScore(str,str1);
        t3.start();
		t3.sleep(100000);
        
        System.out.println("Enter the Match ");
        String strr1=s.next();
        System.out.println("Enter the Scores");
        String str11=s.nextLine();
        Thread t2=new SortScore(strr1,str11);
        t2.start();
        t2.sleep(100000);
		
        System.out.println("Enter the Match ");
        String str2=s.next();
        System.out.println("Enter the Scores");
        String str12=s.nextLine();
        Thread t1=new SortScore(str2,str12);
        t1.start();
		t1.sleep(100000);
        
		
//		SortScore s = new SortScore(null, null);
//		
//		System.out.println("Enter the Match : ");
//		
//		Thread s1 = new SortScore(sc.next(),s.getScoreString());
//		
//		
//		//SortScore s = new SortScore(null, null);
//		
//		System.out.println("Enter the Scores : ");
//		s.setScoreString(sc.next());
//		 
//		//String ss= s.getScoreString();
//		
//		System.out.println(s1);
//		s.start();
		
		
		
		
		
		
		
		
		
		//s.setScoreString(sc.next());
		//Thread t1 = new Thread();
		//t1.start();
		
		
		
		
		
	}

}