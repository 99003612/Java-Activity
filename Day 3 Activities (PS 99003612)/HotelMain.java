import java.util.*;

public class HotelMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Hotel Tariff Calculator\n");
		System.out.println("1.Deluxe Room\n");
		System.out.println("2. Deluxe AC Room\n");
		System.out.println("3. Suite AC Room\n");
		System.out.println("Select room type\n");
		
		int n = sc.nextInt();
		if(n==1){
			System.out.println("Enter Hotel name");
			DeluxeRoom d1= new DeluxeRoom(null, 0, false, false);
			
			d1.setHotelName(sc.next());
			System.out.println("Room Square Feet Area:");
			d1.setNumberofSqFeet(sc.nextInt());
			
			System.out.println("Room has TV (yes/no):");
			
			String s1 = sc.next();
			
			boolean b1=false;
			
			if(s1.equalsIgnoreCase("yes")){
			 b1 = true;
			 d1.setHasTV(b1);
			 
			}
			else if(s1.equalsIgnoreCase("no")){
				b1 = false;
				d1.setHasTV(b1);
			}
			
			System.out.println("Room has Wifi (yes/no):");
			
			String s = sc.next();
			
			boolean b=false;
			
			if(s.equalsIgnoreCase("yes")){
			 b = true;
			 d1.setHasWifi(b);
			 
			}
			else if(s.equalsIgnoreCase("no")){
				b = false;
				d1.setHasWifi(b);
			}
		
			
			
			
			
			
			//d1.setHasWifi(sc.nextBoolean());
		
			d1.getRatePerSqFeet();
			d1.calculateTarrif();
			
			
			
			
		}
		
		else if(n==2){
			System.out.println(" Enter Hotel name");
			DeluxeACRoom d2= new DeluxeACRoom(null, 0, false, false, 0);
			
			d2.setHotelName(sc.next());
			System.out.println("Room Square Feet Area:");
			d2.setNumberofSqFeet(sc.nextInt());
			
			System.out.println("Room has TV (yes/no):");
			
			String s1 = sc.next();
			
			boolean b1=false;
			
			if(s1.equalsIgnoreCase("yes")){
			 b1 = true;
			 d2.setHasTV(b1);
			 
			}
			else if(s1.equalsIgnoreCase("no")){
				b1 = false;
				d2.setHasTV(b1);
			}
			
			System.out.println("Room has Wifi (yes/no):");
			
			String s = sc.next();
			
			boolean b=false;
			
			if(s.equalsIgnoreCase("yes")){
			 b = true;
			 d2.setHasWifi(b);
			 
			}
			else if(s.equalsIgnoreCase("no")){
				b = false;
				d2.setHasWifi(b);
			}
		
			
			
			
			
			
			//d1.setHasWifi(sc.nextBoolean());
		
			d2.getRatePerSqFeet();
			d2.calculateTarrif();
			
			
			
			
		}
		else if(n==3){
			System.out.println(" Enter Hotel name");
			SuiteACRoom s= new SuiteACRoom(null, 0, false, false, 0);
			
			s.setHotelName(sc.next());
			System.out.println("Room Square Feet Area:");
			s.setNumberofSqFeet(sc.nextInt());
			
			System.out.println("Room has TV (yes/no):");
			
			String s1 = sc.next();
			
			boolean b1=false;
			
			if(s1.equalsIgnoreCase("yes")){
			 b1 = true;
			 s.setHasTV(b1);
			 
			}
			else if(s1.equalsIgnoreCase("no")){
				b1 = false;
				s.setHasTV(b1);
			}
			
			System.out.println("Room has Wifi (yes/no):");
			
			String st = sc.next();
			
			boolean b=false;
			
			if(st.equalsIgnoreCase("yes")){
			 b = true;
			 s.setHasWifi(b);
			 
			}
			else if(st.equalsIgnoreCase("no")){
				b = false;
				s.setHasWifi(b);
			}
		
			
			
			
			
			
			//d1.setHasWifi(sc.nextBoolean());
		
			s.getRatePerSqFeet();
			s.calculateTarrif();
			
			
			
			
		}
		
		
		
		
		
		

	}

}