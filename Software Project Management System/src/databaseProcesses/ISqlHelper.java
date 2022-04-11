package databaseProcesses;

import java.sql.ResultSet;

public interface ISqlHelper {

	// Insert
	void insertData(String inserexecute);

	// Update
	void updateData(String updateexecute);

	// Delete
	void deleteData(String deleteExecute);

	// Select
	ResultSet selectData(String SelectDataExecute);

}
