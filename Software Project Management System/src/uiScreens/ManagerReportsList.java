package uiScreens;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.JLabel;
import java.awt.Font;
import keeptoo.KGradientPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

public class ManagerReportsList {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void OpenManagerReportsScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagerReportsList window = new ManagerReportsList();
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
	public ManagerReportsList() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		try {
			UIManager.setLookAndFeel( new FlatDarkLaf() );
		} catch (UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 1048, 727);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Current Project:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(10, 0, 225, 69);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblProjectname = new JLabel("projectName");
		lblProjectname.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblProjectname.setBounds(206, 0, 225, 69);
		frame.getContentPane().add(lblProjectname);
		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(10, 63, 151, 38);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Surname:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(10, 126, 151, 38);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Title:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(10, 188, 151, 38);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("<name>");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_3.setBounds(84, 63, 151, 38);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("<surname>");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_4.setBounds(115, 126, 151, 38);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("<title>");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_5.setBounds(64, 188, 151, 38);
		frame.getContentPane().add(lblNewLabel_1_5);
		
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.setBounds(433, 0, 609, 696);
		frame.getContentPane().add(gradientPanel);
		gradientPanel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 578, 661);
		gradientPanel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Owner", "Task Name"
			}
		));
		scrollPane.setViewportView(table);
		
		JTextArea txtrTasknRaporununAklamas = new JTextArea();
		txtrTasknRaporununAklamas.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtrTasknRaporununAklamas.setEditable(false);
		txtrTasknRaporununAklamas.setForeground(UIManager.getColor("Button.darkShadow"));
		txtrTasknRaporununAklamas.setDisabledTextColor(Color.BLACK);
		txtrTasknRaporununAklamas.setText("Task\u0131\u0131n raporunun a\u00E7\u0131klamas\u0131 gelecek ");
		txtrTasknRaporununAklamas.setBounds(10, 259, 415, 418);
		frame.getContentPane().add(txtrTasknRaporununAklamas);
		
		JButton btnNewButton = new JButton("See Report");
		btnNewButton.setBounds(246, 210, 177, 38);
		frame.getContentPane().add(btnNewButton);
	}
}
