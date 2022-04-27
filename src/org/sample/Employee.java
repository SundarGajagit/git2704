package org.sample;

public class Employee {
	private void empName() {
		System.out.println("Sundar");
	}
	private void empId() {
		System.out.println("120192");
	}
	private void empAdd() {
		System.out.println("Trichy");
	}
	public static void main(String[] args) {
		Employee e=new Employee();
		e.empName();
		e.empId();
		e.empAdd();
	}
}
