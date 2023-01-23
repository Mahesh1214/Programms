package HomWORK;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.time.DayOfWeek;
import java.util.Scanner;

public class Computer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       FileInputStream fr = new FileInputStream(args[0]);
       Scanner sc = new Scanner(fr);
       FileWriter fw= new FileWriter(args[1]);
       
       String s="computer";
       String m;
       
       while(sc.hasNextLine()) {
    	  m=sc.nextLine();
    	  if(m.indexOf(s)>-1) {
    		 fw.write(m);
    		 fw.write("\n");
    	  }
    	  
       }
       fw.close();
       System.out.println("String Copy Succesfully!");
    	
	}
 
}
