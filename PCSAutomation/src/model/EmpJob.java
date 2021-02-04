package model;

public class EmpJob {
	private int ejId;
	private int employeeId;
	private int jobId;
	private String recruited;
	public EmpJob() {
		super();
		// TODO Auto-generated constructor stub
	}
//	PAAMETERISED CONSTRUCTOR METHOD
	public EmpJob(int ejId, int employeeId, int jobId, String recruited) {
		super();
		this.ejId = ejId;
		this.employeeId = employeeId;
		this.jobId = jobId;
		this.recruited = recruited;
	}
//	PAAMETERISED CONSTRUCTOR METHOD WITHOUT EJID
	public EmpJob(int employeeId, int jobId, String recruited) {
		super();
		this.employeeId = employeeId;
		this.jobId = jobId;
		this.recruited = recruited;
	}
//	GETTER AND SETTER METHODS
	public int getEjId() {
		return ejId;
	}
	public void setEjId(int ejId) {
		this.ejId = ejId;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public String getRecruited() {
		return recruited;
	}
	public void setRecruited(String recruited) {
		this.recruited = recruited;
	}
	
	

}
