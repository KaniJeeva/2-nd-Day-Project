package org.sample;

public class GitProjectClass {
	private void empId() {
		
		System.out.println("Employee Id is 1234");
	}
	private void empName() {
		System.out.println("Employee name is kani");

	}
	private void empAdd() {
		System.out.println("EMployee address is chennai");
	}
	public static void main(String[] args) {
		GitProjectClass g= new GitProjectClass();
		g.empId();
		g.empName();
		g.empAdd();
	}

}
