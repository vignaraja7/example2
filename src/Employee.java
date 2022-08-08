class Employee {

	public Employee(int empId, String empName, int empsalary) {
		
		this.empId = empId;
		this.empName = empName;
		this.empsalary = empsalary;
	}

	public Employee() {
		super();
	}

	private int empId;
	private String empName;
	private int empsalary;

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public int getEmpSalary() {
		return empsalary;
	}

	public void setEmpSalary(int newValue) {
		empsalary = newValue;
	}

	public void setEmpName(String newValue) {
		empName = newValue;
	}

	public void setEmpId(int newValue) {
		empId = newValue;
	}

}
