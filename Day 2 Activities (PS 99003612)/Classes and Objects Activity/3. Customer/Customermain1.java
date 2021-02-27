import java.util.*;
public class Customermain1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details");
		String det = sc.nextLine();
		String[] arrSplit = det.split(",");
		
		Customeractivity ca = new Customeractivity();
		ca.setName( arrSplit[0]);
		
		ca.setAdd(arrSplit[1]);
		
		ca.setMob(arrSplit[2]);
		
		ca.display();
	
	}

}
