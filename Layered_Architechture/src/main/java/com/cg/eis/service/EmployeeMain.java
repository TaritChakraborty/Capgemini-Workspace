package com.cg.eis.service;

import java.util.Scanner;

//import com.cg.eis.bean.Employee;
import com.cg.eis.pl.EmployeeService;


public class EmployeeMain{
	public static void instructions() {
		System.out.println("Enter 1: Add Employee \t\t\t Enter 2: Check Insurance Scheme");
		System.out.println("Enter 3: Delete Employee \t\t Enter 4: View Employee List");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeService empService = new EmployeeService(); 
		int id = 0, salary = 0;
		String name = null, designation = null, scheme = null;
		char ch = 'y';
		while(ch == 'y') {
			instructions();
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				id = sc.nextInt();
				name = sc.next();
				designation = sc.next();
				salary = sc.nextInt();
				empService.addEmployee(id, name, salary, designation);
				break;
			case 2:
				System.out.println("Select details of insurance scheme: ");
				char ch_scheme = 'y';
				do {
					System.out.println("Enter 1: Scheme A"+"\t\t"+"Enter 2: Scheme B");
					System.out.println("Enter 3: Scheme C"+"\t\t"+"Enter 4: No Scheme");
					System.out.println("Enter Choice: ");
					int choice_1 = sc.nextInt();
					switch(choice_1)
					{
					case 1 :
						scheme = "Scheme A";
						empService.readScheme(scheme);
						break;
					case 2:
						empService.readScheme("Scheme B");
						break;
					case 3:
						empService.readScheme("Scheme C");
						break;
					case 4:
						empService.readScheme("No Scheme");
						break;
					default:
						System.out.println("Wrong Choice!");
					}
					System.out.println("Want to continue: (y/n) ");
					ch_scheme = sc.next().trim().charAt(0);
				}while(ch_scheme == 'y');
				break;
			case 3:
				id = sc.nextInt();
				empService.deleteEmployee(id);
				break;
			case 4:
				empService.readAllEmployee();
				break;
			default:
				System.out.println("Wrong Choice!");
			}
			System.out.println("Want to continue: (y/n) ");
			ch = sc.next().trim().charAt(0);
		}
		sc.close();
	}
}
