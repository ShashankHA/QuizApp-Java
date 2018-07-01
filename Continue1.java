package dbconnection;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Continue1
{
	public static void Continue()
	{
		JFrame f=new JFrame();
		
		Container c= f.getContentPane();
		c.setBackground(new Color(112,128,144));

		
		JPanel panel=new JPanel();
		JLabel Ent=new JLabel("Select your favorite field...");
		Ent.setFont(new Font("Serif", Font.BOLD, 20));
		 Ent.setForeground(new Color(255,255,255));

		panel.setLayout(new FlowLayout());  
		panel.add(Ent);
		Ent.setBounds(230,100,300,40);
		
		 JButton Spo=new JButton("Sports");
		 JButton Sci=new JButton("Science");
		 JButton His=new JButton("History");
		 JButton Ho=new JButton("Home");
		 JButton Ex=new JButton("Exit");
		 JButton Bk=new JButton("Back");
		 
		    
		 Bk.setBounds(10,10,70,25);
		 Spo.setBounds(100,250,100,40);
		 Sci.setBounds(300,250,100,40);
		 His.setBounds(500,250,100,40);
		 Ho.setBounds(616,440,80,30);
		 Ex.setBounds(002,440,60,30);
		
		
		 f.add(Sci);
		 f.add(Spo);
		 f.add(His);
		 f.add(Ho);
		 f.add(Ex);
		// f.add(Bk);
		
		f.add(panel);
		f.add(Ent);
		
		f.setSize(700,500);
		f.setLayout(null);
		f.setVisible(true);
		f.setLocationRelativeTo(null); 
		 Ex.addActionListener(new ActionListener()
		 {  
			    public void actionPerformed(ActionEvent e)
			    {  
			    	Exit.exiting();
			    	f.setVisible(false);
			    }  
	     });  
		
		 Ho.addActionListener(new ActionListener()
		 {  
			    public void actionPerformed(ActionEvent e)
			    {    
			    	Quiz1.OnlineQuiz();
			    	f.setVisible(false);
			    }  
	     });  
		 Spo.addActionListener(new ActionListener()
		 {  
			    public void actionPerformed(ActionEvent e)
			    {    
			    	Sports.Sports1();
			    	f.setVisible(false);
			    }  
	     });
		 Sci.addActionListener(new ActionListener()
		 {  
			    public void actionPerformed(ActionEvent e)
			    {    
			    	Science.Science1();
			    	f.setVisible(false);
			    }  
	     });
		 His.addActionListener(new ActionListener()
		 {  
			    public void actionPerformed(ActionEvent e)
			    {    
			    	History.History1();
			    	f.setVisible(false);
			    }  
	     });

	}
	
}
