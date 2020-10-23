import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame implements ActionListener {
	private JButton button1;
	private JButton button2;
	
	public MyFrame(String s)
	{
		super(s);
		this.getContentPane().setLayout(new FlowLayout());
		button1 = new JButton("Press");
		button1.setText("Press Me");
		button1.setToolTipText("Press ME and Watch What Happens");
		//frame.getContentPane().add(BorderLayout.NORTH,button1);

	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,300);
		button2 = new JButton("Button 2");
		//frame.getContentPane().add(BorderLayout.SOUTH,button2);
		this.getContentPane().add(BorderLayout.WEST,button2);
		this.getContentPane().add(BorderLayout.EAST,button1);
		button1.addActionListener(this);
		button2.addActionListener(this);


		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		
		if (b==button1)
		{
			JOptionPane.showConfirmDialog(this, "You clicked Button1","Button Click Event Handler", JOptionPane.PLAIN_MESSAGE);	
			}else if (b==button2)
			{
				JOptionPane.showConfirmDialog(this, "You clicked Button2","Button Click Event Handler", JOptionPane.PLAIN_MESSAGE);
			}
		
	}

}
