import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GUITEST {

	public static void main(String[] args) {
		
		ChatFrame cf= new ChatFrame("ChatFrame");
		
		MyFrame mf= new MyFrame("MyFrame");
		
		JFrame frame = new JFrame("My First GUI");
		frame.getContentPane().setLayout(new FlowLayout());
		JButton button1 = new JButton("Press");
		button1.setText("Press Me");
		button1.setToolTipText("Press ME and Watch What Happens");
		//frame.getContentPane().add(BorderLayout.NORTH,button1);

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		JButton button2 = new JButton("Button 2");
		//frame.getContentPane().add(BorderLayout.SOUTH,button2);
		frame.getContentPane().add(BorderLayout.WEST,button2);
		frame.getContentPane().add(BorderLayout.EAST,button1);

		frame.setVisible(true);

		

	}

}
