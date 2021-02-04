package controller;
import java.util.List;

import dao.IEmployeeDao;
import daoImpl.EmployeeDaoImpl;
import model.Employee;

public class EmployeeController {
IEmployeeDao empDao=null;

public EmployeeController() {
	empDao=new EmployeeDaoImpl();
	
}
public Employee checkLogin(String userId, String password)
{
	Employee emp=empDao.checkLogin(userId, password);
	return emp;
}
public List<Employee> getAllEmployees(){
	List<Employee> empList=empDao.getAllEmployees();
	return empList;
	
}
public void addEmployee(Employee emp) {
	empDao.addEmployee(emp);
	
}
public Employee getEmployeeById(int id) {
	Employee emp=empDao.getEmployeeById(id);
	return emp;
	
}
}
