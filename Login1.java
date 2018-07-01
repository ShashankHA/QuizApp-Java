package dbconnection;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class Login1
{
	public static void LoginFun()
	{
		final int MAX=10;

		JFrame f=new JFrame();
		Container c= f.getContentPane();
		c.setBackground(new Color(112,128,144));
		
		JPanel panel=new JPanel();
		JLabel User=new JLabel("User ID and password");
		User.setFont(new Font("Serif", Font.BOLD, 20));
		 User.setBounds(370,100,500,40);
  		 User.setForeground(new Color(255,255,255));

  		JLabel Log=new JLabel(new ImageIcon("/media/ullas/250/login.jpg"));
  		Log.setBounds(40,100,300,300);

		
		
		 JButton Lo=new JButton("Login");
		    Lo.setBounds(450,320,120,30);
		    
		
		JLabel usri=new JLabel("User ID");
	    usri.setFont(new Font("Serif", Font.BOLD, 15));
	    usri.setBounds(370,170,200,50);
 		 usri.setForeground(new Color(255,255,255));

	    
	    JLabel psw=new JLabel("Enter-password");
	    psw.setFont(new Font("Serif", Font.BOLD, 15));
	    psw.setBounds(370,230,200,50);
 		 psw.setForeground(new Color(255,255,255));

	    
	    JTextField usrID=new JTextField();  
	    usrID.setBounds(370,210, 200,30);  
	    
	    JPasswordField passwd= new JPasswordField();   
	    passwd.setBounds(370,270, 200,30); 
	    
	    JButton Ho=new JButton("Home");
		JButton Ex=new JButton("Exit");
		
		Ho.setBounds(616,440,80,30);
		Ex.setBounds(002,440,60,30);
		
		 	panel.add(User);
		    panel.add(psw);
		    panel.add(usri);
		    panel.add(User);
		    panel.add(Log);
		    
		    f.add(Log);
		    f.add(User);
		    f.add(psw);
		    f.add(panel);
		    f.add(Ho);
			f.add(Ex);
			f.add(usri);
			f.add(Lo);
			f.add(usrID);
			f.add(passwd);
			
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
		 Lo.addActionListener(new ActionListener()
		 {  
			    public void actionPerformed(ActionEvent e)
			    {  
			    	 String Uid=usrID.getText();
	 			     String pass=new String(passwd.getPassword());
			    	try
	     	 		{  
			 			Class.forName("com.mysql.jdbc.Driver");  
			 			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dummy","root","Tonyullas");  
			 			Statement stmt=con.createStatement();  
								 						
						 String UID=usrID.getText();
		 			      pass=new String(passwd.getPassword());


						ResultSet rs=stmt.executeQuery("select r.PASSWORD from Reg r where r.ID='"+UID+"'");
						  while(rs.next())  
						  {	System.out.println(rs.getString(1));  
						  	System.out.println(pass);  
						  /*	if(UID.equals(rs.getString(1)))
					  		{
								  System.out.println(rs.getString(1));  

					  		}
						  	else
						  	{
					  		    JOptionPane.showMessageDialog(f,"Invalid User.");  

						  	}*/
						  	
						  	if(pass.equals(rs.getString(1)))
						  		{
						  			Continue1.Continue();
						  			f.setVisible(false);
						  		}
						  		else if(pass.length()<6)
						  		{
						  		    JOptionPane.showMessageDialog(f,"Password is too short.");  
						  		}
						  		else
						  		{
						  		    JOptionPane.showMessageDialog(f,"Password is Incorrect.");  
						  		}
						  		
						  }
					      con.close(); 
	 	           	}
	 		        catch(Exception ei)
	 		        { System.out.println(ei);} 
			    	//f.setVisible(false);
			    }  
	     });  
	}
}
