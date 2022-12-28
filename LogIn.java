
import javax.swing.JFrame;
//import javax.swing.event.ChangeListener;
import javax.swing.*;
import java.awt.*;
import javax.swing.JButton;
import java.awt.event.*;

public class LogIn extends JFrame implements ActionListener {

	JFrame frame              = new JFrame("Vocatone");
	JButton loginbutton	      = new JButton("Login");
	JButton registerbutton    = new JButton("Register");   
	JLabel label1             = new JLabel("Vocatone");
	JLabel userlebel          = new JLabel("Email: ");
	JTextField usertextfield  = new JTextField();
	JLabel passwordlabel      = new JLabel("Password: ");
    JPasswordField passwordField = new JPasswordField(); 
	JPanel panel1			  = new JPanel(); 
	JCheckBox showpassword    = new JCheckBox();

	
	LogIn(){
		
		frame.setBounds(200,300,520,650);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(new Color(0x262626));
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		panel1.setBackground(new Color(0x262626));
		//panel1.setPreferredSize(new Dimension(500,600));
		panel1.setBounds(0,0,500,600);
		panel1.setVisible(true);
		panel1.setLayout(null);
		
		usertextfield.setBounds(51,238,397,48);
		passwordField.setBounds(51,341,397,48);
		showpassword.setBounds(455,371,20,20);
		showpassword.setBackground(new Color(0x262626));
		
		loginbutton.setBounds(51,420,110,36);
		loginbutton.setForeground(new Color(0x5136F8));
		loginbutton.setFont(new Font("Arial",Font.BOLD,6));
		loginbutton.setFocusable(false);
		//loginbutton.setBorder(new RoundedBorder(20)); 

		registerbutton.setBounds(185,420,110,36);
		registerbutton.setForeground(new Color(0x5136F8));
		registerbutton.setFont(new Font("Arial",Font.BOLD,8));
		registerbutton.setFocusable(false);
		//loginbutton.setBorder(new RoundedBorder(20)); 
		
		label1.setBounds(169,31,250,45);
		label1.setForeground(Color.white);
		label1.setFont(new Font("Kavoon",Font.BOLD,22));
		
		userlebel.setBounds(51,209,250,19);
		userlebel.setForeground(Color.white);
		userlebel.setFont(new Font("Arial",Font.BOLD,15));
		
		passwordlabel.setBounds(51,312,250,19);
		passwordlabel.setForeground(Color.white);
		passwordlabel.setFont(new Font("Arial",Font.BOLD,15));
		
		panel1.add(loginbutton);
		panel1.add(registerbutton);
		panel1.add(label1);
		panel1.add(userlebel);
		panel1.add(usertextfield);
		panel1.add(passwordlabel);
		panel1.add(passwordField);
		panel1.add(showpassword);
		frame.add(panel1);
			
	
	
		//loginbutton.addActionListener(new ActionListener()){	
	
		//public void actionEvent(){
		//loginbutton.addActionListener(this);
		//registerbutton.addActionListener(this);
		//}
		// 
		 
		loginbutton.addActionListener(this); 
		registerbutton.addActionListener(this);
		showpassword.addActionListener(this);  
		
	}	 
	
	public void  actionPerformed(ActionEvent ae)
		 {
		    if(ae.getSource()==loginbutton)
			{
			   String userText=usertextfield.getText();
			   String pwdText=passwordField.getText();
			   if(userText.equalsIgnoreCase("mehtab")&& pwdText.equalsIgnoreCase("12345"))
			   {
			    JOptionPane.showMessageDialog(this,"Login Successful");
			       Home h = new Home();
			       h.setVisible(true);
			   }
			    else
				{
				    JOptionPane.showMessageDialog(this,"Invalid UserName or Password");
			 	}
			}
		    if(ae.getSource()==registerbutton)
			{
				usertextfield.setText("");
				passwordField.setText("");
				Registration r =new Registration();
		    	r.setVisible(true);
			}		
			if(ae.getSource()==showpassword)
			{
			  if(showpassword.isSelected())
			  {
				  passwordField.setEchoChar((char)0);
			  }	
			  else
			  {
				  passwordField.setEchoChar('*');
			  }
			}
		 }
}	

 