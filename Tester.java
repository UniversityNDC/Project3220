
import java.util.Scanner;

import javax.swing.JFrame;


public class Tester{

	public static void main(String[] args) {
		
		
		   OpenDataCSVReader reader1 = new OpenDataCSVReader("/Users/nehasarvil/eclipse-workspace/Project3220/src/RoadMaintenance_YTD.csv");
	      
	   
	      System.out.println("Total number of road Maintenance service request YTD: " + reader1.numberOfRows());
	      
	      System.out.println("Check how the request was received:\n 1 for Phone\n 2 for Web Intake\n 3 for E-Mail\n 4 for location-wise\n 5 for Graphical View\n 6 for show all data\n");
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
	    	  	  break;
	    		
	      case 5: 
	    	  	GraphicView frame = new GraphicView();
		  		frame.setSize(300, 300);
		  		frame.setLocationRelativeTo(null); // Center the frame
		  		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  		frame.setVisible(true);
	    	  break;
	    	  
	      case 6: 
	    	  reader1.printrow();
	    	  break;
	    	  
	      default:
	    	System.out.println("Invalid Selection");
	    	break;
	      
	      }  
	      in.close();

	
}
	

}