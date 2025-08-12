package com;

public class Employee {

	private int empId;
	
	private String email;
	
	private double sal;
	
	public Employee() {
		
	}
    

	public Employee(int empId, String email, double sal) {
		super();
		this.empId = empId;
		this.email = email;
		this.sal = sal;
	}


	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", email=" + email + ", sal=" + sal + "]";
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}
	
}
