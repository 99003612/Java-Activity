

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PMain {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
int n;
Scanner in=new Scanner(System.in);
n=in.nextInt();
Playermain [] pl = new Playermain[n];
for(int i=0;i<n;i++) {
	String s;
	Scanner in2=new Scanner(System.in);
	s=in2.nextLine();
	pl[i]=Playermain.createPlayer(s);
}
HashMap<String, Integer> hs = new HashMap<String, Integer>(); 

//Iterate through array of words 
for (int i = 0; i < n; i++) { 
 // If word already exist in HashMap then increase it's count by 1 
 if (hs.containsKey(pl[i].nationality)) { 
     hs.put(pl[i].nationality, hs.get(pl[i].nationality) + 1); 
 } 
 // Otherwise add word to HashMap 
 else { 
     hs.put(pl[i].nationality, 1); 
 }
 Set<Map.Entry<String, Integer> > set = hs.entrySet(); 
 String key = ""; 
 int value = 0; 

 for (Map.Entry<String, Integer> me : set) { 
     // Check for word having highest frequency 
     if (me.getValue() > value) { 
         value = me.getValue(); 
         key = me.getKey(); 
     } 
 } 


 // Return word having highest frequency 
System.out.println("maximum country: "+key);
System.exit(0);

} 
} 

	}
