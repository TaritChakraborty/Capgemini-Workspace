package com.cg.eis.pl;

public interface EmployeeServiceInterface {
	void addEmployee(int id, String name, int salary, String designation);
	void readScheme(String str);
	void deleteEmployee(int id);
	void readAllEmployee();
}
