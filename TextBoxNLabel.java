//  Write a program having a text box and a label. As the user types 
//  characters in the text box,
//simultaneously displays it in label. 
//Window should exit when „X‟ is occurred.

package HomWORK;
import javax.swing.*;

import java.awt.*;
import java.awt.Event.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class TextBoxNLabel extends JFrame{
	
	private Label lbl;
	private TextField txt;
	
	TextBoxNLabel(){
		lbl= new Label("Enter text");
		txt= new TextField("do some Work",80);
		
		setTitle("Text Label");
		setLocation(200, 300);
		setLayout(new FlowLayout());
		setSize(400, 300);
		add(lbl);
		add(txt);
		setVisible(true);
		
		txt.addTextListener(new TextListener() {
			
			@Override
			public void textValueChanged(TextEvent e) {
				lbl.setText(txt.getText());
				
		   String s=txt.getText();
		   int n=s.indexOf("X");
		   if(n>-1)System.exit(0);
		   
			}
		});
	}
	

	public static void main(String[] args) {
		
      new TextBoxNLabel();
	}

}
