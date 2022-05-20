package frame;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Image;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

// It is the frame for Login Page 


public class NewFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textUsername;
	private JTextField txtPassword;
	private String username;
	private String password;
	private JLabel lblNewLabel6 ;
				
	
	public NewFrame() {
	    setLocationRelativeTo(null);
		setResizable(false);
		setUndecorated(true);
		setTitle("Login Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 300, 465, 284);
	

		
		ImageIcon Image1=new ImageIcon(new ImageIcon("C:\\Users\\mathan.thirumugam\\Downloads\\hotelicon.png").getImage().getScaledInstance(90,90,Image.SCALE_DEFAULT));
		ImageIcon Image2=new ImageIcon(new ImageIcon("C:\\Users\\mathan.thirumugam\\Downloads\\usericon.jpg").getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT));
		ImageIcon Image3=new ImageIcon(new ImageIcon("C:\\Users\\mathan.thirumugam\\Downloads\\passicon.jpg").getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT));
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(32, 178, 170));
		contentPane.setBorder(new LineBorder(new Color(0, 128, 128), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// if user click the login button it go for validation to check password and user name
		
		JLabel lblNewLabel5 = new JLabel("LOG IN");
		lblNewLabel5.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				username=textUsername.getText();
				password=txtPassword.getText();
				lblNewLabel6.setText(Validation.login(username,password));
				if(Validation.login(username,password).equals("New")) {
					dispose();
					JOptionPane.showMessageDialog(contentPane, "Your are Logined sucessfully ",
                            "Congratulation",
                            JOptionPane.INFORMATION_MESSAGE);
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
		
		JLabel lblNewLabel4 = new JLabel("");
		lblNewLabel4.setIcon(Image3);
		lblNewLabel4.setBounds(315, 165, 30, 30);
		contentPane.add(lblNewLabel4);
		
		JLabel lblNewLabel1 = new JLabel("");
		lblNewLabel1.setBounds(315, 124, 30, 30);
		lblNewLabel1.setIcon(Image2);
		contentPane.add(lblNewLabel1);
		lblNewLabel5.setFont(new Font("Bahnschrift", Font.BOLD, 12));
		lblNewLabel5.setForeground(new Color(255, 255, 255));
		lblNewLabel5.setOpaque(true);
		lblNewLabel5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel5.setBackground(new Color(47, 79, 79));
		lblNewLabel5.setBounds(173, 232, 129, 30);
		contentPane.add(lblNewLabel5);
		
		// if user click the X button it imidiately close the program
		
		JLabel lblNewLabel2 = new JLabel("X");
		lblNewLabel2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "are you sure want to close","confirmation",JOptionPane.YES_NO_OPTION)==0) {
				System.exit(0);}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel2.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel2.setForeground(Color.WHITE);
			}
		});
		lblNewLabel2.setForeground(Color.WHITE);
		lblNewLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel2.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel2.setBounds(432, 11, 23, 19);
		contentPane.add(lblNewLabel2);
		
		JLabel lblNewLabel3 = new JLabel("");
		lblNewLabel3.setBounds(191, 11, 90, 88);
		lblNewLabel3.setIcon(Image1);
		contentPane.add(lblNewLabel3);
		
		lblNewLabel6 = new JLabel("");
		lblNewLabel6.setForeground(new Color(255, 0, 0));
		lblNewLabel6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel6.setFont(new Font("Bahnschrift", Font.PLAIN, 11));
		lblNewLabel6.setBounds(116, 211, 234, 14);
		contentPane.add(lblNewLabel6);
		
		// txt field for password 
		
		txtPassword = new JPasswordField();
		txtPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtPassword.getText().equals("PASSWORD")) {
					txtPassword.setText("");
				}
				else {
					txtPassword.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtPassword.getText().equals("")) {
					txtPassword.setText("PASSWORD");
				}
			}
		});
		txtPassword.setBorder(null);
		txtPassword.setHorizontalAlignment(SwingConstants.CENTER);
		txtPassword.setBounds(116, 170, 165, 25);
		contentPane.add(txtPassword);
		txtPassword.setForeground(new Color(0, 128, 128));
		txtPassword.setFont(new Font("Arial", Font.BOLD, 13));
		txtPassword.setText("PASSWORD");
		txtPassword.setColumns(10);
		
		//text field for username
		
		textUsername = new JTextField();
		textUsername.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(textUsername.getText().equals("USERNAME")) {
					textUsername.setText("");
				}
				else {
					textUsername.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(textUsername.getText().equals("")) {
					textUsername.setText("USERNAME");
				}
			}
		});
		textUsername.setHorizontalAlignment(SwingConstants.CENTER);
		textUsername.setBorder(null);
		textUsername.setBounds(116, 129, 165, 25);
		contentPane.add(textUsername);
		textUsername.setForeground(new Color(0, 139, 139));
		textUsername.setFont(new Font("Bahnschrift", Font.BOLD, 12));
		textUsername.setText("USERNAME");
		textUsername.setColumns(10);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(255, 255, 255));
		panel1.setBounds(116, 165, 234, 32);
		contentPane.add(panel1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(116, 124, 234, 32);
		contentPane.add(panel);
		
		// if user click the new user it go to Registration frame
		
		JLabel lblNewLabel7 = new JLabel("New User ?");
		lblNewLabel7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				    dispose();
				   new RegisterFrame();
				   
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel7.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel7.setForeground(Color.WHITE);
			}
		});
		lblNewLabel7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel7.setBackground(new Color(47, 79, 79));
		lblNewLabel7.setForeground(new Color(255, 255, 255));
		lblNewLabel7.setFont(new Font("Bahnschrift", Font.BOLD, 12));
		lblNewLabel7.setBounds(10, 21, 74, 19);
		contentPane.add(lblNewLabel7);
		setVisible(true);
	}
}