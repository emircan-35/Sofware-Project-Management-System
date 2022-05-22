package uiScreens;

import java.awt.EventQueue;

import javax.swing.JFrame;
import keeptoo.KGradientPanel;
import softwareProjectManagement.Customer;

import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.formdev.flatlaf.FlatDarkLaf;

import databaseProcesses.GeneralDB;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;
import javax.swing.JComboBox;

public class CustomerScreen {

	private JFrame frmCustomer;
	private GeneralDB DB=GeneralDB.getObject();
	
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
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(240, 59, 146, 27);
		gradientPanel.add(progressBar);
		progressBar.setValue(statusPercent(1));
		
		ArrayList<String> projectNames=customer.getProjectNames();
		String[] projectNames1=new String[projectNames.size()];
		for (int i = 0; i < projectNames1.length; i++) projectNames1[i]=projectNames.get(i);
		@SuppressWarnings({ "unchecked", "rawtypes" })
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(411, 63, 47, 14);
		gradientPanel.add(lblNewLabel_4);
		JComboBox comboBox = new JComboBox(new DefaultComboBoxModel(projectNames1));
		comboBox.setBounds(187, 59, 30, 22);
		comboBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String nameProject=(String) comboBox.getSelectedItem();
				int chosenId=-1;
				try {
					ResultSet rs=DB.selectData("select idProject from project where ProjectName=\""+nameProject+"\"");
					if (rs.next()) {
						chosenId=rs.getInt(1);
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if (chosenId!=-1) {
					int percent=statusPercent(chosenId)*100;
					progressBar.setValue(percent);
					lblNewLabel_4.setText(Integer.toString(percent));
				}
			}
		});
		gradientPanel.add(comboBox);

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

		JLabel lblNewLabel_3 = new JLabel("Customer");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(67, 113, 83, 14);
		frmCustomer.getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_1_1_1 = new JLabel("Name:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(10, 147, 103, 34);
		frmCustomer.getContentPane().add(lblNewLabel_1_1_1);

		JLabel lblNewLabel_3_1 = new JLabel(customer.getPersonName());
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_1.setBounds(80, 161, 83, 14);
		frmCustomer.getContentPane().add(lblNewLabel_3_1);

		JLabel lblNewLabel_1_2 = new JLabel("Surname:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(10, 192, 103, 34);
		frmCustomer.getContentPane().add(lblNewLabel_1_2);

		JLabel lblNewLabel_3_2 = new JLabel(customer.getPersonSurname());
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_2.setBounds(114, 206, 83, 14);
		frmCustomer.getContentPane().add(lblNewLabel_3_2);

		JLabel lblNewLabel_1_6 = new JLabel("Phone Number:");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_6.setBounds(10, 237, 169, 34);
		frmCustomer.getContentPane().add(lblNewLabel_1_6);

		JLabel lblNewLabel_3_6 = new JLabel(customer.getPersonPhone());
		lblNewLabel_3_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_6.setBounds(178, 248, 83, 14);
		frmCustomer.getContentPane().add(lblNewLabel_3_6);
	}
	private int statusPercent(int projectID) {
		
		int totalTask=0;
		int completedTask=0;
		try {
			ResultSet rs=DB.selectData("select * from task where Project_idProject="+projectID);
			while (rs.next()) {
				totalTask++;
				if (rs.getBoolean(3)) completedTask++;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (totalTask==0||completedTask==0) return 0;
		else return completedTask/totalTask;
	}
}
