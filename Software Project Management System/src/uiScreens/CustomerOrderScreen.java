package uiScreens;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.formdev.flatlaf.FlatDarkLaf;

import databaseProcesses.GeneralDB;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import keeptoo.KGradientPanel;
import softwareProjectManagement.Customer;
import softwareProjectManagement.Project;

public class CustomerOrderScreen {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private static GeneralDB DB=GeneralDB.getObject();
	/**
	 * Launch the application.
	 * @param customer 
	 */
	public static void OpenCustomerOrderScreen(Customer customer) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerOrderScreen window = new CustomerOrderScreen(customer);
					window.frame.setVisible(true);
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
	public CustomerOrderScreen(Customer customer) {
		initialize(customer);
	}

	/**
	 * Initialize the contents of the frame.
	 * @param customer 
	 */
	private void initialize(Customer customer) {
		
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
		lblNewLabel.setBounds(20, -17, 204, 72);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblProjectName = new JLabel("Project Name:");
		lblProjectName.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblProjectName.setBounds(20, 11, 204, 72);
		frame.getContentPane().add(lblProjectName);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(30, 66, 364, 33);
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
		
		JLabel lblProjectDescription = new JLabel("Offered Amount:");
		lblProjectDescription.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblProjectDescription.setBounds(20, 81, 204, 72);
		frame.getContentPane().add(lblProjectDescription);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(20, 139, 364, 33);
		frame.getContentPane().add(textField_1);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().isEmpty()||textField_1.getText().isEmpty()) {
					JOptionPane.showMessageDialog(frame, "At least one area is empty! Try again",
							"EMPTY AREA!", JOptionPane.WARNING_MESSAGE);
					return;
				}
				Project newProject=new Project(customer.getId(),textField.getText(),textArea.getText(),Integer.parseInt(textField_1.getText()));
				customer.addProject(newProject);
				//DB.insertData("INSERT INTO Project(ProjectName, ProjectDesription,Status,Customer_idCustomer,Customer_Title_idTitle,offeredAmount)\n"+
				//"VALUES ('"+newProject.getProjectName()+"','"+newProject.getProjectDescription()+"',"+"0,"+customer.getId()+","+0+","+newProject.getMoney()+";");
				
			}
		});
	}
}
