package uiScreens;

import java.awt.EventQueue;

import javax.swing.JFrame;
import keeptoo.KGradientPanel;
import softwareProjectManagement.Manager;
import softwareProjectManagement.Person;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.formdev.flatlaf.FlatDarkLaf;

import databaseProcesses.GeneralDB;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class ManagerScreen {

	private JFrame frame;
	private GeneralDB DB = GeneralDB.getObject();
	private String projectName;

	/**
	 * Launch the application.
	 */
	public static void openManagerScreen(Person person) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					ManagerScreen window = new ManagerScreen(person);
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
	public ManagerScreen(Person person) {
		initialize(person);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Person person) {


		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 575, 728);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.kEndColor = Color.RED;
		gradientPanel.kStartColor = Color.BLUE;
		gradientPanel.setBounds(359, 0, 243, 761);
		frame.getContentPane().add(gradientPanel);
		gradientPanel.setLayout(null);

		JLabel lblNewLabel_4 = new JLabel("MENU");
		lblNewLabel_4.setForeground(new Color(255, 255, 224));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(56, 84, 107, 48);
		gradientPanel.add(lblNewLabel_4);

		JButton btnNewButton = new JButton("Meets");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.out.println("MeetsScreen");
				ManagerMeetsScreen.OpenManagerMeetsScreen();
			}
		});
		btnNewButton.setBounds(38, 232, 125, 32);
		gradientPanel.add(btnNewButton);

		JButton btnProjectTasks = new JButton("Project Tasks");
		btnProjectTasks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.out.println("Project Tasks");
				ManagerTasksScreen.OpenManagerTasksScreen(person);

			}
		});
		btnProjectTasks.setBounds(38, 354, 125, 32);
		gradientPanel.add(btnProjectTasks);

		JButton btnTeam = new JButton("Team and Reports");
		btnTeam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.out.println("Team Screen");

				int teamid;

				try {

					ResultSet rs = DB.selectData("select * from worker\r\n" + "where workerid = " + person.getId());
					rs.next();
					teamid = rs.getInt("Team_idTeam");
					System.out.println(teamid);
					ManagerTeamMembers.OpenManagerTeamScreen(teamid,projectName);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		btnTeam.setBounds(38, 482, 125, 32);
		gradientPanel.add(btnTeam);

		Manager manager = (Manager) person;

		JLabel lblNewLabel = new JLabel("Personal \r");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(10, 11, 339, 75);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Title:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(10, 156, 103, 34);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("\nInformation");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_2.setBounds(10, 75, 284, 47);
		frame.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_1_1 = new JLabel("Name:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(10, 201, 103, 34);
		frame.getContentPane().add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("Surname:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(10, 246, 103, 34);
		frame.getContentPane().add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_3 = new JLabel("Current Project:");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(10, 291, 169, 34);
		frame.getContentPane().add(lblNewLabel_1_3);

		JLabel lblNewLabel_1_5 = new JLabel("Salary:");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_5.setBounds(10, 336, 103, 34);
		frame.getContentPane().add(lblNewLabel_1_5);

		JLabel lblNewLabel_1_6 = new JLabel("Phone Number:");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_6.setBounds(10, 381, 169, 34);
		frame.getContentPane().add(lblNewLabel_1_6);

		JLabel lblNewLabel_3 = new JLabel(person.getTitle());
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(67, 167, 112, 23);
		frame.getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_3_1 = new JLabel(person.getPersonName());
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_1.setBounds(80, 215, 99, 20);
		frame.getContentPane().add(lblNewLabel_3_1);

		JLabel lblNewLabel_3_2 = new JLabel(person.getPersonSurname());
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_2.setBounds(114, 260, 147, 20);
		frame.getContentPane().add(lblNewLabel_3_2);

		try {
			ResultSet rs = DB.selectData(
					"select projectname from worker inner join project on worker.Team_idTeam = project.Team_idTeam\r\n"
							+ "where workerid =+" + manager.getId());
			rs.next();
			projectName=rs.getString(1);
			JLabel lblNewLabel_3_3 = new JLabel(rs.getString(1));
			lblNewLabel_3_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblNewLabel_3_3.setBounds(183, 292, 166, 34);
			frame.getContentPane().add(lblNewLabel_3_3);
			rs.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		JLabel lblNewLabel_3_5 = new JLabel("" + manager.getSalary() + "$");
		lblNewLabel_3_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_5.setBounds(90, 343, 132, 23);
		frame.getContentPane().add(lblNewLabel_3_5);

		JLabel lblNewLabel_3_6 = new JLabel(manager.getPersonPhone());
		lblNewLabel_3_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_6.setBounds(178, 384, 171, 31);
		frame.getContentPane().add(lblNewLabel_3_6);

		KGradientPanel gradientPanel_1 = new KGradientPanel();
		gradientPanel_1.setLayout(null);
		gradientPanel_1.kStartColor = Color.BLUE;
		gradientPanel_1.setkStartColor(Color.BLUE);
		gradientPanel_1.kEndColor = Color.RED;
		gradientPanel_1.setkEndColor(Color.RED);
		gradientPanel_1.setBounds(0, 611, 365, 86);
		frame.getContentPane().add(gradientPanel_1);

		JButton btnNewButton_1_1 = new JButton("Cancel");
		btnNewButton_1_1.setForeground(new Color(255, 0, 0));
		btnNewButton_1_1.setBounds(201, 21, 139, 37);
		gradientPanel_1.add(btnNewButton_1_1);

		JButton btnNewButton_1_1_1 = new JButton("Complete");
		btnNewButton_1_1_1.setBounds(35, 21, 139, 37);
		gradientPanel_1.add(btnNewButton_1_1_1);

		JLabel lblProjectInformation = new JLabel("Project Information");
		lblProjectInformation.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblProjectInformation.setBounds(10, 414, 339, 75);
		frame.getContentPane().add(lblProjectInformation);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 426, 339, 2);
		frame.getContentPane().add(separator);

		JLabel lblNewLabel_1_7 = new JLabel("Project Owner:");
		lblNewLabel_1_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_7.setBounds(10, 494, 169, 34);
		frame.getContentPane().add(lblNewLabel_1_7);

		JLabel lblNewLabel_3_7 = new JLabel("New label");
		lblNewLabel_3_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_7.setBounds(167, 505, 83, 14);
		frame.getContentPane().add(lblNewLabel_3_7);

		JLabel lblNewLabel_1_7_1 = new JLabel("Project Status:");
		lblNewLabel_1_7_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_7_1.setBounds(10, 530, 169, 34);
		frame.getContentPane().add(lblNewLabel_1_7_1);

		JLabel lblNewLabel_3_7_1 = new JLabel("New label");
		lblNewLabel_3_7_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_7_1.setBounds(167, 541, 83, 14);
		frame.getContentPane().add(lblNewLabel_3_7_1);

		JLabel lblNewLabel_1_7_1_1 = new JLabel("Project Workers:");
		lblNewLabel_1_7_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_7_1_1.setBounds(10, 566, 187, 34);
		frame.getContentPane().add(lblNewLabel_1_7_1_1);

		JLabel lblNewLabel_3_7_1_1 = new JLabel("15");
		lblNewLabel_3_7_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_7_1_1.setBounds(167, 575, 83, 14);
		frame.getContentPane().add(lblNewLabel_3_7_1_1);
	}
}
