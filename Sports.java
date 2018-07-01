package dbconnection;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.*;

public class Sports
{
	static int a=1;
	static int correct=0;
	static int incorrect=0;

	public static void Sports1()
	{
		JFrame f=new JFrame();
		Container c= f.getContentPane();
		c.setBackground(new Color(112,128,144));
		
		JPanel panel=new JPanel();
		JButton submit=new JButton("Submit");
	    submit.setBounds(400,350,120,30);
	    
	    JButton Ex=new JButton("Exit");
		 Ex.setBounds(002,440,60,30);
		 
		 JButton Ho=new JButton("Continue");
		 Ho.setBounds(300,200,100,50);


	    
		try
	 		{  
 			Class.forName("com.mysql.jdbc.Driver");  
 			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dummy","root","Tonyullas");  
 			Statement stmt=con.createStatement();  
					 						
 			
			ResultSet rs=stmt.executeQuery("select * from Sports s  where s.NUM='"+a+"'");
			  while(rs.next())  
			  {	
				  if (a==11)
		 			{
					  JLabel Res=new JLabel("Correct answers "+correct);
					  		 Res.setBounds(70,60,500,40);
					  		 Res.setFont(new Font("Serif", Font.BOLD, 40));
					  		 Res.setForeground(new Color(255,255,255));
							 
					  		 
					  JLabel Res1=new JLabel("Wrong answers "+incorrect);
						  	 Res1.setBounds(70,120,550,40);
						  	 Res1.setFont(new Font("Serif", Font.BOLD, 30));
					  		 Res1.setForeground(new Color(255,255,255));


						     panel.add(Res);
						     f.add(Res); 
						     panel.add(Res1);
						     f.add(Res1); 
						     f.add(Ex); 
						     f.add(Ho);
						     Ho.addActionListener(new ActionListener()
							 {  
								    public void actionPerformed(ActionEvent e)
								    {    
								    	Quiz1.OnlineQuiz();
								    	f.setVisible(false);
								    }  
						     });
						     Ex.addActionListener(new ActionListener()
							 {  
								    public void actionPerformed(ActionEvent e)
								    {  
								    	Exit.exiting();
								    	f.setVisible(false);			    	
								    }  
						     }); 


		 			}
				  else
				  {
				 String Op=rs.getString(7);
				JLabel NUM=new JLabel(rs.getString(1)+". ");
				 NUM.setBounds(70,60,500,40);
				 NUM.setFont(new Font("Serif", Font.BOLD, 20));
		  		 NUM.setForeground(new Color(255,255,255));


				  
				 JLabel QUN=new JLabel(rs.getString(2));
				 QUN.setFont(new Font("Serif", Font.BOLD, 20));
		  		 QUN.setForeground(new Color(255,255,255));

					
					panel.setLayout(new FlowLayout());  
					QUN.setBounds(100,60,700,40);
					
				  JRadioButton O1=new JRadioButton(rs.getString(3));
				    O1.setBounds(245,122,130,30);   
					O1.setSelected(true);
					O1.setActionCommand(rs.getString(3));
					
				  JRadioButton O2=new JRadioButton(rs.getString(4));
				  	O2.setBounds(245,172,130,30);  
					O2.setActionCommand(rs.getString(4));


				  JRadioButton O3=new JRadioButton(rs.getString(5));
				  	O3.setBounds(245,222,130,30); 
					O3.setActionCommand(rs.getString(5));

				  	
 				  JRadioButton O4=new JRadioButton(rs.getString(6));
				    O4.setBounds(245,272,130,30);
					O4.setActionCommand(rs.getString(6));
					
					
					ButtonGroup group=new ButtonGroup();
					 group.add(O1);
					 group.add(O2);
					 group.add(O3);
					 group.add(O4);
					 

				      	 submit.addActionListener(new ActionListener()
						 {  
							    public void actionPerformed(ActionEvent e)
							    {    
									 String Cmd =group.getSelection().getActionCommand();
							    	 if(Cmd.equals(Op))
							    	 {
										  System.out.println(Op);
								  		    JOptionPane.showMessageDialog(f,"Correct answer"); 
								  		    a++;
								  		    correct++;
								  		  Sports1();
											f.setVisible(false);
							    	 }
							    	 else
							    	 {
								  		    JOptionPane.showMessageDialog(f,"Wrong answer.\nCorrect answer is :" +Op);  
								  		  a++;
								  		 incorrect++;
								  		Sports1();
											f.setVisible(false);
							    	 }
									
							    }  
					     });  
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
						  			Continue1.Continue();
							    	f.setVisible(false);
							    }  
					     });
				  

					 
				     panel.add(submit);
					 panel.add(QUN);
					 panel.add(NUM);

					f.add(submit);
					f.add(Ex);
				    f.add(QUN);
				    f.add(NUM);
				    f.add(panel);
				 	f.add(O1);
			      	f.add(O2);
			      	f.add(O3);
			      	f.add(O4); 	
			  }}
		      con.close();
	 		}catch(Exception ei)
 				{ System.out.println(ei);} 
				

		        f.setSize(900,500);
				f.setLayout(null);
				f.setVisible(true);
				f.setLocationRelativeTo(null); 
	}
}
