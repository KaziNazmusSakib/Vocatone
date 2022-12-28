import javax .swing.*;
import java.awt.*;
import java.awt.event.*;

class Registration extends JFrame implements ActionListener {

	private Container c;
	private JLabel title;
	private JLabel name;
	private JTextField tname;
	private JLabel mail;
	private JTextField tmail;
	private JLabel pass;
	private JPasswordField tpass;
	private JLabel repass;
	private JPasswordField trepass;
	private JLabel mno;
	private JTextField tmno;
	private JLabel gender;
	private JRadioButton male;
	private JRadioButton female;
	private ButtonGroup gengp;
	private JLabel dob;
	private JComboBox date;
	private JComboBox month;
	private JComboBox year;
	private JLabel add;
	private JComboBox tadd;
	private JCheckBox term;
	private JButton sub;
	private JButton reset;
	private JTextArea tout;
	private JLabel res;
	private JTextArea resadd;
	
	private String dates[] = { "1", "2", "3", "4", "5",
							   "6", "7", "8", "9", "10", 
							   "11","12", "13", "14", "15",
								"16", "17", "18", "19", "20",
								"21", "22", "23", "24", "25",
								"26", "27", "28", "29", "30",
								"31"};
	private String months[]={ "Jan", "feb", "Mar", "Apr", 
							 "may", "Jun", "July","Aug",
							 "Sup", "Oct", "Nov", "Dec" };

	private String years[]={ "1995", "1996", "1997", "1998", "1999",
							 "2000", "2001" ,"2002" ,"2003", "2004",
 							 "2005" ,"2006" ,"2007", "2008", "2009", 
							 "2010", "2011", "2012", "2013", "2014", 
							 "2015", "2016", "2017", "2018", "2019"};
							 
	private String countries[]={ "Argentina", "France" , "Brazil", "India",
								 "Morocco", "Turkie", "Korea", "Greece",
								 "Portugal", "Spain", "America", "Colombia",
								 "Jarmany", "UAE", "Japan", "Bangladesh", 
								 "Netherlands", "Norway", "Sweden", "Russia"};			
	public Registration()
	{
		setTitle("Registration");
		setBounds(200,300,520,650);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setForeground(new Color(0x495B53));
		
		c = getContentPane();
		c.setLayout(null);
		
		title = new JLabel("Registration");
		title.setBounds(100,30,150,50);
		title.setFont(new Font("Arial",Font.PLAIN,20));
		c.add(title);
		
		name = new JLabel("Name");
		name.setFont(new Font("Ariel",Font.PLAIN,20));
		name.setSize(100,20);
		name.setLocation(100,100);
		c.add(name);
		
		tname = new JTextField();
		tname.setFont(new Font("Ariel",Font.PLAIN,15));
		tname.setSize(190,20);
		tname.setLocation(200,100);
		c.add(tname);
		
		mail = new JLabel("Email");
		mail.setFont(new Font("Ariel",Font.PLAIN,20));
		mail.setSize(100,20);
		mail.setLocation(100,130);
		c.add(mail);
		
		tmail = new JTextField();
		tmail.setFont(new Font("Ariel",Font.PLAIN,15));
		tmail.setSize(190,20);
		tmail.setLocation(200,130);
		c.add(tmail);
		 
		mno = new JLabel("Mobile");
		mno.setFont(new Font("Ariel",Font.PLAIN,20));
		mno.setSize(100,20);
		mno.setLocation(100,160);
		c.add(mno);
		
		tmno = new JTextField();
		tmno.setFont(new Font("Ariel",Font.PLAIN,15));
		tmno.setSize(190,20);
		tmno.setLocation(200,160);
		c.add(tmno);
		
		pass = new JLabel("Password");
		pass.setFont(new Font("Ariel",Font.PLAIN,20));
		pass.setSize(100,20);
		pass.setLocation(100,190);
		c.add(pass);
		
		tpass = new JPasswordField();
		tpass.setFont(new Font("Ariel",Font.PLAIN,15));
		tpass.setSize(190,20);
		tpass.setLocation(200,190);
		c.add(tpass);

		repass = new JLabel("Re-Password");
		repass.setFont(new Font("Ariel",Font.PLAIN,20));
		repass.setSize(100,20);
		repass.setLocation(60,220);
		c.add(repass);
		
		trepass = new JPasswordField();
		trepass.setFont(new Font("Ariel",Font.PLAIN,15));
		trepass.setSize(190,20);
		trepass.setLocation(200,220);
		c.add(trepass);
		
		gender = new JLabel("Gender");
		gender.setFont(new Font("Ariel",Font.PLAIN,20));
		gender.setSize(100,20);
		gender.setLocation(100,250);
		c.add(gender);
		
		male = new JRadioButton("Male");
		male.setFont(new Font("Cooper Black MS",Font.PLAIN,15));
		male.setSelected(false);
		male.setSize(75,20);
		male.setLocation(200,250);
		c.add(male);
		
		female = new JRadioButton("Female");
		female.setFont(new Font("Cooper Black MS",Font.PLAIN,15));
		female.setSelected(false);
		female.setSize(80,20);
		female.setLocation(275,250);
		c.add(female);
		
		gengp = new ButtonGroup();
		gengp.add(male);
		gengp.add(female);
		
		dob = new JLabel("DOB");
		dob.setFont(new Font("Arial",Font.PLAIN,20));
		dob.setSize(100,20);
		dob.setLocation(100,300);
		c.add(dob);
		
		date = new JComboBox(dates);
		date.setFont(new Font("Arial",Font.PLAIN,15));
		date.setSize(50,20);
		date.setLocation(200,300); 
		c.add(date);
		
		month = new JComboBox(months);
		month.setFont(new Font("Arial",Font.PLAIN,15));
		month.setSize(60,20);
		month.setLocation(260,300);
		c.add(month);
		
		year = new JComboBox(years);
		year.setFont(new Font("Arial",Font.PLAIN,15));
		year.setSize(60,20);
		year.setLocation(330,300);
		c.add(year);
		
		add = new JLabel("Region");
		add.setFont(new Font("Arial",Font.PLAIN,20));
		add.setSize(100,20);
		add.setLocation(100,350);
		c.add(add);
		
		tadd = new JComboBox(countries);
		tadd.setFont(new Font("Ariel",Font.PLAIN,15));
		tadd.setSize(90,30);
		tadd.setLocation(200,350);
		//tadd.setLineWrap(true);
		c.add(tadd);
		
		term = new JCheckBox("Accept Terms And Condtions.");
		term.setFont(new Font("Ariel",Font.PLAIN,15));
		term.setSize(250,20);
		term.setLocation(150,400);
		c.add(term);
		
		sub = new JButton("Submit");
		sub.setFont(new Font("Arial",Font.PLAIN,15));
		sub.setSize(100,20);
		sub.setLocation(150,450);
		sub.addActionListener(this);
		c.add(sub);
		
		reset = new JButton("Reset");
		reset.setFont(new Font("Arial",Font.PLAIN,15));
		reset.setSize(100,20);
		reset.setLocation(270,450);
		reset.addActionListener(this);
		c.add(reset);
		
		tout = new JTextArea();
		tout.setFont(new Font("Arial",Font.PLAIN,15));
		tout.setSize(300,400);
		tout.setLocation(500,100);
		tout.setLineWrap(true);
		tout.setEditable(false);
		c.add(tout);

		res = new JLabel("");
		res.setFont(new Font("Arial", Font.PLAIN,20));
		res.setSize(500, 25);
		res.setLocation(100, 500);
		c.add(res);
		
		resadd = new JTextArea();
		resadd.setFont(new Font("Arial",Font.PLAIN ,15));
		resadd.setSize(200,75);
		resadd.setLocation(580,175);
		resadd.setLineWrap(true);
		c.add(resadd);

		setVisible(true);	
	}	
		
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource() == sub){
			if(term.isSelected()){
				String data1;
				String data = "Name :"+ tname.getText() + "\n" + "Mobile : " + tmno.getText() + "\n" + "Email : " + tmail.getText() + "\n";
				data+= "Password :" + new String(tpass.getText()) + "Re Password :" + new String (trepass.getText());
				if(male.isSelected()) 
					data1 = "Gender : Male" + "\n";
				else
					data1 = "Gender : Female" + "\n";
				String data2 = "DOB : " + (String)date.getSelectedItem() + "/" + (String)month.getSelectedItem() + "/" + (String)year.getSelectedItem() + "\n"; 
				String data3 = "Region : " +(String)tadd.getSelectedItem() + "\n";
				tout.setText(data + data1 + data2 +data3);
				tout.setEditable(false);
				res.setText("Registration Successfully..");
			}
			else{
				tout.setText("");
				resadd.setText("");
				res.setText("Please accept the" + "terms & condition..");
				
			}
		}
		
		else if (e.getSource() == reset){
			String def = "";
			tname.setText(def);
			tmail.setText(def);	
			tmno.setText(def);
			tpass.setText(def);
			trepass.setText(def);
			res.setText(def);
			tout.setText(def);
			term.setSelected(false);
			date.setSelectedIndex(0);
			month.setSelectedIndex(0);
			year.setSelectedIndex(0);
			tadd.setSelectedIndex(0);
			resadd.setText(def);
		}	
	}
}

 