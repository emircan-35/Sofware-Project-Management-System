package uiScreens;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.formdev.flatlaf.FlatDarkLaf;

import databaseProcesses.GeneralDB;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import keeptoo.KGradientPanel;
import softwareProjectManagement.Manager;
import softwareProjectManagement.Person;

import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

public class LoginScreen extends GeneralDB {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	// FIRST PUSH FOR GOKAY BRANCH
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					LoginScreen window = new LoginScreen();
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
	public LoginScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		try {
			UIManager.setLookAndFeel(new FlatDarkLaf());
		} catch (UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 586, 330);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		KGradientPanel gradientPanel = new KGradientPanel();
		frame.getContentPane().add(gradientPanel, BorderLayout.CENTER);
		gradientPanel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Username:");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(148, 112, 131, 31);
		gradientPanel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Password:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(148, 174, 114, 31);
		gradientPanel.add(lblNewLabel_1);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(148, 136, 237, 27);
		gradientPanel.add(textField);

		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ManagerScreen.openManagerScreen(null);
				CustomerScreen.OpenCustomerScreen();
				ITWorkerScreen.OpenITWorkerScreen();

			}
		});
		btnNewButton.setBounds(182, 241, 131, 39);
		gradientPanel.add(btnNewButton);

		JLabel lblNewLabel_2 = new JLabel("Software Development");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(133, 11, 414, 68);
		gradientPanel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel(" Management System");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(143, 59, 252, 31);
		gradientPanel.add(lblNewLabel_3);

		passwordField = new JPasswordField();
		passwordField.setBounds(149, 203, 236, 27);
		gradientPanel.add(passwordField);

	}
}
