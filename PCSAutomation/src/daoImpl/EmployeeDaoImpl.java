package daoImpl;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import config.JDBCConnection;
import dao.IEmployeeDao;
import model.Employee;


public class EmployeeDaoImpl implements IEmployeeDao {
Connection conn=null;
	
public EmployeeDaoImpl() {
	conn=JDBCConnection.getDBConnection();
}
public Employee checkLogin(String userId,String password) {
	Employee emp=new Employee();
	try {
		String query="select * from Employee Where userId=? and password=?";
		PreparedStatement pst=conn.prepareStatement(query);
		pst.setString(1,  userId);
		pst.setString(2,  password);
		ResultSet rst=pst.executeQuery();
		if(rst!=null) {
			if(rst.next())
			{
				emp.setEmployeeId(rst.getInt(1));
				emp.setFirstName(rst.getString(2));
				emp.setLastName(rst.getString(3));
				emp.setEmail(rst.getString(4));
				emp.setUserId(rst.getString(5));
				emp.setPassword(rst.getString(6));
				emp.setRole(rst.getString(7));
				emp.setGender(rst.getString(8));
				emp.setActive(rst.getString(9));
				
				
			}
		}
	}catch(SQLException ex){
		System.out.println(ex);
		
		
		
	}
	return emp;
}

@Override
public List<Employee> getAllEmployees() {
	// TODO Auto-generated method stub
	List<Employee> empList=new ArrayList<Employee>();
	
	try {
		String query="select * from Employee";
		Statement stmt=conn.createStatement();
		ResultSet rst=stmt.executeQuery(query);
		if(rst!=null) {
			Employee emp=new Employee();
			while(rst.next()) {
				emp.setEmployeeId(rst.getInt(1));
				emp.setFirstName(rst.getString(2));
				emp.setLastName(rst.getString(3));
				emp.setEmail(rst.getString(4));
				emp.setUserId(rst.getString(5));
				emp.setPassword(rst.getString(6));
				emp.setRole(rst.getString(7));
				emp.setGender(rst.getString(8));
				emp.setActive(rst.getString(9));
				empList.add(emp);
			}
		}
		
	}catch(SQLException ex) {
		System.out.println(ex);
	}
	return empList; 
	
}

@Override
public void addEmployee(Employee emp) {
	
	try {
		String query="insert into Employee(FirstName,LastName,Email,UserId,Password,Role,Gender,Active) values (?,?,?,?,?,?,?,?)";
	    PreparedStatement pst=conn.prepareStatement(query);
		pst.setString(1,emp.getFirstName());
		pst.setString(2,emp.getLastName());
		pst.setString(3,emp.getEmail());
		pst.setString(4,emp.getUserId());
		pst.setString(5,emp.getPassword());
		pst.setString(6,emp.getRole());
		pst.setString(7,emp.getGender());
		pst.setString(8,emp.getActive());
		int i=pst.executeUpdate();
		if(i==1)
			System.out.println("1 record inserted");
		else {
			System.out.println("insertion failed.....");
			
		}
		
	
	}
	catch(SQLException ex) {
		System.out.println(ex);
	}
	
}

@Override
public Employee getEmployeeById(int id) {
	
	Employee emp=new Employee();
	try {
		String query="select * from Employee where EmployeeId=?";
		PreparedStatement pst=conn.prepareStatement(query);
		pst.setInt(1,id);
		ResultSet rst=pst.executeQuery(query);
		if(rst!=null) {

			while(rst.next()) {
				emp.setEmployeeId(rst.getInt(1));
				emp.setFirstName(rst.getString(2));
				emp.setLastName(rst.getString(3));
				emp.setEmail(rst.getString(4));
				emp.setUserId(rst.getString(5));
				emp.setPassword(rst.getString(6));
				emp.setRole(rst.getString(7));
				emp.setGender(rst.getString(8));
				emp.setActive(rst.getString(9));
				
			}
		}
		
	}catch(SQLException ex) {
		System.out.println(ex);
	}
	return emp; 
	
}

@Override
public void updateEmployee(Employee emp) {
	// TODO Auto-generated method stub
	
}

@Override
public void deactiveEmployee(int id) {
	// TODO Auto-generated method stub
	
}

@Override
public void deleteEmployee(int id) {
	// TODO Auto-generated method stub
	
}


@Override
public void activateEmployee(Employee emp) {
	// TODO Auto-generated method stub
	
}

	
	

}
