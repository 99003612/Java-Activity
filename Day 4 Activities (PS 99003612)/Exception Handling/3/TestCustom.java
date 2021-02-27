import java.util.Scanner;

public class TestCustom {
	static String playerName;
	static int playerAge;
	
	public static void main(String[] args) throws CustomException1 {
		// TODO Auto-generated method stub
		
		
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Player details");
			System.out.println("Enter Player Name");
			playerName=sc.nextLine();
		
			System.out.println("Enter Player Age");
			playerAge=sc.nextInt();
		
			if(playerAge<19){
				throw new CustomException1("InvalidAgeRangeException");
			
			}
			else{
				System.out.println("Player Registered");
				System.out.println("Player Name: "+playerName);
				System.out.println("Player Age: "+playerAge);
			}
		
		}
		
		catch(CustomException1 ce)
		{
			System.out.println(ce);
		}

	}
}