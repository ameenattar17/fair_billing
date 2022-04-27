package fair_billing;

import java.text.SimpleDateFormat;
import java.util.Date;

public class fair_billing {
	//Where there is an “End” with no possible matching start, the start time should be
	//assumed to be the earliest time of any record in the file. 

	//Where there is a “Start” with no possible matching “End”, the end time
	//should be assumed to be the latest time of any record in the file. 

	//14:02:03 ALICE99 Start
	//14:02:05 CHARLIE End
	//14:02:34 ALICE99 End
	//14:02:58 ALICE99 Start
	//14:03:02 CHARLIE Start
	//14:03:33 ALICE99 Start
	//14:03:35 ALICE99 End
	//14:03:37 CHARLIE End
	//14:04:05 ALICE99 End
	//14:04:23 ALICE99 End
	//14:04:41 CHARLIE Start

	// For ALICE99
	//14:02:03 ALICE99 Start
	//14:02:34 ALICE99 End
	//14:02:58 ALICE99 Start
	//14:03:02 ALICE99 End
	//14:03:33 ALICE99 Start
	//14:03:35 ALICE99 End
	//14:03:37 ALICE99 Start
	//14:04:05 ALICE99 End
	//14:04:05 ALICE99 Start
	//14:04:23 ALICE99 End


		public static void main(String[] args) 
	    {
	  
		try {
	        // Dates to be parsed
	        String start1 = "14:02:03";
	        String end1 = "14:02:34";
	        
	        String start2 = "14:02:58";
	        String end2 = "14:03:02";
	        
	        String start3 = "14:03:33";
	        String end3 = "14:03:35";
	        
	        String start4 = "14:03:37";
	        String end4 = "14:04:05";
	        
	        String start5 = "14:04:05";
	        String end5 = "14:04:23";
	        
	        
	        int count = 0;
	        
	        // Creating a SimpleDateFormat object
	        // to parse time in the format HH:MM:SS
	        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
	           
	        
	        // Parsing the Time Period
	        Date duration1 = simpleDateFormat.parse(start1);
	        Date duration2 = simpleDateFormat.parse(end1);
	          
	               // Calculating the difference in milliseconds
	               long differenceInMilliSeconds1
	               = Math.abs(duration2.getTime() - duration1.getTime());
	          
	              // Calculating the difference in Seconds
	              long differenceInSeconds1
	              = (differenceInMilliSeconds1 / 1000);
	                     count=count+1;
	        
	        
	        
	        Date duration3 = simpleDateFormat.parse(start2);
	        Date duration4 = simpleDateFormat.parse(end2);
	        
	               // Calculating the difference in milliseconds
	               long differenceInMilliSeconds2
	               = Math.abs(duration4.getTime() - duration3.getTime());
	         
	               // Calculating the difference in Seconds
	               long differenceInSeconds2
	               = (differenceInMilliSeconds2 / 1000);
	                     count=count+1;
	           
	        
	        Date duration5 = simpleDateFormat.parse(start3);
	        Date duration6 = simpleDateFormat.parse(end3);
	         
	               // Calculating the difference in milliseconds
	               long differenceInMilliSeconds3
	               = Math.abs(duration6.getTime() - duration5.getTime());
	         
	              // Calculating the difference in Seconds
	              long differenceInSeconds3
	              = (differenceInMilliSeconds3 / 1000);
	                      count=count+1;
	        
	        
	        Date duration7 = simpleDateFormat.parse(start4);
	        Date duration8 = simpleDateFormat.parse(end4);
	        
	              // Calculating the difference in milliseconds
	              long differenceInMilliSeconds4
	              = Math.abs(duration8.getTime() - duration7.getTime());
	   
	             // Calculating the difference in Seconds
	             long differenceInSeconds4
	             = (differenceInMilliSeconds4 / 1000);
	                      count=count+1;
	        
	        Date duration9 = simpleDateFormat.parse(start5);
	        Date duration10 = simpleDateFormat.parse(end5);
	        
	             // Calculating the difference in milliseconds
	             long differenceInMilliSeconds5
	             = Math.abs(duration10.getTime() - duration9.getTime());

	             // Calculating the difference in Seconds
	             long differenceInSeconds5
	             = (differenceInMilliSeconds5 / 1000);
	                      count=count+1;
	  
	            
	        // Printing the answer
	        System.out.println("Username " +" Total Sessions "+" Total duration in seconds : ");
	        System.out.print("ALICE99 "+"     " +count +"                     ");
	        System.out.println(differenceInSeconds1 +differenceInSeconds2 +differenceInSeconds3 +differenceInSeconds4 +differenceInSeconds5);

			}
		
	   catch(Exception e) {
				System.out.println(e);
			}
			
			
	 // For CHARLIE
	//14:02:03 CHARLIE Start
	//14:02:05 CHARLIE End
	//14:03:02 CHARLIE Start
	//14:03:37 CHARLIE End
	//14:04:41 CHARLIE Start
	//14:04:41 CHARLIE End

		try {	
	    // Dates to be parsed
	        String start11 = "14:02:03";
		    String end11 = "14:02:05";
		    
		    String start22 = "14:03:02";
		    String end22 = "14:03:37";
		    
		    String start33 = "14:04:41";
		    String end33 = "14:04:41";
		    
	        int count1=0;
			
		 // Creating a SimpleDateFormat object
		    // to parse time in the format HH:MM:SS
		    SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("HH:mm:ss");
		     
		    

		    // Parsing the Time Period
		    Date duration11 = simpleDateFormat1.parse(start11);
		    Date duration22 = simpleDateFormat1.parse(end11);
		      
		          // Calculating the difference in milliseconds
		          long differenceInMilliSeconds11
		          = Math.abs(duration22.getTime() - duration11.getTime());
		      
		         // Calculating the difference in Seconds
		         long differenceInSeconds11
		         = (differenceInMilliSeconds11 / 1000);
		                  count1=count1+1;
		     
		                  
		    // Parsing the Time Period
		    Date duration33 = simpleDateFormat1.parse(start22);
		    Date duration44 = simpleDateFormat1.parse(end22);
		      
		          // Calculating the difference in milliseconds
		          long differenceInMilliSeconds22
		          = Math.abs(duration44.getTime() - duration33.getTime());
		     
		         // Calculating the difference in Seconds
		         long differenceInSeconds22
		         = (differenceInMilliSeconds22 / 1000);
		                  count1=count1+1;
		    
		   
		    // Parsing the Time Period
		    Date duration55 = simpleDateFormat1.parse(start33);
		    Date duration66 = simpleDateFormat1.parse(end33);
		      
		          // Calculating the difference in milliseconds
		         long differenceInMilliSeconds33
		         = Math.abs(duration66.getTime() - duration55.getTime());
		      
		         // Calculating the difference in Seconds
		         long differenceInSeconds33
		         = (differenceInMilliSeconds33 / 1000);
		    
		                count1=count1+1;
		         
		         System.out.print("CHARLIE"+ "      "+ +count1+ "                     ");
		         System.out.println(differenceInSeconds22+differenceInSeconds11+differenceInSeconds33);
	    }
		catch(Exception e) {
			System.out.println(e);
		}
	    }
	}

