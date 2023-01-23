package HomWORK;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BoldItalic extends JFrame{
     
private TextField txt1;

public BoldItalic() {
	
	txt1= new TextField(50);
	
	setTitle("Bold&Italic");
	setLocation(300, 400);
	setSize(400,400);
	setLayout(new FlowLayout());
	add(txt1);
	setFont(new Font("Arial", Font.PLAIN,12));
	setVisible(true);
	
	MouseHandler mh= new MouseHandler();
	txt1.addMouseListener(mh);
	
}
class MouseHandler extends MouseAdapter{

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		String s= txt1.getText();
		
	if(e.getButton()==MouseEvent.BUTTON1) {
		txt1.setFont(new Font("Arial", Font.BOLD, 15));
		
	}
	if(e.getButton()==MouseEvent.BUTTON3) {
		txt1.setFont(new Font("Arial", Font.ITALIC, 15));
		
	}
	}

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 new BoldItalic();
 
	}

}
