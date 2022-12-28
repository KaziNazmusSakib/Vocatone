import javax.swing.JFrame;
//import javax.swing.event.ChangeListener;
import javax.swing.*;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class Home extends JFrame {

	JFrame frame              = new JFrame("Vocatone");
	JPanel panel1			  = new JPanel(); 
	JPanel panel2			  = new JPanel(); 
	JLabel label2             = new JLabel("VOCATONE");
   
   
	Home(){
		
		frame.setBounds(200,300,520,650);
		frame.getContentPane().setLayout(null);
		//frame.getContentPane().setBackground(new Color(0x3A3A3F));
		frame.setLocationRelativeTo(null);
		 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
	
		 	 
		panel1.setBackground(new Color(0x21272D));
		//panel1.setPreferredSize(new Dimension(500,600));
		panel1.setBounds(0,0,520,60);
		panel1.setVisible(true);
		panel1.setLayout(null);
		
		panel2.setBackground(new Color(0x373538));
		//panel1.setPreferredSize(new Dimension(500,600));
		panel2.setBounds(0,58,520,558);
		panel2.setVisible(true);
		panel2.setLayout(null);
		
		
		Icon icon= new ImageIcon("C:\\Users\\Asus\\Desktop\\Java Project\\Vocatone\\image\\playlist_st6rh80d4hw3_16.png");
		JButton playlistbutton	  = new JButton(icon);		
		playlistbutton.setBounds(0,10,50,40);
		playlistbutton.setForeground(new Color(0x5136F8));
		playlistbutton.setFont(new Font("Arial",Font.BOLD,8));
		playlistbutton.setFocusable(false);
		//playlistbutton.setBorder(new RoundedBorder(20)); 


		Icon icon1= new ImageIcon("C:\\Users\\Asus\\Desktop\\Java Project\\Vocatone\\image\\favourite_vayp5k37ei2e_16.png");
		JButton idbutton	  = new JButton(icon1);
		idbutton.setBounds(456,10,50,40);
		idbutton.setForeground(new Color(0xFFFFFF));
		idbutton.setFont(new Font("Arial",Font.BOLD,8));
		idbutton.setFocusable(false);
		//idbutton.setBorder(new RoundedBorder(20)); 
		
		Icon icon2= new ImageIcon("G:\\Vocatone\\image\\play.png") ;
		JButton playbutton	      = new JButton(icon2);
		playbutton.setBorder(new RoundedBorder(50));
		playbutton.setBounds(229,470,42,42);
		playbutton.setForeground(new Color(0xFFFFFF));
		playbutton.setBackground(new Color(0x373538));
		playbutton.setFont(new Font("Arial",Font.BOLD,8));
		playbutton.setFocusable(false);
		//playbutton.setBorder(new RoundedBorder(50));
	
		Icon icon3= new ImageIcon("G:\\Vocatone\\image\\next.png");
		JButton nextbutton	      = new JButton(icon3);
		nextbutton.setBounds(297,470,39,34);
		nextbutton.setForeground(new Color(0xFFFFFF));
		nextbutton.setBackground(new Color(0x373538));
		nextbutton.setFont(new Font("Arial",Font.BOLD,8));
		nextbutton.setFocusable(false);
		nextbutton.setVisible(true);
		//nextbutton.setBorder(new RoundedBorder(20));
		
		Icon icon4= new ImageIcon("G:\\Vocatone\\image\\previous.png");
		JButton previousbutton	  = new JButton(icon4);
		previousbutton.setBounds(162,470,39,34);
		previousbutton.setForeground(new Color(0xFFFFFF));
		previousbutton.setBackground(new Color(0x373538));
		previousbutton.setFont(new Font("Arial",Font.BOLD,8));
		previousbutton.setFocusable(false);
		//previousbutton.setBorder(new RoundedBorder(20));
		
		Icon icon5= new ImageIcon("C:\\Users\\Asus\\Desktop\\Java Project\\Vocatone\\image\\love_jmfu4w9u80ez_16.png");
		JButton likebutton        = new JButton(icon5);	
		likebutton.setBounds(424,450,30,33);
		likebutton.setForeground(new Color(0xFFFFFF));
		likebutton.setFont(new Font("Arial",Font.BOLD,8));
		likebutton.setFocusable(false);
		//likebutton.setBorder(new RoundedBorder(20));
		
		Icon icon6= new ImageIcon("G:\\Vocatone\\image\\Castle_Of_Glass.jpeg");
		JLabel label1             = new JLabel(icon6);
		label1.setBounds(115,28,274,380);
		label1.setFont(new Font("Arial",Font.BOLD,15));
		label1.setBorder(new RoundedBorder(25));
		label1.setOpaque(true);
		//graphics.setColor(getBackground());
        //graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height);
       // graphics.setColor(getForeground());
        //graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height);
		label1.setFocusable(false);
		
		label2.setBounds(160,486,176,17);
		//label2.setBounds(200,15,100,50);
		label2.setForeground(Color.white);
		label2.setFont(new Font("Arial",Font.BOLD,15));
		
	
		panel1.add(playlistbutton);
		panel1.add(idbutton);
		panel1.add(label2);
		panel2.add(playbutton);
		panel2.add(nextbutton);
		panel2.add(previousbutton);
		panel2.add(likebutton);
		frame.add(panel1);
		frame.add(panel2);
		panel2.add(label1);
		
		frame.setVisible(true);	
	}
	
}
