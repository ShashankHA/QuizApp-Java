package dbconnection;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.*;


public class Register1 {
	public static void RegisterFun()
	{
		JFrame f= new JFrame("Registration1");  
	    JPanel panel=new JPanel();
	    Container c= f.getContentPane();
		c.setBackground(new Color(112,128,144));
		
		 JLabel Reg=new JLabel(new ImageIcon("/media/ullas/250/SIT.png"));
		 Reg.setBounds(80,100,225,220);

	    
	    JButton Su=new JButton("Sign up");
	    Su.setBounds(430,340,120,30);
	    
	    JButton Bk=new JButton("Back");
	    Bk.setBounds(10,10,70,25);
	    
	    JButton Ho=new JButton("Home");
		JButton Ex=new JButton("Exit");
		
		Ho.setBounds(616,440,80,30);
		Ex.setBounds(002,440,60,30);
	    
	    
	    JLabel usr=new JLabel("User name");
	    usr.setFont(new Font("Serif", Font.BOLD, 15));
	    usr.setBounds(350,60,200,50);
 		 usr.setForeground(new Color(255,255,255));

	    
	    JLabel usri=new JLabel("User ID");
	    usri.setFont(new Font("Serif", Font.BOLD, 15));
	    usri.setBounds(350,120,200,50);
 		 usri.setForeground(new Color(255,255,255));

	    
	    JLabel psw=new JLabel("Enter-password");
	    psw.setFont(new Font("Serif", Font.BOLD, 15));
	    psw.setBounds(350,180,200,50);
 		 psw.setForeground(new Color(255,255,255));

	    
	    JLabel rpsw=new JLabel("Confirm password");
	    rpsw.setFont(new Font("Serif", Font.BOLD, 15));
	    rpsw.setBounds(350,240,200,50);
 		 rpsw.setForeground(new Color(255,255,255));

	     
	    panel.add(Reg);
	    panel.add(usr);
	    panel.add(psw);
	    panel.add(rpsw);
	    panel.add(usri);
	    
	    JTextField usrNa=new JTextField();  
	    usrNa.setBounds(350,100, 200,30);  
	    JTextField usrID=new JTextField();  
	    usrID.setBounds(350,160, 200,30); 
	    
	    JPasswordField passwd = new JPasswordField();   
	    passwd.setBounds(350,220, 200,30); 
  
	    JPasswordField passwd1 = new JPasswordField();   
	    passwd1.setBounds(350,280, 200,30); 

		f.add(Reg);
	    f.add(usr);
	    f.add(psw);
	    f.add(rpsw);
	    f.add(panel);
	    f.add(usrNa);
	    f.add(usrID);
	    f.add(passwd);  
	    f.add(passwd1); 
	    f.add(Ho);
		f.add(Ex);
		f.add(usri);
		f.add(Su);
		f.add(Bk);
		
	    
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
		 
		 Su.addActionListener(new ActionListener()
		 {  
          
              public void actionPerformed(ActionEvent e)
		    {     
 				 //System.out.println(passwd.getPassword());
 				 
 				 String pass,pass1;
 			        pass=new String(passwd.getPassword());
 	                pass1=new String(passwd1.getPassword());
 	                
 	               if(pass.length()==6)
	                {
 	            	   if(pass.equals(pass1))
	                		{

	                			try
				     	 			{  
								 			Class.forName("com.mysql.jdbc.Driver");  
								 			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dummy","root","Tonyullas");  
								 			Statement stmt=con.createStatement();  
													 						
											 String Uid=usrID.getText();
											 System.out.println(Uid);
							 				 String Una=usrNa.getText();
		
											stmt.executeUpdate("INSERT INTO Reg(ID,NAME,PASSWORD)" + "VALUES('"+Uid+"','"+Una+"','"+pass+"')");
										     Quiz1.OnlineQuiz(); 
										      con.close(); 
				     	 			}
	                					catch(Exception ei)
	                						{ System.out.println(ei);} 
	                      }else
	                		JOptionPane.showMessageDialog(f,"Your password is not matching.");  
	                }
 	               else if(pass.length()<6)
			  		   JOptionPane.showMessageDialog(f,"Your password is too short.");  
	 			    }  
 });
        	  
		 Bk.addActionListener(new ActionListener()
		 {  
			    public void actionPerformed(ActionEvent e)
			    {    
			    	Login1.LoginFun();
			    	f.setVisible(false);
			    }  
	     });
		 
		}
}
