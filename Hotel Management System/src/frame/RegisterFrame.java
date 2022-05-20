package frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.border.LineBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.SwingConstants;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

// it is the registration Frame for register

public class RegisterFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	private JLabel lblNewLabel8;
	private JLabel lblNewLabel10;
	private JLabel lblNewLabel11;
	private JLabel lblNewLabel12;
	private boolean textField_1isempty=false,textField_2isempty=false,textField_3isempty=false;
	
	public RegisterFrame() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 100, 450, 619);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(32, 178, 170));
		contentPane.setBorder(new LineBorder(new Color(47, 79, 79), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//if user click the summit button  it check the fields and create Registration class , add this fields in the instance variable in the Registration class
	
		
		JLabel lblNewLabel5 = new JLabel("SUBMIT");
		lblNewLabel5.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) { 
				if(!(textField.getText().equals("")) && !(textField4.getText().equals("")) &&textField_1isempty==true&&textField_2isempty==true&&textField_3isempty==true
						&& !(textField1.getText().equals(""))  &&  !(textField2.getText().equals("")) && !(textField3.getText().equals("")) ){
				
				dispose();
				new NewFrame();
				(Validation.Regarray).add(new Registration(textField.getText(),textField1.getText(),textField2.getText(),textField3.getText(),textField4.getText()));
				(Validation.arrayCount)++;
				JOptionPane.showMessageDialog(contentPane, "Your informaton was sucessfully registered","Congratulation",JOptionPane.INFORMATION_MESSAGE);
			    }
				else {
					lblNewLabel12.setText("fill the form correctly");
				}
						
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel5.setBackground(new Color(0, 0, 0));	
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel5.setBackground(new Color(47, 79, 79));	
			}
		});
		lblNewLabel5.setForeground(new Color(255, 255, 255));
		lblNewLabel5.setOpaque(true);
		lblNewLabel5.setBackground(new Color(0, 128, 128));
		lblNewLabel5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel5.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		lblNewLabel5.setBounds(182, 548, 91, 30);
		contentPane.add(lblNewLabel5);
		
		JLabel lblNewLabel9 = new JLabel("REGISTRATION");
		lblNewLabel9.setBounds(70, 25, 291, 20);
		lblNewLabel9.setForeground(Color.WHITE);
		lblNewLabel9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel9.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
		contentPane.add(lblNewLabel9);
		
		//users first name field  
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		textField.setBorder(null);
		textField.setBounds(208, 98, 185, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		//phone number field
		
		textField1 = new JTextField();
		textField1.setHorizontalAlignment(SwingConstants.CENTER);
		textField1.addFocusListener(new FocusAdapter() {

			public void focusLost(FocusEvent e) {
				if((textField1.getText().length())!=10) {
					textField1.setText("");
					lblNewLabel8.setText("invalid phone no");
					textField_1isempty=false;
				}
				else {
					lblNewLabel8.setText("");
					textField_1isempty=true;
				}
			}
		});
		textField1.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		textField1.setBorder(null);
		textField1.setBounds(208, 160, 185, 30);
		contentPane.add(textField1);
		textField1.setColumns(10);
		
		
		// if user click the X button it imidiately close the program
		
		JLabel lblNewLabel1 = new JLabel("X");
		lblNewLabel1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "are you sure want to close","confirmation",JOptionPane.YES_NO_OPTION)==0) {
				System.exit(0);}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel1.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel1.setForeground(Color.WHITE);
			}
		});
		lblNewLabel1.setForeground(new Color(255, 255, 255));
		lblNewLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel1.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel1.setBounds(408, 17, 32, 30);
		contentPane.add(lblNewLabel1);
		
		JLabel lblNewLabel2 = new JLabel("NAME  :");
		lblNewLabel2.setForeground(new Color(255, 255, 255));
		lblNewLabel2.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		lblNewLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel2.setBounds(50, 104, 118, 20);
		contentPane.add(lblNewLabel2);
		
		JLabel lblNewLabel3 = new JLabel("PHONE NO   :");
		lblNewLabel3.setForeground(new Color(255, 255, 255));
		lblNewLabel3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel3.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		lblNewLabel3.setBounds(50, 166, 118, 20);
		contentPane.add(lblNewLabel3);
		
		
		//Username texfield
		
		textField2 = new JTextField();
		textField2.setHorizontalAlignment(SwingConstants.CENTER);
		textField2.addFocusListener(new FocusAdapter() {
			
		    //validate username when the focus lost
			
			public void focusLost(FocusEvent e) {
				if(!Validation.isUserValid(textField2.getText())){
					textField2.setText("");
					lblNewLabel10.setText("invalid Username type");
					textField_2isempty=false;
				}
				else {
					lblNewLabel10.setText("");
					textField_2isempty=true;
				}
				
			}
		});
		textField2.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		textField2.setBorder(null);
		textField2.setColumns(10);
		textField2.setBounds(208, 227, 185, 30);
		contentPane.add(textField2);
		
		//password password field
		
		textField3 = new JPasswordField();
		textField3.setHorizontalAlignment(SwingConstants.CENTER);
		textField3.addFocusListener(new FocusAdapter() {
			@Override
			// validate password when focus lost
			public void focusLost(FocusEvent e) {
				if(!Validation.isPasswordValid(textField3.getText())){
					textField3.setText("");
					lblNewLabel11.setText("invalid password type");
					textField_3isempty=false;
				}
				else {
					lblNewLabel11.setText("");
					textField_3isempty=true;
				}
				
			}
		});
		textField3.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		textField3.setBorder(null);
		textField3.setColumns(10);
		textField3.setBounds(208, 299, 185, 30);
		contentPane.add(textField3);
		
		JLabel lblNewLabel4 = new JLabel("USERNAME   :");
		lblNewLabel4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel4.setForeground(Color.WHITE);
		lblNewLabel4.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		lblNewLabel4.setBounds(50, 233, 118, 20);
		contentPane.add(lblNewLabel4);
		
		JLabel lblNewLabel6 = new JLabel("PASSWORD   :");
		lblNewLabel6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel6.setForeground(Color.WHITE);
		lblNewLabel6.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		lblNewLabel6.setBounds(50, 305, 118, 20);
		contentPane.add(lblNewLabel6);
		
		JLabel lblNewLabel7 = new JLabel("ADDRESS   :");
		lblNewLabel7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel7.setForeground(Color.WHITE);
		lblNewLabel7.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		lblNewLabel7.setBounds(50, 378, 118, 20);
		contentPane.add(lblNewLabel7);
		
	    lblNewLabel8 = new JLabel("");
	    lblNewLabel8.setForeground(new Color(255, 0, 0));
		lblNewLabel8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel8.setFont(new Font("Bahnschrift", Font.PLAIN, 11));
		lblNewLabel8.setBounds(208, 201, 185, 14);
		contentPane.add(lblNewLabel8);
		
		lblNewLabel10 = new JLabel("");
		lblNewLabel10.setForeground(new Color(255, 0, 0));
		lblNewLabel10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel10.setFont(new Font("Bahnschrift", Font.PLAIN, 11));
		lblNewLabel10.setBounds(208, 268, 185, 14);
		contentPane.add(lblNewLabel10);
		
	    lblNewLabel11 = new JLabel("");
	    lblNewLabel11.setForeground(new Color(255, 0, 0));
		lblNewLabel11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel11.setFont(new Font("Bahnschrift", Font.PLAIN, 11));
		lblNewLabel11.setBounds(208, 340, 185, 14);
		contentPane.add(lblNewLabel11);
		
		//address field
		
		textField4 = new JTextField();
		textField4.setBorder(null);
		textField4.setBounds(208, 377, 185, 132);
		contentPane.add(textField4);
		textField4.setColumns(10);
		
		lblNewLabel12 = new JLabel("");
		lblNewLabel12.setForeground(new Color(255, 0, 0));
		lblNewLabel12.setFont(new Font("Bahnschrift", Font.PLAIN, 11));
		lblNewLabel12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel12.setBounds(102, 589, 230, 14);
		contentPane.add(lblNewLabel12);
		setVisible(true);
		
	}
}
