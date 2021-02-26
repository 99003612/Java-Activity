import java.util.*;
public class ShapeMain 
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Circle");
		System.out.println("Square");
		System.out.println("Enter the Shape:");
		String s = scn.next();
		if (s.equals("Circle"))
		{
			Circle c = new Circle();
			System.out.println("Enter the radius");
			int r = scn.nextInt();
			c.calculateArea(r);
			
		}
	
		if (s.equals("Square"))
		{
			Square t = new Square();
			System.out.println("Enter the side");
			int r = scn.nextInt();
			t.calculateArea(r);
			
		}
	
	
	
	}

}
