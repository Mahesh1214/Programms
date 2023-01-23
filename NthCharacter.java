package HomWORK;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class NthCharacter {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       FileInputStream fis= new FileInputStream(args[0]);
       BufferedReader br = new BufferedReader( new InputStreamReader(fis));
    
       
     
       int m,i=1,n=Integer.parseInt(args[1]) ;  // nth character print   i count char , m for read char
        while((m=br.read())!=-1) {				//read each character
        	if(i%n==0) {
        		System.out.print((char)m+" ");
        	}i++;
        }
        
       
       
       
	}

}
