import javax.swing.JFrame;
//import javax.swing.event.ChangeListener;
import javax.swing.*;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.*;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.IOException;
import javax.sound.sampled.*;

public class Home extends JFrame {

	JFrame frame = new JFrame("Vocatone");
	JPanel panelOne = new JPanel();
	JPanel panelTwo = new JPanel();
	JLabel label2 = new JLabel("VOCATONE");
	JButton playListButton = new JButton("PLAYLIST");
	JButton playButton = new JButton("PLAY");
	JButton idButton = new JButton("ID");
	JButton nextButton = new JButton("NEXT");
	JButton previousButton = new JButton("PREVIOUS");
	JButton likeButton = new JButton("LIKE");
	JLabel label1;

	int currenFileIndex = 0;
	// current status of clip
	Clip clip;

	// current status of clip
	String status;

	AudioInputStream audioInputStream;
	Long currentFrame;

	private String songs[] = { "BabyElephantWalk60.wav", "CantinaBand3.wav",
			"CantinaBand60.wav", "CantinaBand60.wav",
			"JACKSON_WANG_-_BLOW", "JIN_-_Yours",
			"Linkin_Park_-_In_the_End", "Linkin_Park_-_Numb",
			"NEFFEX_-_Best_of_Me", "PSY_feat._SUGA_-_That_That",
			"RISE", "Starset_MyDemons" };

	Home() {

		this.configureFrame();
		this.configurePanelOne();
		this.configurePanelTwo();
		configureIdButton();
		configurePlayButton();
		configurePlayListButton();
		configureNextButton();
		configurePreviousButton();
		configureLikeButton();
		configureLabelOne();
		configureLabelTwo();
		configureFrameUI();
	}

	void configureFrameUI() {
		panelTwo.add(playButton);
		panelTwo.add(nextButton);
		panelTwo.add(previousButton);
		panelTwo.add(likeButton);
		panelOne.add(playListButton);
		panelOne.add(idButton);
		panelOne.add(label2);
		frame.add(panelOne);
		frame.add(panelTwo);
		panelTwo.add(label1);
		frame.setVisible(true);
	}

	void configureFrame() {
		frame.setBounds(200, 300, 800, 600);
		frame.getContentPane().setLayout(null);
		// frame.getContentPane().setBackground(new Color(0x3A3A3F));
		frame.setLocationRelativeTo(null);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
	}

	void configurePanelOne() {
		panelOne.setBackground(new Color(0x21272D));
		// panel1.setPreferredSize(new Dimension(500,600));
		panelOne.setBounds(0, 0, 800, 60);
		panelOne.setVisible(true);
		panelOne.setLayout(null);
	}

	void configurePlayListButton() {
		Icon icon = new ImageIcon(
				"C:\\Users\\Asus\\Desktop\\Java Project\\Vocatone\\image\\playlist_st6rh80d4hw3_16.png");
		this.playListButton.setIcon(icon);
		this.playListButton.setBounds(0, 10, 150, 40);
		this.playListButton.setFocusable(false);
		// playListButton.setBorder(new RoundedBorder(20));
	}

	void configurePanelTwo() {
		panelTwo.setBackground(new Color(0x373538));
		// panelOne.setPreferredSize(new Dimension(500,600));
		panelTwo.setBounds(0, 58, 800, 558);
		panelTwo.setVisible(true);
		panelTwo.setLayout(null);

	}

	void configurePlayButton() {
		Icon icon2 = new ImageIcon("G:\\Vocatone\\image\\play.png");
		playButton.setIcon(icon2);
		playButton.setBorder(new RoundedBorder(50));
		playButton.setBounds(229, 470, 150, 42);
		playButton.setFocusable(false);
		playButton.setBorder(new RoundedBorder(50));

		playButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (status == "play") {
					pause();
				} else {
					if (currenFileIndex >= 0 && currenFileIndex < songs.length) {

						var currentFileLocation = "music/" + songs[currenFileIndex];
						try {

							playAudioFile(currentFileLocation);

						} catch (Exception ex) {
							System.out.println(ex.getMessage());
						}
					}
				}
			}

		});

	}

	void configureIdButton() {
		Icon icon1 = new ImageIcon(
				"C:\\Users\\Asus\\Desktop\\Java Project\\Vocatone\\image\\favourite_vayp5k37ei2e_16.png");
		idButton.setIcon(icon1);
		idButton.setBounds(456, 10, 50, 40);
		idButton.setFocusable(false);
		idButton.setText("ID");
		// idButton.setBorder(new RoundedBorder(20));

	}

	void configureNextButton() {
		Icon icon3 = new ImageIcon("G:\\Vocatone\\image\\next.png");
		nextButton.setIcon(icon3);
		nextButton.setBounds(297, 470, 39, 34);
		nextButton.setFont(new Font("Arial", Font.BOLD, 8));
		nextButton.setFocusable(false);
		nextButton.setVisible(true);
		nextButton.setText("NEXT");
		// nextButton.setBorder(new RoundedBorder(20));
	}

	void configurePreviousButton() {
		Icon icon4 = new ImageIcon("G:\\Vocatone\\image\\previous.png");
		previousButton.setIcon(icon4);
		previousButton.setBounds(162, 470, 39, 34);
		previousButton.setBackground(new Color(0x373538));
		previousButton.setFocusable(false);
		// previousButton.setBorder(new RoundedBorder(20));
		previousButton.setText("PREVIOUS");

	}

	void configureLikeButton() {
		Icon icon5 = new ImageIcon("C:\\Users\\Asus\\Desktop\\Java Project\\Vocatone\\image\\love_jmfu4w9u80ez_16.png");
		likeButton.setIcon(icon5);
		likeButton.setBounds(424, 450, 30, 33);
		likeButton.setFont(new Font("Arial", Font.BOLD, 8));
		likeButton.setFocusable(false);
		// likeButton.setBorder(new RoundedBorder(20));
		likeButton.setText("LIKE");
	}

	void configureLabelOne() {
		Icon icon6 = new ImageIcon("G:\\Vocatone\\image\\Castle_Of_Glass.jpeg");
		label1 = new JLabel(icon6);
		label1.setBounds(115, 28, 274, 380);
		label1.setFont(new Font("Arial", Font.BOLD, 15));
		label1.setBorder(new RoundedBorder(25));
		label1.setOpaque(true);
		// graphics.setColor(getBackground());
		// graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height);
		// graphics.setColor(getForeground());
		// graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height);
		label1.setFocusable(false);
	}

	void configureLabelTwo() {

		label2.setBounds(160, 486, 176, 17);
		// label2.setBounds(200,15,100,50);
		label2.setForeground(Color.white);
		label2.setFont(new Font("Arial", Font.BOLD, 15));
	}

	public void playAudioFile(String fileName)
			throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		File file = new File(fileName);
		System.out.println(file.getAbsolutePath());
		this.audioInputStream = AudioSystem.getAudioInputStream(file);
		clip = AudioSystem.getClip();
		clip.open(this.audioInputStream);
		clip.start();
		status = "play";
	}

	// Method to pause the audio
	public void pause() {
		if (status.equals("paused")) {
			System.out.println("audio is already paused");
			return;
		}
		this.currentFrame = this.clip.getMicrosecondPosition();
		clip.stop();
		status = "paused";
	}

}
