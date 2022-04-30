package uiScreens;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import databaseProcesses.GeneralDB;
import softwareProjectManagement.Meet;

import javax.swing.JButton;

public class ManagerChooseScreen {

	private JFrame frame;
	private JTable table;
	private static GeneralDB DB=GeneralDB.getObject();
	private JButton btnNewButton;
	/**
	 * Launch the application.
	 * @param newMeet 
	 * @param chosenWorkers 
	 */
	public static void OpenManagerChooseScreen(Meet newMeet) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagerChooseScreen window = new ManagerChooseScreen(newMeet);
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
	public ManagerChooseScreen(Meet newMeet) {
		initialize(newMeet);
	}

	/**
	 * Initialize the contents of the frame.
	 * @param newMeet 
	 */
	private void initialize(Meet newMeet) {
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
		
		btnNewButton = new JButton("COMPLETE");
		frame.getContentPane().add(btnNewButton, BorderLayout.SOUTH);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ArrayList<Integer> chosenWorkers=getChosenWorkers();
				if (chosenWorkers.size()==0) {
					JOptionPane.showMessageDialog(frame, "At least one person should attend! Try Again","EMPTY MEET!", JOptionPane.WARNING_MESSAGE);
					return;
				}				
				newMeet.setAttendeesIds(chosenWorkers);
				//ALSO INSERT IT TO THE DB 
				//TIME AND 
			}
		});
		
	}
	
	private ArrayList<Integer> getChosenWorkers(){
		ArrayList<Integer> chosenWorkers=new ArrayList<>();

	    for (int i = 0; i < table.getRowCount(); i++) {  
	    	if ((boolean)table.getValueAt(i, 3)==true) {
				chosenWorkers.add((Integer.parseInt((String) table.getValueAt(i, 0))));
			}
	     }
	    return chosenWorkers;
		
	}

}
