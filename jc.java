package trialGUI;
import java.time.LocalTime; 
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class jc extends JFrame {

	private JPanel contentPane;
	private JTextField Fieldtext;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jc frame = new jc();
						
					frame.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println(e);
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public jc() {
		double start = LocalTime.now().toNanoOfDay();                                 // my trick .
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1310, 684);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(244, 164, 96));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type ");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial Black", Font.ITALIC, 16));
		lblNewLabel.setBounds(44, 79, 1070, 86);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been\r\n");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Arial Black", Font.ITALIC, 16));
		lblNewLabel_1.setBounds(44, 34, 1016, 68);
		contentPane.add(lblNewLabel_1);
		
		Fieldtext = new JTextField();
		Fieldtext.setBounds(26, 359, 1179, 122);
		contentPane.add(Fieldtext);
		Fieldtext.setColumns(10);
		String words = Fieldtext.getText();                                      // random trick                                         
		int k = Fieldtext.getText().length();                                  // random trick    
		
		JLabel lblNewLabel_2 = new JLabel("and  scrambled it to make a type specimen book.");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.ITALIC, 16));
		lblNewLabel_2.setBounds(54, 161, 637, 39);
		contentPane.add(lblNewLabel_2);
		
		JButton SubmitBtn = new JButton("Submit");
		SubmitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double end = LocalTime.now().toNanoOfDay();               // my trick ;
				double typetime = (end - start)/1000000000.0; 						// my trick ;
				double inmin  = (typetime)/60;
				double yourspeed=  (int) (43/5/inmin);
				JOptionPane.showMessageDialog(SubmitBtn, " Congratulation !!!!!!       Your typing speed is "+yourspeed+" words per minutes");
				
			}
		});
		SubmitBtn.setFont(new Font("Arial Black", Font.ITALIC, 16));
		SubmitBtn.setBackground(new Color(51, 255, 102));
		SubmitBtn.setBounds(447, 527, 163, 53);
		contentPane.add(SubmitBtn);
	}
}
