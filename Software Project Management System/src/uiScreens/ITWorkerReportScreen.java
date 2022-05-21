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
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.formdev.flatlaf.FlatDarkLaf;

import java.awt.Color;

public class ITWorkerReportScreen {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void OpenITWorkerReportsScreen() {
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
		
		
		try {
			UIManager.setLookAndFeel( new FlatDarkLaf() );
		} catch (UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(new Rectangle(0, 0, 1000, 1000));
		frame.setBounds(100, 100, 861, 721);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Title:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel.setBounds(10, 0, 149, 53);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblItworker = new JLabel("<TitleName>");
		lblItworker.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblItworker.setBounds(69, 0, 149, 53);
		frame.getContentPane().add(lblItworker);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblName.setBounds(10, 44, 149, 53);
		frame.getContentPane().add(lblName);
		
		JLabel lblSurname = new JLabel("Surname:");
		lblSurname.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblSurname.setBounds(10, 92, 149, 53);
		frame.getContentPane().add(lblSurname);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number:");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblPhoneNumber.setBounds(10, 138, 257, 53);
		frame.getContentPane().add(lblPhoneNumber);
		
		JLabel lblTaskDescription = new JLabel("Task Description:");
		lblTaskDescription.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblTaskDescription.setBounds(10, 187, 228, 53);
		frame.getContentPane().add(lblTaskDescription);
		
		JLabel lblItworker_1 = new JLabel("<Name>");
		lblItworker_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblItworker_1.setBounds(79, 44, 149, 53);
		frame.getContentPane().add(lblItworker_1);
		
		JLabel lblItworker_2 = new JLabel("<Surname>");
		lblItworker_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblItworker_2.setBounds(118, 92, 149, 53);
		frame.getContentPane().add(lblItworker_2);
		
		JLabel lblItworker_3 = new JLabel("<Phone Number>");
		lblItworker_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblItworker_3.setBounds(179, 138, 149, 53);
		frame.getContentPane().add(lblItworker_3);
		
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.setBounds(10, 820, 984, -453);
		frame.getContentPane().add(gradientPanel);
		
		KGradientPanel gradientPanel_1 = new KGradientPanel();
		gradientPanel_1.kStartColor = Color.RED;
		gradientPanel_1.setBounds(0, 237, 872, 462);
		frame.getContentPane().add(gradientPanel_1);
		gradientPanel_1.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Arial", Font.BOLD, 15));
		textArea.setBounds(10, 11, 823, 376);
		gradientPanel_1.add(textArea);
		
		JButton btnNewButton = new JButton("Send Report");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(276, 398, 244, 34);
		gradientPanel_1.add(btnNewButton);
		
		JLabel lblItworker_3_1 = new JLabel("<TitleDescription>");
		lblItworker_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblItworker_3_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblItworker_3_1.setBounds(201, 165, 594, 98);
		frame.getContentPane().add(lblItworker_3_1);
	}
}
