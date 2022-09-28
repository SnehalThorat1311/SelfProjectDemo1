package com.DemoProject1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee_Data {

	List<Employee> employeeList = new ArrayList<Employee>();
	
	Scanner scanner = new Scanner(System.in);
	
	//step-1 : Inserting the employee data
	
	public void addEmployeeData() {
		System.out.println("\t\t\t\t**********ADD EMPLOYEE INFORMATION**********\n");
		System.out.println("How many employee information you want to add :");
		int count = 1;
		int num = scanner.nextInt();
		int i = 0;
		for(i = 1; i <= num; i++) {
			System.out.println("Enter Employee List "+ i + "Details :" );
			System.out.println("Enter Id :");
			int empId = scanner.nextInt();
			System.out.println("Enter First Name :");
			String firstName = scanner.next();
			System.out.println("Enter Last Name :");
			String lastName = scanner.next();
			System.out.println("Enter Age :");
			int age = scanner.nextInt();
			System.out.println("Enter Salary :");
			long salary = scanner.nextLong();
			System.out.println("Enter Mobile Number :");
			long mbNo = scanner.nextLong();
			System.out.println("Enter City :");
			String city = scanner.next();
			
			Employee e1 = new Employee(empId, firstName, lastName, age, salary, mbNo, city);
			employeeList.add(e1);
			count++;
		}
		if(count == i) {
			System.out.println("\n" +(i-1)+ " Record Inserted Successfully...");
		}
	}
	
	//step-2 : Display employee information
	public void displayEmployeeData() {
		System.out.println("\t\t\t\t***********DISPLAY EMPLOYEE INFORMATION*************\n");
		System.out.println("empId\tfirstName\tlastName\tage\t\tsalary\t\t\tmbNo\t\tcity");
		System.out.println(employeeList +"\n");
	}
	
	//step-3 : Update employee information
	public void updateEmployeeData() {
		System.out.println("\t\t\t\t************UPDATE EMPLOYEE INFORMATION**************\n");
		System.out.println("Enter Id of Employee :");
		int empId = scanner.nextInt();
		System.out.println("Enter updated Mobile No :");
		long mbNo = scanner.nextLong();
		
		int length = employeeList.size();
		int count = 0;
		for(int i = 0; i < length; i++) {
			if(employeeList.get(i).getEmpId() == empId) {
				employeeList.get(i).setMbNo(mbNo);
				System.out.println("\n Employee Record Update Successfully...");
				count++;
			}
		}
		if(count == 0) {
			System.out.println("\n Wrong employee Id[PLEASE ENTER VALID EMPLOYEE ID]");
		}
	}

	//step-4 : Searching the employee information
	public void searchEmployeeData() {
		System.out.println("\t\t\t\t*************SEARCH EMPLOYEE INFORMATION***************\n");
		System.out.println("Enter employee Id to search information :");
		int empId = scanner.nextInt();
		int length = employeeList.size();
		int count = 0;
		for(int i = 0; i < length; i++) {
			if(employeeList.get(i).getEmpId() == empId) {
				System.out.println("Employee Record are present \n");
				Employee e2 = employeeList.get(i);
				System.out.println(e2);
				count++;
			}
		}
		if(count == 0) {
			System.out.println("\n Wrong employee Id[PLEASE ENTER VALID EMPLOYEE ID]");
		}
	}
	
	//step-5 : Delete employee information
	public void deleteEmployeeData() {
		System.out.println("\t\t\t\t*****************DELETE EMPLOYEE INFORMATION******************\n");
		System.out.println("Enter employee Id to delete Employee record :");
		int empId = scanner.nextInt();
		int length = employeeList.size();
		int count = 0;
		for(int i = 0; i < length; i++) {
			if(employeeList.get(i).getEmpId() == empId) {
				Employee e3 = employeeList.get(i);
				System.out.println("\n Employee record Delete Successfully...");
				count++;
			}
		}
		if(count == 0) {
			System.out.println("\n Wrong employee Id[PLEASE ENTER VALID EMPLOYEE ID]");
		}
	}

}
