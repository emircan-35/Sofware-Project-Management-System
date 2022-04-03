package uiScreens;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Rectangle;
import keeptoo.KGradientPanel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;

public class ITWorkerReportScreen {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ITWorkerReportScreen window = new ITWorkerReportScreen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ITWorkerReportScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(new Rectangle(0, 0, 1000, 1000));
		frame.setBounds(100, 100, 861, 869);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Title:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel.setBounds(10, 11, 149, 53);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblItworker = new JLabel("<TitleName>");
		lblItworker.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblItworker.setBounds(69, 11, 149, 53);
		frame.getContentPane().add(lblItworker);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblName.setBounds(10, 75, 149, 53);
		frame.getContentPane().add(lblName);
		
		JLabel lblSurname = new JLabel("Surname:");
		lblSurname.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblSurname.setBounds(10, 141, 149, 53);
		frame.getContentPane().add(lblSurname);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number:");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblPhoneNumber.setBounds(10, 205, 257, 53);
		frame.getContentPane().add(lblPhoneNumber);
		
		JLabel lblTaskDescription = new JLabel("Task Description:");
		lblTaskDescription.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblTaskDescription.setBounds(10, 269, 228, 53);
		frame.getContentPane().add(lblTaskDescription);
		
		JLabel lblItworker_1 = new JLabel("<Name>");
		lblItworker_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblItworker_1.setBounds(79, 75, 149, 53);
		frame.getContentPane().add(lblItworker_1);
		
		JLabel lblItworker_2 = new JLabel("<Surname>");
		lblItworker_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblItworker_2.setBounds(118, 139, 149, 53);
		frame.getContentPane().add(lblItworker_2);
		
		JLabel lblItworker_3 = new JLabel("<Phone Number>");
		lblItworker_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblItworker_3.setBounds(182, 205, 149, 53);
		frame.getContentPane().add(lblItworker_3);
		
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.setBounds(10, 820, 984, -453);
		frame.getContentPane().add(gradientPanel);
		
		KGradientPanel gradientPanel_1 = new KGradientPanel();
		gradientPanel_1.kStartColor = Color.RED;
		gradientPanel_1.setBounds(0, 384, 861, 462);
		frame.getContentPane().add(gradientPanel_1);
		gradientPanel_1.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 11, 823, 376);
		gradientPanel_1.add(textArea);
		
		JButton btnNewButton = new JButton("Send Report");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(342, 404, 138, 34);
		gradientPanel_1.add(btnNewButton);
		
		JLabel lblItworker_3_1 = new JLabel("<TitleDescription>");
		lblItworker_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblItworker_3_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblItworker_3_1.setBounds(192, 269, 594, 98);
		frame.getContentPane().add(lblItworker_3_1);
	}
}
