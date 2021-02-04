package dao;
//import java.awt.List;

import java.util.List;

import model.Employee;

public interface IEmployeeDao {
	List<Employee> getAllEmployees();
	void addEmployee(Employee emp);
	Employee getEmployeeById(int id);
	void updateEmployee(Employee emp);
	void activateEmployee(Employee emp);
	void deactiveEmployee(int id);
	void deleteEmployee(int id);
	Employee checkLogin(String userId, String password);

}
