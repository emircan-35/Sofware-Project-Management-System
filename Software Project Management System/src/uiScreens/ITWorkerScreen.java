package uiScreens;

import java.awt.EventQueue;

import javax.swing.JFrame;
import keeptoo.KGradientPanel;
import softwareProjectManagement.ITWorker;
import softwareProjectManagement.Meet;
import softwareProjectManagement.Person;
import softwareProjectManagement.Project;
import softwareProjectManagement.Report;
import softwareProjectManagement.Project.Task;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import com.formdev.flatlaf.FlatDarkLaf;

import databaseProcesses.GeneralDB;

import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class ITWorkerScreen {

	private int selectedMeetId=-1;
	private int selectedTaskId=-1;
	private JFrame frame;
	private JTable table;
	private JTable table_1;
	private GeneralDB DB=GeneralDB.getObject();
	/**
	 * Launch the application.
	 */
	public static void OpenITWorkerScreen(Person person) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel( new FlatDarkLaf() );
					ITWorkerScreen window = new ITWorkerScreen(person);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @param person 
	 * @throws SQLException 
	 */
	public ITWorkerScreen(Person person) throws SQLException {
		initialize(person);
	}

	/**
	 * Initialize the contents of the frame.
	 * @param person 
	 * @throws SQLException 
	 */
	private void initialize(Person person) throws SQLException {
		try {
			UIManager.setLookAndFeel( new FlatDarkLaf() );
		} catch (UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 981, 915);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Personal \r");
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(10, 11, 339, 75);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\nInformation");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_2.setBounds(10, 82, 284, 47);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(67, 151, 83, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("Title:");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(10, 140, 103, 34);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Name:");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(10, 185, 103, 34);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("New label");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_1.setBounds(80, 199, 83, 14);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Surname:");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(10, 230, 103, 34);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("New label");
		lblNewLabel_3_2.setForeground(Color.WHITE);
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_2.setBounds(114, 244, 83, 14);
		frame.getContentPane().add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Current Project:");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(10, 275, 169, 34);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_3_3 = new JLabel("New label");
		lblNewLabel_3_3.setForeground(Color.WHITE);
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_3.setBounds(178, 289, 83, 14);
		frame.getContentPane().add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Experience:");
		lblNewLabel_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_4.setBounds(10, 320, 140, 34);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_3_4 = new JLabel("New label");
		lblNewLabel_3_4.setForeground(Color.WHITE);
		lblNewLabel_3_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_4.setBounds(135, 334, 83, 14);
		frame.getContentPane().add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Salary:");
		lblNewLabel_1_5.setForeground(Color.WHITE);
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_5.setBounds(10, 365, 103, 34);
		frame.getContentPane().add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_3_5 = new JLabel("New label");
		lblNewLabel_3_5.setForeground(Color.WHITE);
		lblNewLabel_3_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_5.setBounds(96, 376, 83, 14);
		frame.getContentPane().add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Phone Number:");
		lblNewLabel_1_6.setForeground(Color.WHITE);
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_6.setBounds(10, 410, 169, 34);
		frame.getContentPane().add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_3_6 = new JLabel("New label");
		lblNewLabel_3_6.setForeground(Color.WHITE);
		lblNewLabel_3_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_6.setBounds(178, 421, 83, 14);
		frame.getContentPane().add(lblNewLabel_3_6);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 534, 947, 331);
		frame.getContentPane().add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID","Task Description", "Status", "Deadline"
			}
		));
		
		table_1.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				selectedTaskId=Integer.parseInt((String) table_1.getValueAt(table_1.getSelectedRow(), 0));
			}

		});
		ResultSet rs=DB.selectData("select * from task where Worker_Workerid="+person.getId());
		ArrayList<Task> tasks=new ArrayList();
		Project project=new Project(0, null, null, 0);
		//String workerName, String taskDescription, boolean status, String deadline) 
		while (rs.next()) tasks.add(project.new Task(rs.getInt(1),person.getPersonName(),rs.getString(2),rs.getBoolean(3),rs.getString(4)));
		for (Task task : tasks) {
			String[] row={Integer.toString(task.getId()),task.getTaskDescription(),task.getStatus(),task.getDeadline()};
 			((DefaultTableModel) table_1.getModel()).addRow(row);
		}
		scrollPane_1.setViewportView(table_1);
		
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.kStartColor = Color.BLUE;
		gradientPanel.kEndColor = Color.RED;
		gradientPanel.setBounds(-12, 0, 1100, 891);
		frame.getContentPane().add(gradientPanel);
		gradientPanel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(389, 44, 580, 413);
		gradientPanel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID","Meet Name", "Description", "Time"
			}
		));

		table.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				selectedMeetId=Integer.parseInt((String) table.getValueAt(table.getSelectedRow(), 0));
			}
		});
		ArrayList<Meet> meets=new ArrayList<>();
		rs = DB.selectData("select * from meet where Team_idTeam="+((ITWorker)person).getTeamId()+";");
		while (rs.next()) {
			//	public Meet(String meetingId, int teamID,String name, String description, String meetingTime) {
			meets.add(new Meet(rs.getInt(1),rs.getInt(5),rs.getString(2),rs.getString(3),rs.getString(4)));
		}
		for (Meet meet : meets) {
			String[] row= {Integer.toString(meet.getMeetingId()),meet.getName(),meet.getDescription(),meet.getMeetingTime()};
			((DefaultTableModel) table.getModel()).addRow(row);
		}
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_4 = new JLabel("MEETS");
		lblNewLabel_4.setBounds(389, -17, 186, 75);
		gradientPanel.add(lblNewLabel_4);
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		JButton btnNewButton = new JButton("Cancel Meet");
		btnNewButton.setBounds(820, 468, 125, 36);
		gradientPanel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (selectedMeetId==-1) return;
				try {
					String insertQueryMeet = String.format(
							"INSERT INTO attendence (isAttended, worker_workerid, meet_idMeet)\r\n"
									+ "VALUES (\"%s\",\"%s\",\"%s\");",
							0, person.getId(), selectedMeetId);
					DB.insertData(insertQueryMeet);
				} catch (SQLException e1	) {
					// TODO Auto-generated catch block

				}
								
			}
		});
		JButton btnCompleeteTask = new JButton("Complete Task");
		btnCompleeteTask.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (selectedTaskId==-1) {
					JOptionPane.showMessageDialog(frame, "SELECT ONE TASK",
							"NO TASK SELECTED", JOptionPane.WARNING_MESSAGE);
					return;
				}
				ITWorkerReportScreen.OpenITWorkerReportsScreen(selectedTaskId,person);
				
				
				
			}
		});
		btnCompleeteTask.setBounds(23, 464, 170, 44);
		gradientPanel.add(btnCompleeteTask);
		
		JButton btnNewButton_1 = new JButton("Accept Meet");
		btnNewButton_1.setBounds(685, 468, 125, 36);
		gradientPanel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (selectedMeetId==-1) return;
				try {
					String insertQueryMeet = String.format(
							"INSERT INTO attendence (isAttended, worker_workerid, meet_idMeet)\r\n"
									+ "VALUES (\"%s\",\"%s\",\"%s\");",
							1, person.getId(), selectedMeetId);
					DB.insertData(insertQueryMeet);
				} catch (SQLException e1	) {
					// TODO Auto-generated catch block

				}
				
			}
		});
		JSeparator separator = new JSeparator();
		separator.setBounds(23, 515, 943, 2);
		gradientPanel.add(separator);
	}
}
