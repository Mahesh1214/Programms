    //Write a Java program that inputs a person's name in the form of First Middle Last,
    //and then prints it in the form Last First M., 
   //where ''M.'' is the person's middle initial.
package HomWORK;

import java.util.Scanner;


public class FirstMiddleLast {
	private  String first,middle,last;
	public static Scanner sc= new Scanner(System.in);
      public  void Accepet() {
    	 System.out.println("enter first name:");
    	  first = sc.nextLine();
    	  
    	  System.out.println("Enter middle name:");
    	  middle=sc.nextLine();
    	  
    	  System.out.println("Enter last name:");
    	  last=sc.nextLine();
    	  
    	  
      }
      public void display() {
    	  System.out.println(last+" "+first+" "+middle.charAt(0)+".");
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstMiddleLast fml = new FirstMiddleLast();
		
		fml.Accepet();
		fml.display();
		
	}

}
