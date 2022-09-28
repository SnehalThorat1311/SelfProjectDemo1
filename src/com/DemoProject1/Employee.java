package com.DemoProject1;

public class Employee {

	private int empId;
	private String firstName;
	private String lastName;
	private int age;
	private long salary;
	private long mbNo;
	private String city;
	
	public Employee(int empId,String firstName, String lastName, int age, long salary, long mbNo, String city ) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
		this.mbNo = mbNo;
		this.city = city;

	}
	
	public Employee(int empId) {
		
	}
	public Employee() {
		
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public long getMbNo() {
		return mbNo;
	}

	public void setMbNo(long mbNo) {
		this.mbNo = mbNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return empId + "	" +firstName+ "		" +lastName+ "		" +age+ "		" +salary+ "			" +mbNo+ "	" +city+ "\n";
	}
}
