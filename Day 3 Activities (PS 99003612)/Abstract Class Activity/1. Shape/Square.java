import java.util.*;
public class Square extends Shape
{
	
	public void calculateArea(int value) 
	{
		
		Scanner scn = new Scanner(System.in);
		//s.setShape(value1);
		float area = (value*value);
		
		System.out.println("Area of Square is: "+String.format("%.2f",area));
	}
}
