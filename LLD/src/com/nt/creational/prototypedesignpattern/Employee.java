package com.nt.creational.prototypedesignpattern;

public class Employee implements ProtoType {
	private String name;
	private String department;

	public Employee(String name, String department) {
		this.name = name;
		this.department = department;
	}

	@Override
	public ProtoType clone() {
		return new Employee(this.name, this.department);
	}

	public void showDetails() {
		System.out.println("Name: " + name + ", Dept: " + department);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + "]";
	}

}
