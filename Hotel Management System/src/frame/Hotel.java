package frame;


import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;
import javax.swing.JScrollPane;
import com.toedter.calendar.JCalendar;


public class Hotel extends JFrame {

	private JPanel contentPane;
    private String UserName;
    private JPanel panel2 ;
    private JPanel panel3 ;
    private JPanel panel4 ;
    private JPanel panel5 ;
    private JPanel panel6 ;
    private JPanel panel7 ;
    private JComboBox comboBox3;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JCalendar calendar_1;
    private JCalendar calendar;
    private JTextPane textPane;
    private String roomtype[]={"Standard Room","Luxury Room","Fortune Room"};		
    private String bedcount[]={"Single Bed","Double Bed","Triple Bed"};
    private String noofperson[]={"1","2","3","4","5","6"};
    
    
	public Hotel(String user) {
		this.UserName=user;
		(Validation.Roomarray).add(new Room("room_no_1","available","Standard Room","Single Bed"));
		(Validation.Roomarray).add(new Room("room_no_2","available","Standard Room","Single Bed"));
		(Validation.Roomarray).add(new Room("room_no_3","available","Standard Room","Single Bed"));
		(Validation.Roomarray).add(new Room("room_no_4","available","Standard Room","Single Bed"));
		(Validation.Roomarray).add(new Room("room_no_5","available","Standard Room","Single Bed"));
		(Validation.Roomarray).add(new Room("room_no_6","available","Standard Room","Double Bed"));
		(Validation.Roomarray).add(new Room("room_no_7","available","Standard Room","Double Bed"));
		(Validation.Roomarray).add(new Room("room_no_8","available","Standard Room","Double Bed"));
		(Validation.Roomarray).add(new Room("room_no_9","available","Standard Room","Triple Bed"));
		(Validation.Roomarray).add(new Room("room_no_10","available","Standard Room","Triple Bed"));
		(Validation.Roomarray).add(new Room("room_no_11","available","Luxury Room","Single Bed"));
		(Validation.Roomarray).add(new Room("room_no_12","available","Luxury Room","Single Bed"));
		(Validation.Roomarray).add(new Room("room_no_13","available","Luxury Room","Single Bed"));
		(Validation.Roomarray).add(new Room("room_no_14","available","Luxury Room","Single Bed"));
		(Validation.Roomarray).add(new Room("room_no_15","available","Luxury Room","Single Bed"));
		(Validation.Roomarray).add(new Room("room_no_16","available","Luxury Room","Double Bed"));
		(Validation.Roomarray).add(new Room("room_no_17","available","Luxury Room","Double Bed"));
		(Validation.Roomarray).add(new Room("room_no_18","available","Luxury Room","Double Bed"));
		(Validation.Roomarray).add(new Room("room_no_19","available","Luxury Room","Triple Bed"));
		(Validation.Roomarray).add(new Room("room_no_20","available","Luxury Room","Triple Bed"));
		(Validation.Roomarray).add(new Room("room_no_21","available","Fortune Room","Single Bed"));	
		(Validation.Roomarray).add(new Room("room_no_22","available","Fortune Room","Single Bed"));
		(Validation.Roomarray).add(new Room("room_no_23","available","Fortune Room","Single Bed"));
		(Validation.Roomarray).add(new Room("room_no_24","available","Fortune Room","Single Bed"));
		(Validation.Roomarray).add(new Room("room_no_25","available","Fortune Room","Single Bed"));
		(Validation.Roomarray).add(new Room("room_no_26","available","Fortune Room","Double Bed"));
		(Validation.Roomarray).add(new Room("room_no_27","available","Fortune Room","Double Bed"));
		(Validation.Roomarray).add(new Room("room_no_28","available","Fortune Room","Double Bed"));
		(Validation.Roomarray).add(new Room("room_no_29","available","Fortune Room","Triple Bed"));
		(Validation.Roomarray).add(new Room("room_no_30","available","Fortune Room","Triple Bed"));
	
		
		ImageIcon Image1=new ImageIcon(new ImageIcon("C:\\Users\\mathan.thirumugam\\Downloads\\hotelicon.png").getImage().getScaledInstance(90,90,Image.SCALE_DEFAULT));
		ImageIcon Image2=new ImageIcon(new ImageIcon("C:\\Users\\mathan.thirumugam\\Downloads\\house-icon.png").getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT));
		ImageIcon Image3=new ImageIcon(new ImageIcon("C:\\Users\\mathan.thirumugam\\Downloads\\2534679.png").getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT));
		ImageIcon Image4=new ImageIcon(new ImageIcon("C:\\Users\\mathan.thirumugam\\Downloads\\fil.png").getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT));
		ImageIcon Image5=new ImageIcon(new ImageIcon("C:\\Users\\mathan.thirumugam\\Downloads\\2331980.png").getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT));
		ImageIcon Image6=new ImageIcon(new ImageIcon("C:\\Users\\mathan.thirumugam\\Downloads\\gallery.png").getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT));
		ImageIcon Image7=new ImageIcon(new ImageIcon("C:\\Users\\mathan.thirumugam\\Downloads\\abt.png").getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT));
		ImageIcon Image8=new ImageIcon(new ImageIcon("C:\\Users\\mathan.thirumugam\\Downloads\\logout1.jpg").getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT));
		SimpleDateFormat datef=new 	SimpleDateFormat("dd-MM-yyyy"); 
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(32, 178, 170));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	      
	      panel7 = new JPanel();
	      panel7.setOpaque(false);
	      panel7.setBounds(347, 35, 643, 554);	
	      panel7.setBackground(new Color(51, 153, 102));
	      panel7.setVisible(false);
	      
	    panel6 = new JPanel();
	    panel6.setOpaque(false);
	    panel6.setBounds(347, 35, 643, 554);
	    panel6.setBackground(new Color(102, 102, 204));
	    panel6.setVisible(false);
	    
        panel5 = new JPanel();
        panel5.setOpaque(false);
        panel5.setBounds(347, 35, 643, 554);
        panel5.setBackground(new Color(51, 255, 0));
        panel5.setVisible(false);
        
         panel3 = new JPanel();
         panel3.setOpaque(false);
         panel3.setVisible(false);
         
         panel4 = new JPanel();
         panel4.setOpaque(false);
         panel4.setBounds(347, 35, 643, 554);
         panel4.setBackground(new Color(204, 0, 0));
         panel4.setVisible(false);
         contentPane.add(panel4);
         panel4.setLayout(null);
         
         JLabel lblNewLabel41 = new JLabel("Reserve");
         lblNewLabel41.addMouseListener(new MouseAdapter() {
         	@Override
         	public void mouseEntered(MouseEvent e) {
         		  lblNewLabel41.setBackground(Color.black);
         	}
         	@Override
         	public void mouseExited(MouseEvent e) {
         		  lblNewLabel41.setBackground(Color.LIGHT_GRAY);
         	}
         	@Override
         	public void mouseClicked(MouseEvent e) {
         	
         	    String Roomno=Validation.isRoomAvail((String)comboBox1.getSelectedItem(),(String)comboBox2.getSelectedItem());
         	    String checkin=datef.format(calendar.getDate());
         	   String checkout=datef.format(calendar_1.getDate());
         		if(Roomno.equals("0")) {
         			JOptionPane.showMessageDialog(contentPane,(String)comboBox1.getSelectedItem()+""+(String)comboBox2.getSelectedItem()+" is unavailable",
                             "Failed",
                             JOptionPane.ERROR_MESSAGE);
         		}
         		else {
         			(Validation.book).add(new Bookings(user,(String)comboBox1.getSelectedItem(),(String)comboBox2.getSelectedItem(),(String)comboBox3.getSelectedItem(),checkin,checkout,Roomno));
         			JOptionPane.showMessageDialog(contentPane, Roomno+" is alloted for you ",
                             "Reserve successfully",
                             JOptionPane.INFORMATION_MESSAGE);
         			textPane.setText(Validation.getBookingDetails(UserName));
         			panel4.setVisible(false);
         			panel2.setVisible(true);
         		}
         }
	   
      
         });
         lblNewLabel41.setOpaque(true);
         lblNewLabel41.setBackground(Color.LIGHT_GRAY);
         lblNewLabel41.setForeground(Color.DARK_GRAY);
         lblNewLabel41.setFont(new Font("Bahnschrift", Font.BOLD, 15));
         lblNewLabel41.setHorizontalAlignment(SwingConstants.CENTER);
         lblNewLabel41.setBounds(285, 449, 118, 26);
         panel4.add(lblNewLabel41);
         
         JLabel lblNewLabel42 = new JLabel("Reservation");
         lblNewLabel42.setForeground(new Color(0, 0, 0));
         lblNewLabel42.setFont(new Font("Bahnschrift", Font.BOLD, 18));
         lblNewLabel42.setBounds(248, 21, 107, 26);
         panel4.add(lblNewLabel42);
         
         JLabel lblNewLabel43 = new JLabel("Room type");
         lblNewLabel43.setForeground(new Color(0, 0, 0));
         lblNewLabel43.setFont(new Font("Bahnschrift", Font.BOLD, 15));
         lblNewLabel43.setBounds(113, 75, 216, 26);
         panel4.add(lblNewLabel43);
         
         comboBox1 = new JComboBox(roomtype);
         comboBox1.setFont(new Font("Bahnschrift", Font.BOLD, 11));
         comboBox1.setBounds(379, 78, 176, 22);
         panel4.add(comboBox1);
         
         JLabel lblNewLabel44 = new JLabel("Bed count");
         lblNewLabel44.setForeground(new Color(0, 0, 0));
         lblNewLabel44.setFont(new Font("Bahnschrift", Font.BOLD, 15));
         lblNewLabel44.setBounds(113, 132, 216, 26);
         panel4.add(lblNewLabel44);
         
         comboBox2 = new JComboBox(bedcount);
         comboBox2.setFont(new Font("Bahnschrift", Font.BOLD, 11));
         comboBox2.setBounds(379, 135, 176, 22);
         panel4.add(comboBox2);
         
         JLabel lblNewLabel45 = new JLabel("Number Of Persons");
         lblNewLabel45.setForeground(new Color(0, 0, 0));
         lblNewLabel45.setFont(new Font("Bahnschrift", Font.BOLD, 15));
         lblNewLabel45.setBounds(113, 195, 216, 26);
         panel4.add(lblNewLabel45);
         
         comboBox3 = new JComboBox(noofperson);
         comboBox3.setFont(new Font("Bahnschrift", Font.BOLD, 11));
         comboBox3.setBounds(379, 198, 176, 22);
         panel4.add(comboBox3);
         
         JLabel lblNewLabel46 = new JLabel("Check In Date");
         lblNewLabel46 .setForeground(new Color(0, 0, 0));
         lblNewLabel46 .setFont(new Font("Bahnschrift", Font.BOLD, 15));
         lblNewLabel46 .setBounds(113, 252, 193, 26);
         panel4.add(lblNewLabel46 );
         
         JLabel lblNewLabel47 = new JLabel("Check Out Date");
         lblNewLabel47.setForeground(new Color(0, 0, 0));
         lblNewLabel47.setFont(new Font("Bahnschrift", Font.BOLD, 15));
         lblNewLabel47.setBounds(379, 252, 166, 26);
         panel4.add(lblNewLabel47);
          
          calendar = new JCalendar();
          calendar.setMinSelectableDate(new Date());
          calendar.setBounds(108, 285, 181, 140);
          panel4.add(calendar);
          
          calendar_1 = new JCalendar();
          calendar_1.setMinSelectableDate(new Date());
          calendar_1.setBounds(374, 285, 181, 140);
          panel4.add(calendar_1);
         
         panel3.setBounds(347, 35, 643, 554);
         panel3.setBackground(new Color(32, 178, 170));
         contentPane.add(panel3);
         panel3.setLayout(null);
         
          textPane = new JTextPane();
          textPane.setBackground(new Color(255, 153, 102));
          textPane.setOpaque(false);
          textPane.setEditable(false);
          textPane.setForeground(new Color(0, 0, 0));
          textPane.setFont(new Font("Bahnschrift", Font.BOLD, 13));
          textPane.setBounds(231, 56, 385, 475);
          textPane.setText(Validation.getBookingDetails(UserName));
          
          JScrollPane scrollPane = new JScrollPane();
          scrollPane.setOpaque(false);
          scrollPane.getViewport().setOpaque(false);
          scrollPane.setBackground(new Color(255, 153, 102));
          scrollPane.setBorder(null);
          scrollPane.setViewportView(textPane);
          scrollPane.setBounds(218, 46, 399, 486);
          panel3.add(scrollPane);
         
         JLabel lblNewLabel31 = new JLabel("My Bookings");
         lblNewLabel31.setFont(new Font("Bahnschrift", Font.BOLD, 18));
         lblNewLabel31.setHorizontalAlignment(SwingConstants.CENTER);
         lblNewLabel31.setBounds(207, 11, 175, 34);
         panel3.add(lblNewLabel31);
        contentPane.add(panel5);
        panel5.setLayout(null);
        
        JTextPane txtpnSereneSummersAt = new JTextPane();
        txtpnSereneSummersAt.setEditable(false);
        txtpnSereneSummersAt.setOpaque(false);
        txtpnSereneSummersAt.setForeground(new Color(255, 255, 255));
        txtpnSereneSummersAt.setFont(new Font("Bahnschrift", Font.BOLD, 13));
        txtpnSereneSummersAt.setText("Serene Summers at THE Plaza\r\n\r\n\u2022    10% off the best available rate and for THE Plaza Preferred member 15% of the best available rate. (Enroll now if not a member of THE Plaza Preferred)\r\n\u2022    Traditional Summer welcome drink\r\n\r\n\u2022    Seasonal fruit platter in-room\r\n\r\n\u2022    Early Check in and late check out subject to availability\r\n\r\n\u2022    Daily evening tea/coffee with cookies at Aqua\r\n\r\n\u2022    15% savings on food & beverages, spa, salon, and laundry.\r\n\r\n\u2022    Upgrade to the next category from base room. Subject to availability\r\n\r\n\u2022    Avail THE Park Picnic meal, an in room dining experience for two @ INR 1000\r\n\r\n\u2022    Stay offer valid from April to 30th June 2022\r\n\r\n\u2022    Cancellation policy 24 hours prior to check in\r\n\r\n\u2022    Post images of your stay and tag us on Instagram @theparkhotels / #SereneSummersatthepark and stand a chance to win a complimentary stay with breakfast for a couple at The Park Calangute Goa for two nights\r\n\r\nParticipating hotels: THE Plaza New Delhi | Chennai | Kolkata | Bangalore | Vishakhapatnam | Navi Mumbai | Hyderabad | Indore | Calangute Goa | Baga Goa \r\n\r\n    The above offer cannot be clubbed with any other existing offers");
        txtpnSereneSummersAt.setBounds(23, 25, 599, 518);
        panel5.add(txtpnSereneSummersAt);
	    contentPane.add(panel6);
	    panel6.setLayout(null);
	    
	    JLabel lblNewLabel61 = new JLabel("");
	    lblNewLabel61.setIcon(new ImageIcon("C:\\Users\\mathan.thirumugam\\Downloads\\02_08cc-1024x683-450x250.jpg"));
	    lblNewLabel61.setBounds(0, 0, 423, 238);
	    panel6.add(lblNewLabel61);
	    
	    JLabel lblNewLabel62 = new JLabel("");
	    lblNewLabel62.setIcon(new ImageIcon("C:\\Users\\mathan.thirumugam\\Downloads\\287476409.jpg"));
	    lblNewLabel62.setBounds(438, 21, 195, 299);
	    panel6.add(lblNewLabel62);
	    
	    JLabel lblNewLabel63 = new JLabel("");
	    lblNewLabel63.setIcon(new ImageIcon("C:\\Users\\mathan.thirumugam\\Downloads\\2f9aecd0_b.jpg"));
	    lblNewLabel63.setBounds(50, 269, 347, 274);
	    panel6.add(lblNewLabel63);
	    
	    JLabel lblNewLabel64 = new JLabel("");
	    lblNewLabel64.setIcon(new ImageIcon("C:\\Users\\mathan.thirumugam\\Downloads\\images.jpg"));
	    lblNewLabel64.setBounds(444, 357, 165, 165);
	    panel6.add(lblNewLabel64);
	      contentPane.add(panel7);
	      panel7.setLayout(null);
	      
	      JTextPane txtpnHotelParkPlaza = new JTextPane();
	      txtpnHotelParkPlaza.setOpaque(false);
	      txtpnHotelParkPlaza.setForeground(new Color(255, 255, 255));
	      txtpnHotelParkPlaza.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
	      txtpnHotelParkPlaza.setText("Aesthetic skylines pecked with ethnic estates and aristocratic legacy, the ancient city of Madurai, welcomes you to Hotel Park Plaza that makes your stay memorable with its on-site restaurant and business centre.Business centre with internet access and meeting rooms make the works hassle-free during your stay.Relish the redefined buffet menus or select from a wide range of drinks at the in-house restaurant and bar\r\n\r\nSet amidst 12140 square meter of landscaped gardens, Fortune Pandiyan Hotel, Madurai is a contemporary hotel offering modern facilities and accommodation in Madurai for pilgrims, tourists and business travelers. The hotel is well connected and is only 15 kms from the airport, 4 kms from the railway station and 3 kms from Sree Meenakshi Amman Temple. The city has many  tourist spots, including various ancient temples, amusement parks and picnic spots, making it a preferred holiday destination for families. \r\n\r\nThe swimming pool offers an oasis of peace and tranquility for relaxation\r\n\r\nThe hotel features a well-equipped gym for its guests to keep up with their fitness regime\r\n\r\nHotel Park Plaza\r\nNo. 29, Whannels Road, Egmore, Chennai, Tamilnadu  -  600008\r\nEmail : chennai@hotelparkplaza.in, plaza@hotelparkplaza.in\r\nPhone : 044 40011111, 28411077\r\nMobile : +919944435730");
	      txtpnHotelParkPlaza.setBounds(0, 63, 643, 491);
	      panel7.add(txtpnHotelParkPlaza);
		
		panel2 = new JPanel();
		panel2.setOpaque(false);
		panel2.setBackground(new Color(32, 178, 170));
		panel2.setBounds(347, 35, 643, 554);
		contentPane.add(panel2);
		panel2.setLayout(null);
		
		JTextPane txtpnOnBehalfOf = new JTextPane();
		txtpnOnBehalfOf.setEditable(false);
		txtpnOnBehalfOf.setForeground(Color.WHITE);
		txtpnOnBehalfOf.setFont(new Font("Bahnschrift", Font.BOLD, 16));
		txtpnOnBehalfOf.setOpaque(false);
		txtpnOnBehalfOf.setText("We are delighted that you have selected our hotel.\r\n\r\nOn behalf of the entire team at the Hotel Name, I extend you a very warm welcome and trust your stay with us will be both enjoyable and comfortable.\r\n\r\nThe hotel offers a selection of business services and facilities which are detailed in the booklet, placed on the writing-table in your room.\r\n\r\nShould you require any assistance or have any specific requirements, please do not hesitate to contact me on extension ( 9999 ).\r\n\r\nWith best regards / Yours sincerely,\r\n\r\nHotel Manager");
		txtpnOnBehalfOf.setBounds(38, 152, 582, 315);
		panel2.add(txtpnOnBehalfOf);
		
		JLabel lblNewLabel21 = new JLabel("Hi "+UserName);
		lblNewLabel21.setForeground(Color.WHITE);
		lblNewLabel21.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel21.setBounds(38, 88, 176, 53);
		panel2.add(lblNewLabel21);
		
		JPanel panel1 = new JPanel();
		panel1.setOpaque(false);
		panel1.setBackground(new Color(0, 128, 128));
		panel1.setBounds(0, 0, 337, 600);
		contentPane.add(panel1);
		panel1.setLayout(null);
		
		JPanel panel11 = new JPanel();
		panel11.setOpaque(false);
		panel11.setBackground(new Color(0, 128, 128));
		panel11.setBounds(0, 175, 337, 40);
		panel1.add(panel11);
		panel11.setLayout(null);
		
		JLabel lblNewLabel112 = new JLabel("HOME");
		lblNewLabel112.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				panel2.setVisible(true);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel5.setVisible(false);
				panel6.setVisible(false);
				panel7.setVisible(false);
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel112.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel112.setForeground(new Color(255, 255, 255));
			}
		});
		lblNewLabel112.setForeground(new Color(255, 255, 255));
		lblNewLabel112.setFont(new Font("Bahnschrift", Font.BOLD, 15));
		lblNewLabel112.setBounds(87, 0, 250, 40);
		panel11.add(lblNewLabel112);
		
		JLabel lblNewLabel113 = new JLabel("");
		lblNewLabel113.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel113.setIcon(Image2);
		lblNewLabel113.setBounds(38, 0, 40, 40);
		panel11.add(lblNewLabel113);
		
		JLabel lblNewLabel111 = new JLabel("");
		lblNewLabel111.setIcon(Image1);
		lblNewLabel111.setBounds(108, 57, 90, 90);
		panel1.add(lblNewLabel111);
		
		JPanel panel12 = new JPanel();
		panel12.setOpaque(false);
		panel12.setBackground(new Color(0, 128, 128));
		panel12.setBounds(0, 216, 337, 40);
		panel1.add(panel12);
		panel12.setLayout(null);
		
		JLabel lblNewLabel121 = new JLabel("MY BOOKINGS");
		lblNewLabel121.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				panel2.setVisible(false);
				panel3.setVisible(true);
				panel4.setVisible(false);
				panel5.setVisible(false);
				panel6.setVisible(false);
				panel7.setVisible(false);
				
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel121.setForeground( Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel121.setForeground(new Color(255, 255, 255));
			}
		});
		lblNewLabel121.setForeground(new Color(255, 255, 255));
		lblNewLabel121.setFont(new Font("Bahnschrift", Font.BOLD, 15));
		lblNewLabel121.setBounds(87, 0, 250, 40);
		panel12.add(lblNewLabel121);
		
		JLabel lblNewLabel122 = new JLabel("");
		lblNewLabel122.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel122.setIcon(Image4);
		lblNewLabel122.setBounds(38, 0, 40, 40);
		panel12.add(lblNewLabel122);
		
		JPanel panel13 = new JPanel();
		panel13.setOpaque(false);
		panel13.setBackground(new Color(0, 128, 128));
		panel13.setBounds(0, 257, 337, 40);
		panel1.add(panel13);
		panel13.setLayout(null);
		
		JLabel lblNewLabel131 = new JLabel("ROOM RESERVATION");
		lblNewLabel131.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(true);
				panel5.setVisible(false);
				panel6.setVisible(false);
				panel7.setVisible(false);
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel131.setForeground( Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel131.setForeground(new Color(255, 255, 255));
			}
		});
		lblNewLabel131.setFont(new Font("Bahnschrift", Font.BOLD, 15));
		lblNewLabel131.setForeground(new Color(255, 255, 255));
		lblNewLabel131.setBounds(87, 0, 250, 40);
		panel13.add(lblNewLabel131);
		
		JLabel lblNewLabel132 = new JLabel("");
		lblNewLabel132.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel132.setIcon(Image3);
		lblNewLabel132.setBounds(38, 0, 40, 40);
		panel13.add(lblNewLabel132);
		
		JPanel panel14 = new JPanel();
		panel14.setOpaque(false);
		panel14.setBackground(new Color(0, 128, 128));
		panel14.setBounds(0, 298, 337, 40);
		panel1.add(panel14);
		panel14.setLayout(null);
		
		JLabel lblNewLabel141 = new JLabel("LATEST OFFERS");
		lblNewLabel141.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel5.setVisible(true);
				panel6.setVisible(false);
				panel7.setVisible(false);
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel141.setForeground( Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel141.setForeground(new Color(255, 255, 255));
			}
		});
		lblNewLabel141.setFont(new Font("Bahnschrift", Font.BOLD, 15));
		lblNewLabel141.setForeground(new Color(255, 255, 255));
		lblNewLabel141.setBounds(87, 0, 250, 40);
		panel14.add(lblNewLabel141);
		
		JLabel lblNewLabel142 = new JLabel("");
		lblNewLabel142.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel142.setIcon(Image5);
		lblNewLabel142.setBounds(38, 0, 40, 40);
		panel14.add(lblNewLabel142);
		
		JPanel panel15 = new JPanel();
		panel15.setOpaque(false);
		panel15.setBackground(new Color(0, 128, 128));
		panel15.setBounds(0, 339, 337, 40);
		panel1.add(panel15);
		panel15.setLayout(null);
		
		JLabel lblNewLabel151 = new JLabel("GALLERY");
		lblNewLabel151.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel5.setVisible(false);
				panel6.setVisible(true);
				panel7.setVisible(false);
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel151.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel151.setForeground(new Color(255, 255, 255));
			}
		});
		lblNewLabel151.setFont(new Font("Bahnschrift", Font.BOLD, 15));
		lblNewLabel151.setForeground(new Color(255, 255, 255));
		lblNewLabel151.setBounds(87, 0, 250, 40);
		panel15.add(lblNewLabel151);
		
		JLabel lblNewLabel152 = new JLabel("");
		lblNewLabel152.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel152.setIcon(Image6);
		lblNewLabel152.setBounds(38, 0, 40, 40);
		panel15.add(lblNewLabel152);
		
		JPanel panel16 = new JPanel();
		panel16.setOpaque(false);
		panel16.setBackground(new Color(0, 128, 128));
		panel16.setBounds(0, 380, 337, 40);
		panel1.add(panel16);
		panel16.setLayout(null);
		
		JLabel lblNewLabel161 = new JLabel("ABOUT");
		lblNewLabel161.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel5.setVisible(false);
				panel6.setVisible(false);
				panel7.setVisible(true);		
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel161.setForeground( Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel161.setForeground(new Color(255, 255, 255));
			}
		});
		lblNewLabel161.setForeground(new Color(255, 255, 255));
		lblNewLabel161.setFont(new Font("Bahnschrift", Font.BOLD, 15));
		lblNewLabel161.setBounds(87, 0, 250, 40);
		panel16.add(lblNewLabel161);
		
		JLabel lblNewLabel162 = new JLabel("");
		lblNewLabel162.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel162.setIcon(Image7);
		lblNewLabel162.setBounds(38, 0, 40, 40);
		panel16.add(lblNewLabel162);
		
		JPanel panel17 = new JPanel();
		panel17.setOpaque(false);
	
		panel17.setBackground(new Color(0, 128, 128));
		panel17.setBounds(0, 421, 337, 40);
		panel1.add(panel17);
		panel17.setLayout(null);
		
		JLabel lblNewLabel171 = new JLabel("LOG OUT");
		lblNewLabel171.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
			
				if(JOptionPane.showConfirmDialog(null, "are you sure want to log out","confirmation",JOptionPane.YES_NO_OPTION)==0) {
					new NewFrame();
					 dispose();
					}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel171.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel171.setForeground(new Color(255, 255, 255));
			}
		});
		lblNewLabel171.setForeground(new Color(255, 255, 255));
		lblNewLabel171.setFont(new Font("Bahnschrift", Font.BOLD, 15));
		lblNewLabel171.setBounds(87, 0, 250, 40);
		panel17.add(lblNewLabel171);
		
		JLabel lblNewLabel172 = new JLabel("");
		lblNewLabel172.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel172.setIcon(Image8);
		lblNewLabel172.setBounds(38, 0, 40, 40);
		panel17.add(lblNewLabel172);
		
		JLabel lblNewLabel11 = new JLabel("X");
		lblNewLabel11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel11.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel11.setForeground(Color.WHITE);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "are you sure want to close","confirmation",JOptionPane.YES_NO_OPTION)==0) {
					System.exit(0);}
			}
		});
		lblNewLabel11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel11.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel11.setForeground(new Color(255, 255, 255));
		lblNewLabel11.setBounds(965, 8, 25, 25);
		contentPane.add(lblNewLabel11);
		
		JLabel lblNewLabel12 = new JLabel("");
		lblNewLabel12.setIcon(new ImageIcon("C:\\Users\\mathan.thirumugam\\Downloads\\232243771.jpg"));
		lblNewLabel12.setBounds(0, 0, 1000, 600);
		contentPane.add(lblNewLabel12);
		setVisible(true);
	}
}

