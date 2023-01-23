package HomWORK.Game;

import java.util.Scanner;

public class Outdoor {

	private String Name2[] = new String[10], Game2;
    private int n;
    
    public Outdoor(String n2 , String g2 ) {
    	n = 1;
    	Name2[0] =new String(n2);
    	Game2 = g2;
    	
    	
    }
    
    public Outdoor() {
    	accept();
    }
    
    public void accept() {
		Scanner s = new Scanner (System.in);
		
		System.out.println("enter the game: ");
		Game2= s.nextLine();
		
		System.out.println("enter the NO of  player");
		n = s.nextInt();
		s.nextLine();
		
		
		for(int i=0; i<n; i++) {
			Name2[i]= new String ();

			System.out.println("enter the name of  player");
			Name2[i]=s.nextLine();
			
		}

	}
    
    
    public void Display() {
    	
    	System.out.println("enter the game : "+Game2);
    	
    	for( int i=0; i<n; i++) {
  		  System.out.println(Name2[i]);
  		}
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
