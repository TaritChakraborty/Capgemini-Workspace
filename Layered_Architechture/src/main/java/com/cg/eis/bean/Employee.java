package com.cg.eis.bean;

public class Employee { //id, name, salary, designation, insuranceScheme.
	int id;
	String name;
	int salary;
	String Designation;
	String insuranceScheme;
	public Employee(){
		super();
	}
	
	public Employee(int id, String name, int salary, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.Designation = designation;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public void setInsuranceScheme(int salary, String designation) {
		if(salary > 5000 && salary < 20000 && designation.equals("System Associate"))
			insuranceScheme = "Scheme C";
		if(salary >= 20000 && salary < 40000 && designation.equals("Programmer"))
			insuranceScheme = "Scheme B";
		if(salary >= 40000 && designation.equals("System Associate"))
			insuranceScheme = "Scheme A";
		if(salary < 5000 && designation.equals("Clerk"))
			insuranceScheme = "No Scheme";
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public String CheckinsuranceScheme(String insScheme) {
		if(insScheme.equals("Scheme A")) {
			return "salary>=40000 && designation == Manager";
		}
		else if(insScheme == "Scheme B") {
			return "salary>=20000 && salary<40000 && designation == Programmer";
		}
		else if(insScheme == "Scheme C") {
			return "salary> 5000 && salary< 20000 && designation == System Associate";
		}
		else if(insScheme == "No Scheme") {
			return "salary<5000 && designation == Clerk";
		}
		else {
			return null;
		}
	}

}
