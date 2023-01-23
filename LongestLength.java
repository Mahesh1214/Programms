package HomWORK;

import java.io.FileInputStream;
import java.util.Scanner;

public class LongestLength {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
       FileInputStream fis = new FileInputStream(args[0]);
       Scanner sc= new Scanner(fis);
       String sm="";
       String s;
       int max=-1;
       
       while(sc.hasNextLine()) {
    	   s=sc.nextLine();
    	   if(s.length()>max) {
    		   max= s.length();
    		   sm=s;
    		   
    	   }
    	
       }
       System.out.println(sm+"\n"+max);
       
       
	}

}
