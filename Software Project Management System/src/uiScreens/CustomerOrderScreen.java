package uiScreens;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import keeptoo.KGradientPanel;

public class CustomerOrderScreen {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void OpenCustomerOrderScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerOrderScreen window = new CustomerOrderScreen();
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
	public CustomerOrderScreen() {
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
		frame.setBounds(100, 100, 791, 596);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Order Project");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(10, 0, 204, 72);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblProjectName = new JLabel("Project Name:");
		lblProjectName.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblProjectName.setBounds(10, 47, 204, 72);
		frame.getContentPane().add(lblProjectName);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(10, 112, 364, 33);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.setBounds(0, 209, 789, 358);
		frame.getContentPane().add(gradientPanel);
		gradientPanel.setLayout(null);
		
		JButton btnNewButton = new JButton("Order Project");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(282, 302, 189, 38);
		gradientPanel.add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textArea.setBounds(10, 11, 755, 280);
		gradientPanel.add(textArea);
		
		JLabel lblProjectDescription = new JLabel("Project Description:");
		lblProjectDescription.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblProjectDescription.setBounds(10, 145, 204, 72);
		frame.getContentPane().add(lblProjectDescription);
	}
}
