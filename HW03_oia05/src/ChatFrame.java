
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class ChatFrame extends JFrame implements ActionListener {
	private JButton button1;
	private JButton button2;
	private JMenuBar mb;
	private JMenu m1;
	private JMenu m2;
	private JMenuItem mi;
	private JMenuItem mi2;
	private JPanel p;
	private JLabel l;
	private JTextField f;
	
	public ChatFrame(String s)
	{
		super(s);
		button1 = new JButton("Send");
		button2 = new JButton("Reset");
		l= new JLabel("Enter Text");
		f = new JTextField(" ",6);
		p = new JPanel();
		p.setLayout(new FlowLayout());
		p.add(l);
		p.add(f);
		p.add(button1);
		p.add(button2);
		this.getContentPane().add(BorderLayout.SOUTH,p);
		mb = new JMenuBar();
		m1= new JMenu("File");
		m2 = new JMenu("Help");
		mi=new JMenuItem("open");
		mi2=new JMenuItem("save as");
		m1.add(mi);
		m1.add(mi2);
		mb.add(m1);
		mb.add(m2);
		this.setJMenuBar(mb);
		button1.addActionListener(this);
		button2.addActionListener(this);
		mi.addActionListener(this);
		mi2.addActionListener(this);
		
		
		
		

		this.setSize(300,300);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JButton) {
			JButton b = (JButton) e.getSource();
			if (b==button1)
			{
				JOptionPane.showConfirmDialog(this, "You clicked on send","Button Click Event Handler", JOptionPane.PLAIN_MESSAGE);	
				}else if (b==button2)
				{
					JOptionPane.showConfirmDialog(this, "You clicked reset","Button Click Event Handler", JOptionPane.PLAIN_MESSAGE);
				}
			} else if (e.getSource() instanceof JMenuItem) {
				JMenuItem m = (JMenuItem) e.getSource();
				if (m==mi)
				{
					JOptionPane.showConfirmDialog(this, "You clicked on open","Button Click Event Handler", JOptionPane.PLAIN_MESSAGE);	
				}
				else if(m==mi2)
				{
					JOptionPane.showConfirmDialog(this, "You clicked on save as","Button Click Event Handler", JOptionPane.PLAIN_MESSAGE);	
				}
			}

		
	}
	
	
	

}
