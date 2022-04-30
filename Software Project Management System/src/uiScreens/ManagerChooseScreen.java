package uiScreens;

import java.awt.EventQueue;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import databaseProcesses.GeneralDB;

public class ManagerChooseScreen {

	private JFrame frame;
	private JTable table;
	private static GeneralDB DB=GeneralDB.getObject();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagerChooseScreen window = new ManagerChooseScreen();
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
	public ManagerChooseScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Please tick those who you want to make it able to join the meeting");
		frame.getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
		table = new JTable() {
		      @SuppressWarnings("unchecked")
			public Class getColumnClass(int column) {
		          //return Boolean.class
		          return getValueAt(0, column).getClass(); 
		        }
		};
		frame.getContentPane().add(table, BorderLayout.CENTER);
		
		String[] columnNames={"ID","Name","Surname","Join"};
		DefaultTableModel tableModel=new DefaultTableModel(columnNames, 0);
		ResultSet workers=DB.selectData("select worker.workerid, workername, workersurname from softwaremanagementsystem.worker");
		try {
			while (workers.next()) {
				Object[] row= {workers.getString(1),workers.getString(2),workers.getString(3),false};
				tableModel.addRow(row);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		table.setModel(tableModel);
		
	}

}
