package dbconnection;
import javax.swing.*;
import javax.swing.text.AbstractDocument.Content;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Quiz1 {
	
	public static void OnlineQuiz()
	{
		 JFrame a=new JFrame("Ullas"); 
		 JButton Ex=new JButton("Exit");
		 JButton Reg=new JButton("Register");
		 JButton Log=new JButton("Login");
		 
		Container c= a.getContentPane();
		c.setBackground(new Color(112,128,144));
		 
		 JLabel Wel=new JLabel("Welcome to QUIZ");
		 Wel.setForeground(new Color(255,255,255));
		 Wel.setFont(new Font("Serif", Font.BOLD, 30));
		 JLabel Ent=new JLabel("Enter your choice......");
		 Ent.setForeground(new Color(255,255,255));
		 Ent.setFont(new Font("Serif", Font.BOLD, 20));
		 
		 JPanel panel=new JPanel();
		 panel.add(Ent);
		 panel.setLayout(new FlowLayout());  
		 panel.add(Wel);
		 
		 JLabel SIT=new JLabel(new ImageIcon("/media/ullas/250/SIT1.png"));
		 
		 Wel.setBounds(210,55,500,40);
		 SIT.setBounds(240,100,225,220);
		 Ent.setBounds(260,350,300,40);
		 Ex.setBounds(100,400,100,40);
		 Reg.setBounds(300,400,100,40);
		 Log.setBounds(500,400,100,40);
		 
		 
		 
		 a.add(SIT);
		 a.add(Wel);
		 a.add(Ent);
		 a.add(Ex);
		 a.add(Reg);
		 a.add(Log);
		 a.add(panel);
		 
		
		 
		 
		 a.setSize(700,500);
		 a.setLayout(null);
		 a.setVisible(true);
		 a.setLocationRelativeTo(null); 
		 
		 
		 Ex.addActionListener(new ActionListener()
		 {  
			    public void actionPerformed(ActionEvent e)
			    {  
			    	Exit.exiting();
			    	a.setVisible(false);			    	
			    }  
	     });  
		 Log.addActionListener(new ActionListener()
		 {  
			    public void actionPerformed(ActionEvent e)
			    { 
			    	Login1.LoginFun();
			    	a.setVisible(false);
			    }  
	     });  
		 Reg.addActionListener(new ActionListener()
		 {  
			    public void actionPerformed(ActionEvent e)
			    {  
			         
			    	Register1.RegisterFun();
			    	a.setVisible(false);
			    }  
	     });  
		 a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
	}
	 public static void main(String []args)
	 {
		   Quiz1.OnlineQuiz();
	 }
}