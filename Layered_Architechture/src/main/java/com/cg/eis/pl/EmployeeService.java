package com.cg.eis.pl;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

import com.cg.eis.bean.Employee;
public class EmployeeService implements EmployeeServiceInterface{
	static int key = 0;
	HashMap<Integer,Employee> hm = new HashMap<Integer,Employee>();
	Iterator<Entry<Integer, Employee>> empIterator = hm.entrySet().iterator();
	Scanner sc = new Scanner(System.in);

	public void addEmployee(int id, String name, int salary, String designation) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(id,name,salary,designation);
		hm.put(key, emp);
		emp.setInsuranceScheme(salary, designation);
		key++;		
	}

	@Override
	public void readScheme(String str) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		System.out.println("-----------------------------------------------");
		System.out.println(String.valueOf(e.CheckinsuranceScheme(str)));
		System.out.println("-----------------------------------------------");
		
	}

	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		int flag = 1;
		for(int i = 0 ; i < hm.size() ; i++) {
			if(hm.get(i).getId() == id) {
				hm.remove(i);
				break;
			}else {
				flag = 0;
			}
		}
		if(flag == 0) {
			System.out.println("Employee not found.");
		}
		
	}

	@Override
	public void readAllEmployee() {
		// TODO Auto-generated method stub
		if(hm.size() == 0){
			System.out.println("Employee list is empty.");
		}
		else {
			for(int i = 0; i < hm.size() ; i++) {
				System.out.println("");
				System.out.print("Employee [Id: "+ hm.get(i).getId()+", Name: "+ hm.get(i).getName() +", Designation: "+hm.get(i).getDesignation());
				System.out.print(", Salary: "+hm.get(i).getSalary()+", Insurance Scheme: "+hm.get(i).getInsuranceScheme()+"]");
			}
		}
		
	}
/*	public int takeEmpId() {		
		
		int id = sc.nextInt();
		System.out.println("Enter Employee Id: ");
	//	sc.close();
		return id;
	}
	public String takeEmpName() {
	//	Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("Enter Employee Name: ");
	//	sc.close();
		return name;
		
	}
	public String takeEmpDesignation() {
	//	Scanner sc = new Scanner(System.in);		
		System.out.println("Enter Employee Designation: ");
		String desig = sc.nextLine();
	//	sc.close();
		return desig;
	}
	public int takeEmpSalary() {
	//	Scanner sc = new Scanner(System.in);
		int sal = sc.nextInt();
		System.out.println("Enter Employee Salary: ");
	//	sc.close();
		return sal;
	}
	public String takeEmpScheme() {
	//	Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Salary: ");
		String scheme = sc.nextLine();
	//	sc.close();
		return scheme;
	} */
}
