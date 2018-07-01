package dbconnection;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Exit
{
	public static void ExitResult()
	{
		System.exit(0);
	}
	public static void exiting()
	{
		JFrame a=new JFrame("Exit"); 
		Container c= a.getContentPane();
		c.setBackground(new Color(112,128,144));
		
		 JButton Re=new JButton("Resume");
		 JButton Ex=new JButton("Exit");
		 
		 JPanel panel=new JPanel();
		 JLabel Ent=new JLabel("Really you want to exit..");
  		 Ent.setForeground(new Color(255,255,255));

		 panel.add(Ent);
		 panel.setLayout(new FlowLayout());  
		 
		 Ent.setBounds(40,0,300,40);
		 Re.setBounds(70,40,100,40);
		 Ex.setBounds(70,100,100,40);		 
		 
		 a.add(Ent);
		 a.add(Re);
		 a.add(Ex);
		 a.add(panel);
		 
		 
		 
		 
		 a.setSize(250,200);
		 a.setLayout(null);
		 a.setVisible(true);
		 a.setLocationRelativeTo(null); 
		 
		 Re.addActionListener(new ActionListener()
		 {  
			    public void actionPerformed(ActionEvent e)
			    {  
			         
			    	Quiz1.OnlineQuiz();
			    	a.setVisible(false);
			    }  
	    });  
		 Ex.addActionListener(new ActionListener()
		 {  
			    public void actionPerformed(ActionEvent e)
			    {  
			         Exit.ExitResult();
			         a.setVisible(false);
			    }  
	    });  
		 
		 a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    


	}
}

