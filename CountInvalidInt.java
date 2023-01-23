  // Write a Java program to find the sum of command 
  //line argument and count the invalid
  //integers entered through command line.
//eg. $java myprog 8 2 8.2 6 4 4.8
//Output:
//Total numbers entered = 6
//Invalid integers = 2
//Sum of integers = 20

package HomWORK;

public class CountInvalidInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int i=0,j=0,s=0,n=args.length; //i for accepet int ,j for count of invalid int, s for sum
      
      for (int k = 0; k < n; k++) {
    	  try {
    		  i=Integer.parseInt(args[k]);
    		  s+=i;
    	  }catch(NumberFormatException e) {
    		  j++;
    	  }
		
	}
      System.out.println("total no entered ="+n+
    		  "\ninvalid integer ="+j+
    		  "\nsum of integer="+s);
	}

}
