import java.util.*;

public class Arith {
	public static void perform_Arithmetic_Operation(int x,int y, int z)
	{
		int res=0;
		if(z==1 && x>0 && y>0 && x<32767 && y<32767)
		{
			res=x+y;
		}
		else if(z==2 && x>0 && y>0 && x<32767 && y<32767)
		{
			res=x-y;
		}
		else if(x==3 && x>0 && y>0 && x<32767 && y<32767)
		{
			res=x*y;
		}
		else if(x==4 && x>0 && y>0 && x<32767 && y<32767)
		{
			res=x/y;
		}
		else if(x<0 || y<0 || x>32767 || y>32767 || z>4 || z<=0)
		{
			res=-1;
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp=new Scanner(System.in);
		System.out.println("1st Number:");
		int x=inp.nextInt();
		System.out.println("2nd Number:");
		int y=inp.nextInt();
		System.out.println("1/2/3/4");
		int z=inp.nextInt();
		perform_Arithmetic_Operation(x,y,z);
	}

}
