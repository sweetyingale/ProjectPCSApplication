package excDao;

import java.util.List;
import java.io.*;

import controller.EmployeeController;
import model.Employee;

public class EmployeeExec {
	EmployeeController empController=null;
	
	public EmployeeExec() {
		empController=new EmployeeController();
	}
	public void getAllEmployees() {
		List<Employee> empList=empController.getAllEmployees();
		for(Employee emp:empList) {
			System.out.println(emp);
		}
	}
	public void getEmployeeById() {
		int id=0;
		try {
			BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter record id who's record you want to view");
			id=Integer.parseInt(reader.readLine());
		}
		catch(IOException ex) {
			System.out.println(ex);
		}
		Employee emp=empController.getEmployeeById(id);
		
			System.out.println(emp);
		
	}
	public void addEmployee() {
		Employee emp=new Employee();
	
		try {
			BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter employee Detail:");
			System.out.println("First Name:");
			emp.setFirstName(reader.readLine());
			System.out.println("Last Name:");
			emp.setLastName(reader.readLine());
			System.out.println("Email:");
			emp.setEmail(reader.readLine());
			System.out.println("UserId:");
			emp.setUserId(reader.readLine());
			System.out.println("Password:");
			emp.setPassword(reader.readLine());
			System.out.println("Role:");
			String role=reader.readLine();
			emp.setRole(role);
			System.out.println("Gender:");
			emp.setGender(reader.readLine());
			if(role.equals("HRA")) {
				emp.setActive("Active");
			}
			else {
				emp.setActive("Deactive");
			}
			
			
			
		
	}catch(IOException ex) {
		System.out.println(ex);
	}
		
		empController.addEmployee(emp);
}
}
