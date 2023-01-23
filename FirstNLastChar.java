  // Write a Java program to accept a string and an integer n as command line arguments and
  //display the first and last n characters of the string.
package HomWORK;

public class FirstNLastChar {
	public static void FindfirstandLast(String str) {
		int n=str.length();
		
		char first = str.charAt(0);
		char last =str.charAt(n-1);
		
		System.out.println("first:"+ first);
		System.out.println("last:"+ last);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		str=args[0];
		
		FindfirstandLast(str);
	}

}
