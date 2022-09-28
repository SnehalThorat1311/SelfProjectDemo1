package com.DemoProject1;

import java.util.Scanner;
import java.util.List;

public class TestProject {

	public static void main(String[] args) {
		Employee_Data emp_data = new Employee_Data();
		Employee e = new Employee();
		
		int c = 0;
		
		do {
			System.out.println("--------------------------------------------------------");
			System.out.println("1.Add Employee");
			System.out.println("2.Display Employee");
			System.out.println("3.Update Employee");
			System.out.println("4.Search Employee");
			System.out.println("5.Delete Employee");
			System.out.println("--------------------------------------------------------");
			System.out.println("Enter Your Choice :");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("==========================================================");
				emp_data.addEmployeeData();
				System.out.println("==========================================================");
				break;
				
			case 2:
				System.out.println("==========================================================");
				emp_data.displayEmployeeData();
				System.out.println("==========================================================");
				break;
				
			case 3:
				System.out.println("==========================================================");
				emp_data.updateEmployeeData();
				System.out.println("==========================================================");
				break;
				
			case 4:
				System.out.println("==========================================================");
				emp_data.searchEmployeeData();
				System.out.println("==========================================================");
				break;
				
			case 5:
				System.out.println("==========================================================");
				emp_data.deleteEmployeeData();
				System.out.println("==========================================================");
				break;
				
			default:
				System.out.println("==========================================================");
				System.out.println("Please enter valid choice");
				break;
			}
			System.out.println("Do you want to continue(y/n)");
			c = sc.next().charAt(0);
		}while((c == 'y' || c == 'Y') || (c == 'n' || c == 'N'));
		System.out.println("**************THANK YOU !!!!****************");

	}

}
