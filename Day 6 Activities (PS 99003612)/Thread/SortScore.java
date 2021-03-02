import java.util.Arrays;

public class SortScore extends Thread{
		
		



		private String matchType;
		private String scoreString;
		int scores[] ;
		
		
	    public SortScore(String matchType, String scoreString) {
			super();
			this.matchType = matchType;
			this.scoreString = scoreString;
		}
	    
	    
	    @Override
		public void run() {
			// TODO Auto-generated method stub
	    	super.run();
	    	String[] arr=scoreString.split("\\,"); 
	    	scores = new int[arr.length];
	    	
	    	for (int i=0;i<arr.length;i++) {
	    		
	    		scores[i]=Integer.parseInt(arr[i]);
	    		
	    	}
	    	
	     Arrays.sort(scores);
	
//	    	int[] getScore() {
//	    	
//	    		//for(int g=0;g<scores.length;g++)
//		    		//System.out.println(scores[g]);
//	        	return ;
//	        	
//	    		
//	    	}
	    	
	    	//for(int g=0;g<scores.length;g++)
	    		//System.out.println(scores[g]);
	    	
	    	
	    	
		}
	    
	    
	   // String[] arr=scoreString.split("\\,"); 
		
	   
		

	}