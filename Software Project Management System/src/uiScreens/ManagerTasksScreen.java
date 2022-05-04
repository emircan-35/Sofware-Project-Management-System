package uiScreens;

import java.awt.EventQueue;

import javax.swing.JFrame;
import keeptoo.KGradientPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.lang.System.Logger.Level;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

public class ManagerTasksScreen {

	private JFrame frame;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void OpenManagerTasksScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					ManagerTasksScreen window = new ManagerTasksScreen();
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
	public ManagerTasksScreen() {
		initialize();
		try {

		} catch (Exception e) {
			// TODO: handle exception
		}
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
		frame.setBounds(100, 100, 1025, 785);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Project Tasks");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(10, 11, 206, 61);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblProjectName = new JLabel("Project Name:");
		lblProjectName.setForeground(Color.WHITE);
		lblProjectName.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblProjectName.setBounds(10, 59, 206, 61);
		frame.getContentPane().add(lblProjectName);

		JLabel lblProjectName_1 = new JLabel("<Project Name>");
		lblProjectName_1.setForeground(Color.WHITE);
		lblProjectName_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblProjectName_1.setBounds(10, 83, 295, 94);
		frame.getContentPane().add(lblProjectName_1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(278, 11, 721, 723);
		frame.getContentPane().add(scrollPane);

		table = new JTable();
		table.setModel(
				new DefaultTableModel(new Object[][] {}, new String[] { "Task Name", "Task Description", "Deadline","Worker" }));
		
		
		
		
		scrollPane.setViewportView(table);

		JButton btnNewButton = new JButton("Accept Task");
		btnNewButton.setBounds(10, 202, 230, 40);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Delete Task");
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setBounds(10, 304, 230, 40);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Decline Task");
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setBounds(10, 253, 230, 40);
		frame.getContentPane().add(btnNewButton_2);

		JLabel lblTaskDescription = new JLabel("Task Description:");
		lblTaskDescription.setForeground(Color.WHITE);
		lblTaskDescription.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblTaskDescription.setBounds(10, 339, 206, 61);
		frame.getContentPane().add(lblTaskDescription);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 388, 259, 143);
		frame.getContentPane().add(textArea);

		JLabel lblDeadLine = new JLabel("Deadline:");
		lblDeadLine.setForeground(Color.WHITE);
		lblDeadLine.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblDeadLine.setBounds(10, 519, 206, 61);
		frame.getContentPane().add(lblDeadLine);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox.setBounds(10, 571, 56, 31);
		frame.getContentPane().add(comboBox);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox_1.setBounds(76, 571, 56, 31);
		frame.getContentPane().add(comboBox_1);

		JComboBox comboBox_2 = new JComboBox();
		
		String[] years = new String[100];
		
		for(int i=0;i<years.length;i++) {
			
			years[i]=2022+i+"";
			
		}
		
		comboBox_2.setModel(new DefaultComboBoxModel(years));
		comboBox_2.setBounds(142, 571, 98, 31);
		frame.getContentPane().add(comboBox_2);

		JButton btnAddTask = new JButton("Add Task");
		btnAddTask.setBounds(10, 694, 230, 40);
		frame.getContentPane().add(btnAddTask);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(10, 652, 230, 31);
		frame.getContentPane().add(textField);

		JLabel lblWorkerId = new JLabel("Worker Id:");
		lblWorkerId.setForeground(Color.WHITE);
		lblWorkerId.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblWorkerId.setBounds(10, 601, 206, 61);
		frame.getContentPane().add(lblWorkerId);
		String[] combobox2model = new String[2100 - 2022];
		for (int i = 0; i < combobox2model.length; i++) {

			combobox2model[i] = "" + (2022 + i) + "";

		}
	}
}
