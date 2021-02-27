import java.util.*;
public class Circle extends Shape 
{
	@Override
	public void calculateArea(int value)
	{
		
		Scanner scn = new Scanner(System.in);
		//s.setShape(value1);
		float area = (22 *(value*value)/7);
		System.out.println("Area of Circle is: " + String.format("%.2f",area));
		
	}

}
