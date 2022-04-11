package databaseProcesses;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class GeneralDB implements ISqlHelper {

	private String username = "gokay2027";
	private String password = "***"; //�ifreyi tekrar G�RERS�N
	private Connection con;			//DATABASE �EMASI BA�TAN KURULACAK DATABASE ADI AYNI OLACAK
	private Statement stmt;

	public GeneralDB() {
		// TODO Auto-generated constructor stub

		try {

			this.con = DriverManager.getConnection("jdbc:mysql://192.168.1.41:3306/softwaremanagementdb", username,
					password);

			this.stmt = con.createStatement();

			System.out.println("Veritaban� ba�lant�s� yap�ld�");

			

		} catch (Exception e) {

			System.out.println(e);

		}
	}

	@Override
	public void insertData(String insertsql) {
		// TODO Auto-generated method stub
		try {

			stmt.executeUpdate(insertsql);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteData(String deleteexe) {
		// TODO Auto-generated method stub
		try {

			stmt.executeUpdate(deleteexe);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unused")
	@Override
	public ResultSet selectData(String selectExe) {

		ResultSet rs;

		// TODO Auto-generated method stub

		try {

			return rs = stmt.executeQuery(selectExe);

		} catch (SQLException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();

			return null;
		}

	}

	@Override
	public void updateData(String updateExe) {
		// TODO Auto-generated method stub
		try {
			stmt.executeUpdate(updateExe);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
