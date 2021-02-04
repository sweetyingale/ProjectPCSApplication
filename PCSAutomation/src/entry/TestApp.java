package entry;

import java.sql.SQLException;

import config.JDBCConnection;
import excDao.EmployeeExec;

public class TestApp {

	
	public void testConnection(){
		try {
		if(JDBCConnection.getDBConnection().isClosed()) {
			System.out.println("connection is closed");
		}
		else {
			System.out.println("connection is opened");
		}
		
	}
		catch(SQLException e) {
			e.printStackTrace();
		}
			
		}

	public static void main(String[] args) {
		
	TestApp test=new TestApp();
		test.testConnection();
		//EmployeeExec obj=new EmployeeExec();
		//obj.addEmployee();

	}

}
