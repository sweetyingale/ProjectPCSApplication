package model;

public class EmpSkill {
	private int esId;
	private int employeeId;
	private int skillId;
	private int experience;
//	default constructor method
	public EmpSkill() {
		super();
		// TODO Auto-generated constructor stub
	}
//	parameterised constructor method
	public EmpSkill(int esId, int employeeId, int skillId, int experience) {
		super();
		this.esId = esId;
		this.employeeId = employeeId;
		this.skillId = skillId;
		this.experience = experience;
	}
//	parameterised constructor method without esid
public EmpSkill(int employeeId, int skillId, int experience) {
	super();
	this.employeeId = employeeId;
	this.skillId = skillId;
	this.experience = experience;
}
//getter and setter method
public int getEsId() {
	return esId;
}
public void setEsId(int esId) {
	this.esId = esId;
}
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public int getSkillId() {
	return skillId;
}
public void setSkillId(int skillId) {
	this.skillId = skillId;
}
public int getExperience() {
	return experience;
}
public void setExperience(int experience) {
	this.experience = experience;
}
	
	
	

}
