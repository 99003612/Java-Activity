import java.util.Scanner;
public class factorial {
	public static int fact(int i)
	{
		if (i==0 || i==1)
			return 1;
		else
			return i*fact(i-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer");
		int x=sc.nextInt();
		int	fact=1;
		int d;
		int factorial[]=new int[5];
		String st=Integer.toString(x);
		if(x>32767)
		{
		   System.out.println("Number too large");
		}
		else if(x<0)
		{
		System.out.println("Number too small");
		}
		else
		{
			int i=0;
			while(x>0)
			{
				int num=x%10;
				factorial[i]=fact(num);
				i++;
				x=x/10;
			
			}
		int len=st.length();
	    for(int j=len-1;j>=0;j--)
	    System.out.println(factorial[j]);
		
		}
	}
}




