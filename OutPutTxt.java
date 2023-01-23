//    Write a Java program to accept a file name and a 
//    character as a command line arguments
//and replace all occurrences of that character
//by *. Store the result in file ''output.txt''.


package HomWORK;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class OutPutTxt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
        FileReader fr=new FileReader(args[0]);
        
        FileWriter fw = new FileWriter("output.txt");
        
        char ch = args[1].charAt(0);
        int c;
         while((c=fr.read())!=-1){
        	 if(ch==(char)c)
        		 c='*';
        	 
        	 
        	 fw.write((char)c);
        	 
        	 
         }
        
        
		}catch(FileNotFoundException e) {
			System.out.println("File not found");
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Out of Bound:");
		}catch (IOException e) {
			System.out.println("File not for Write");
			
		}
	}

}
