package HomWORK;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ReverseString {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter a String:");
         String s= br.readLine();
         String[] m=s.split("\\s+");
         int n=m.length;
         System.out.println("Words in String: "+ n);
         
         StringTokenizer st = new StringTokenizer(s);
         int p=st.countTokens();
         System.out.println(p);
         
         Scanner sc = new Scanner(s);
         String [] reverse = new String[n];
         
         for (int i = 0; i < m.length; i++) {
        	 
			reverse[i]= new String();
			reverse[i]= sc.next();
			

			}
         
         System.out.println("Reverse String :");
         for (int i = n-1; i >=0; i--) {
			 System.out.print(reverse[i]+" ");
			
		}
	}

}