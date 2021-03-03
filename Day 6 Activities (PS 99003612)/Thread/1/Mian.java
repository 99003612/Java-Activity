import java.util.Scanner;

public class Mian {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		Scanner s= new Scanner(System.in);
       

		System.out.println("Enter the Match ");
        String str=s.nextLine();
        System.out.println("Enter the Scores");
        String str1=s.nextLine();
        Thread t3=new SortScore(str,str1);
        
		//t3.sleep(100000);
        
        System.out.println("Enter the Match ");
        String strr1=s.nextLine();
        System.out.println("Enter the Scores");
        String str11=s.nextLine();
        Thread t2=new SortScore(strr1,str11);
        
        //t2.sleep(100000);
		
        System.out.println("Enter the Match ");
        String str2=s.nextLine();
        System.out.println("Enter the Scores");
        String str12=s.nextLine();
        Thread t1=new SortScore(str2,str12);
        
	//	t1.sleep(100000);
        
        t3.start();
        System.out.println("Match: "+ str);
		t3.join();
		
		
		t2.start();
		System.out.println("Match: "+strr1);
		t2.join();
		
		t1.start();
		System.out.println("Match: "+str2);
		t1.join();

		
		
		
	}

}
