package project;

import java.util.Scanner;

public class Tester{

	public static void main(String[] args) {
		
		OpenDataCSVReader reader1 = new OpenDataCSVReader("RoadMaintenance_YTD.csv");
	      
	   
	      System.out.println("Total number of road Maintenance service request YTD: " + reader1.numberOfRows());
	      
	      System.out.println("Check how the request was received: Select 1 for Phone, 2 for Web Intake, 3 for E-Mail, 4 for location-wise, 5 for show all data");
	      Scanner in = new Scanner(System.in);
	      int selection = in.nextInt();
	      
	      switch(selection) {
	      case 1: 
	    	  int count = 0;
	    	  for(int i=1; i<reader1.numberOfRows(); i++) {
		    		String o = "Phone";
					if(reader1.field(i, 3).equals(o)) {
		    			count++;
		    		}
		    	}
	    	  System.out.println("Total Phone requests: " + count);
	    	  break;
	      case 2:
	    	  int count1 = 0;
	    	  for(int i=1; i<reader1.numberOfRows(); i++) {
		    		String o = "Web Intake";
					if(reader1.field(i, 3).equals(o)) {
		    			count1++;
		    		}
		    	}
	    	  System.out.println("Total Web requests: " + count1);
	    	  break;
	      case 3:
	    	  int count2 = 0;
	    	  for(int i=1; i<reader1.numberOfRows(); i++) {
		    		String o = "E-Mail";
					if(reader1.field(i, 3).equals(o)) {
		    			count2++;
		    		}
		    	}
	    	  System.out.println("Total e-mail requests: " + count2);
	    	  break;
	    	 
	      case 4: 
	    	  
	    	  Scanner scan = new Scanner (System.in);
	    	  System.out.println("Please enter street name for search rocord: ");
    		  String streetname = scan.next();
	    	  int count3 = 0;
	    	  int i;
	    	  for (i = 0 ;i< reader1.numberOfRows(); i++) {
	    		  
	    		  if (reader1.field(i ,6).equals(streetname)) {
	    			  count3++;
	    		  	}
	    		  }
	    	  	  System.out.println("Total number of request for entered street is : " +count3);
	    		   
	      case 5: 
	    	  reader1.printrow();
	    	  break;
	    	  
	   default:
	    	System.out.println("Invalid Selection");
	    	break;
	      
	      }
	      
	      in.close();

	
}
	

}
