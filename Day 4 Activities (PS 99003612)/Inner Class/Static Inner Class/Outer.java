import java.lang.*;
public class Outer 
{
	int a =10;

	class Inner
	{
		int a = 100;
		public void m1()
		{
			System.out.println("I am inner class");
			int a = 1000;
			System.out.println("Inner Method Value: "+ a);
			System.out.println("Inner Class Value: "+ this.a);
			//System.out.println(o1.a);
			//System.out.println(Inner.o.a);
		}
	}
	
	public static void main(String[] args)
	{
		Outer o = new Outer();
		//Outer.Inner oi = o.new Inner().m1();
		
		System.out.println("Outer Value of a: " + o.a);
		
		//o.new Inner().a;
		new Outer().new Inner().m1();
	}

	
}
