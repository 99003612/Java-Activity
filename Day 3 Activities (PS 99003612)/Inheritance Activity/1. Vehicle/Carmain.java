import java.util.*;
public class Carmain {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		Vehicle v = new Vehicle(null, null, null, 0, 0);
		TwoWheeler t = new TwoWheeler(null, null, null, 0, 0, null);
		FourWheeler f = new FourWheeler(null, null, null, 0, 0, null, 0);
		System.out.println("1. Four Wheeler");
		System.out.println("2. Two Wheeler");
		System.out.println("Enter Vehicle Type:");
		int no = s.nextInt();
		if(no==1)
		{
			System.out.println("Vehicle Make:");
			String mk = s.next();
			
			v.setMake(mk);
			
			System.out.println("Vehicle Number:");
			String vm = s.next();
			
			v.setVehicleNumber(vm);
			
			System.out.println("Fuel Type:");
			System.out.println("1. Petrol");
			System.out.println("2. Diesel");
			int ft = s.nextInt();
			if(ft==1)
			{
				v.setFuelType("Petrol");
			}
			if(ft==2)
			{
				v.setFuelType("Diesel");
			}
			
			System.out.println("Fuel Capacity:");
			int fc= s.nextInt();
			
			v.setFuelCapacity(fc);
			
			System.out.println("Engine CC:");
			int cc= s.nextInt();
			
			v.setCc(cc);
			
			System.out.println("Audio System:");
			String as = s.next();
			
			f.setAudioSystem(as);
			
			System.out.println("Number of Doors:");
			int d = s.nextInt();
			
			f.setNumberOfDoors(d);
			
			v.displayMake();
			v.displayBasicInfo();
			f.displayDetailInfo();
			
			
		}
		
		if(no==2)
		{
			System.out.println("Vehicle Make:");
			String mk = s.next();
			
			v.setMake(mk);
			
			System.out.println("Vehicle Number:");
			String vm = s.next();
			
			v.setVehicleNumber(vm);
			
			System.out.println("Fuel Type:");
			System.out.println("1. Petrol");
			System.out.println("2. Diesel");
			int ft = s.nextInt();
			if(ft==1)
			{
				v.setFuelType("Petrol");
			}
			if(ft==2)
			{
				v.setFuelType("Diesel");
			}
			
			System.out.println("Fuel Capacity:");
			int fc= s.nextInt();
			
			v.setFuelCapacity(fc);
			
			System.out.println("Engine CC:");
			int cc= s.nextInt();
			
			v.setCc(cc);
			
			System.out.println("Kick Start Available(Yes/No):");
			String as = s.next();
			
			t.setKickStartAvailable(as);
			

			
			v.displayMake();
			v.displayBasicInfo();
			t.displayDetailInfo();
			
			
		}
		
	}

}
