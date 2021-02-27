import java.util.Scanner;

public class TestCustom {
	static String playerName;
	static int playerAge;
	
	public static void main(String[] args) throws CustomException1 {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Player details\nEnter Player Name");
		playerName=sc.nextLine();
		
		System.out.println("Enter Player Age");
		playerAge=sc.nextInt();
		
		if(playerAge<19){
			throw new CustomException1();
			
		}
		else{
			System.out.println("Player registered");
			System.out.println("Player Name "+playerName);
			System.out.println("Player Age "+playerAge);
			
		}
		
		
		
	}

}