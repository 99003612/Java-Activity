
public abstract class Shape 
{
	private int value;
	
	public int getShape()
	{
		return value;
	}
	public void setShape(int s)
	{
		value = s;
	}
	
	public abstract void calculateArea(int value);

}
