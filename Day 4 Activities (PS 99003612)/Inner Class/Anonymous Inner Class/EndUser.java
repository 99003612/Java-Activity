
public class EndUser {

	public static void main(String[] args) 
	{
		SteamPopcorn sp= new SteamPopcorn();
		System.out.print("Color : ");
		sp.color();
		System.out.print("Taste : ");
		sp.taste();
		
		System.out.println("Anonymous Inner Class ");
		SteamPopcorn sp2 = new SteamPopcorn() //anonymous Inner Class
		{
			public void taste()
			{
				System.out.println("Sweet Steam Popcorn");
			}
			
		};
		System.out.print("Color : ");
		sp2.color();
		System.out.print("Taste : ");
		sp2.taste();

	}
}
