package uiScreens;

import java.awt.EventQueue;

import javax.swing.JFrame;
import keeptoo.KGradientPanel;
import softwareProjectManagement.Customer;

import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.formdev.flatlaf.FlatDarkLaf;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CustomerScreen {

	private JFrame frmCustomer;

	/**
	 * Launch the application.
	 */
	public static void OpenCustomerScreen(Customer customer) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					CustomerScreen window = new CustomerScreen(customer);
					window.frmCustomer.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @param customer 
	 */
	public CustomerScreen(Customer customer) {
		initialize(customer);
	}

	/**
	 * Initialize the contents of the frame.
	 * @param customer 
	 */
	private void initialize(Customer customer) {
		try {
			UIManager.setLookAndFeel(new FlatDarkLaf());
		} catch (UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		frmCustomer = new JFrame();
		frmCustomer.setTitle("Customer");
		frmCustomer.setResizable(false);
		frmCustomer.setBounds(100, 100, 540, 433);
		frmCustomer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCustomer.getContentPane().setLayout(null);

		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.kStartColor = Color.RED;
		gradientPanel.setBounds(0, 282, 535, 120);
		frmCustomer.getContentPane().add(gradientPanel);
		gradientPanel.setLayout(null);

		JLabel lblNewLabel = new JLabel("MENU");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel.setBounds(10, 11, 106, 32);
		gradientPanel.add(lblNewLabel);

		JButton btnNewButton = new JButton("Project Order");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				CustomerOrderScreen.OpenCustomerOrderScreen(customer);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnNewButton.setBounds(10, 54, 106, 32);
		gradientPanel.add(btnNewButton);

		JButton btnProjectStatus = new JButton("Project Status");
		btnProjectStatus.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnProjectStatus.setBounds(126, 54, 106, 32);
		gradientPanel.add(btnProjectStatus);

		JLabel lblNewLabel_1 = new JLabel("Personal \r");
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(10, 0, 339, 75);
		frmCustomer.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("\nInformation");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_2.setBounds(10, 54, 284, 47);
		frmCustomer.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_1_1 = new JLabel("Title:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(10, 102, 103, 34);
		frmCustomer.getContentPane().add(lblNewLabel_1_1);

		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(67, 113, 83, 14);
		frmCustomer.getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_1_1_1 = new JLabel("Name:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(10, 147, 103, 34);
		frmCustomer.getContentPane().add(lblNewLabel_1_1_1);

		JLabel lblNewLabel_3_1 = new JLabel("New label");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_1.setBounds(80, 161, 83, 14);
		frmCustomer.getContentPane().add(lblNewLabel_3_1);

		JLabel lblNewLabel_1_2 = new JLabel("Surname:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(10, 192, 103, 34);
		frmCustomer.getContentPane().add(lblNewLabel_1_2);

		JLabel lblNewLabel_3_2 = new JLabel("New label");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_2.setBounds(114, 206, 83, 14);
		frmCustomer.getContentPane().add(lblNewLabel_3_2);

		JLabel lblNewLabel_1_6 = new JLabel("Phone Number:");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_6.setBounds(10, 237, 169, 34);
		frmCustomer.getContentPane().add(lblNewLabel_1_6);

		JLabel lblNewLabel_3_6 = new JLabel("New label");
		lblNewLabel_3_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_6.setBounds(178, 248, 83, 14);
		frmCustomer.getContentPane().add(lblNewLabel_3_6);
	}
}
