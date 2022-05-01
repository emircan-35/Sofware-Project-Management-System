package uiScreens;

import java.awt.EventQueue;

import javax.swing.JFrame;
import keeptoo.KGradientPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import com.formdev.flatlaf.FlatDarkLaf;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManagerTeamMembers {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void OpenManagerTeamScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagerTeamMembers window = new ManagerTeamMembers();
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
	public ManagerTeamMembers() {
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
		frame.setBounds(100, 100, 844, 711);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.setBounds(245, -19, 631, 754);
		frame.getContentPane().add(gradientPanel);
		gradientPanel.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 28, 564, 656);
		gradientPanel.add(scrollPane);

		table = new JTable();
		table.setModel(
				new DefaultTableModel(new Object[][] {}, new String[] { "Name", "Surname", "Title", "Experience" }));
		scrollPane.setViewportView(table);

		JLabel lblNewLabel = new JLabel("Team Members");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(10, 11, 204, 97);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 102, 133, 47);
		frame.getContentPane().add(lblNewLabel_1);

		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(10, 143, 183, 27);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1_1 = new JLabel("Surname:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(10, 179, 133, 47);
		frame.getContentPane().add(lblNewLabel_1_1);

		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(10, 220, 183, 27);
		frame.getContentPane().add(textField_1);

		JLabel lblNewLabel_1_2 = new JLabel("Title:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(10, 258, 133, 47);
		frame.getContentPane().add(lblNewLabel_1_2);

		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(10, 299, 183, 27);
		frame.getContentPane().add(textField_2);

		JLabel lblNewLabel_1_3 = new JLabel("Experience");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_3.setBounds(10, 337, 133, 47);
		frame.getContentPane().add(lblNewLabel_1_3);

		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(10, 378, 183, 27);
		frame.getContentPane().add(textField_3);

		JLabel lblNewLabel_1_3_1 = new JLabel("Project Name:");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_3_1.setBounds(10, 416, 133, 47);
		frame.getContentPane().add(lblNewLabel_1_3_1);

		JLabel lblNewLabel_1_3_1_1 = new JLabel("<Project Name>");
		lblNewLabel_1_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_3_1_1.setBounds(31, 435, 204, 81);
		frame.getContentPane().add(lblNewLabel_1_3_1_1);

		JButton btnNewButton = new JButton("Show Reports");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ManagerReportsList.OpenManagerReportsScreen();

			}
		});
		btnNewButton.setBounds(10, 546, 192, 47);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Delete Member");
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setBounds(10, 604, 192, 47);
		frame.getContentPane().add(btnNewButton_1);

	}
}
