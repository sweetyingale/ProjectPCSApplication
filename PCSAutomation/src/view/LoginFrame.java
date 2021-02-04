package view;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.*;

import javax.swing.*;

import controller.EmployeeController;
import model.Employee;
public class LoginFrame extends JFrame {
	Container container;
	JLabel lUserId, lPassword,lMessage;
	JTextField tUserId;
	JPasswordField tPassword;
	JButton bLogin, bRegister;
	JCheckBox cShowPassword;
	EmployeeController empController=null;
	
	public LoginFrame() {
		container=getContentPane();
		lUserId=new JLabel("USERNAME");
		lPassword=new JLabel("PASSWORD");
		tUserId=new JTextField();
		tPassword=new JPasswordField();
		lMessage= new JLabel();////////CHANGED ASKED TO MAM(LOPA MAM)
		empController=new EmployeeController();
		bLogin=new JButton("LOGIN");
		bLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String userId, password;
				userId=tUserId.getText();
				password=new String(tPassword.getPassword());
				Employee emp=new Employee();
				emp=empController.checkLogin(userId, password);
				if(emp==null) {
					lMessage.setText("you are not authorised user! retry or Register!");
					
					
				}
				else {
					if(emp.getActive().equals("Active")) {
						if(emp.getActive().contentEquals("Active"))
							{
								callDispose();
								new HraHomeFrame();
								
					}
						else if(emp.getRole().contentEquals("PME")) {
							callDispose();
							new PmeHomeFrame();
							
						}else {
							callDispose();
							new EmpHomeFrame();
						}
				}
				}
				
			}

			
			
		});
		bRegister=new JButton("REGISTER");
		
		bRegister.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
//			
				callDispose();
				new RegisterFrame();
				
			} 
			
			
		});
		cShowPassword=new JCheckBox("show Password");
		setLayoutManager();
		setLocationAndSize();
		addComponentsToContainer();
		this.setTitle("LOGIN FORM");
		this.setVisible(true);
		this.setBounds(10, 10, 500, 600);
		this.setResizable(false);//fixed sized frame
		
	}
	public void setLayoutManager() {
		container.setLayout(null);
		
	}
	public void setLocationAndSize() {
		lUserId.setBounds(50, 150, 100, 30);
		lPassword.setBounds(50,250,100,30);
		tUserId.setBounds(250,150,150,30);
		tPassword.setBounds(250,250,150,30);
		cShowPassword.setBounds(250,300,150,30);
		
		lMessage.setBounds(100,350,250,30);
		bLogin.setBounds(100,400,100,30);
		bRegister.setBounds(200,400,100,30);
		
		
		
		
	}
	public void addComponentsToContainer() {
		container.add(lUserId);
		container.add(tUserId);
		container.add(lPassword);
		container.add(tPassword);
		container.add(cShowPassword);
		container.add(bLogin);
		container.add(bRegister);
		container.add(lMessage);
		
		
		
	}
	public void callDispose() {
		this.dispose();
		
	}

}
