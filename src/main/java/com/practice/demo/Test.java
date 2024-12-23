package com.practice.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

class Employee {
	private String firstName;
	private String lastName;
	private String gender; // "Male" or "Female"
	private double salary;
	private String department;

	// Constructor
	public Employee(String firstName, String lastName, String gender, double salary, String department) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.salary = salary;
		this.department = department;
	}

	// Getters and setters
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}

public class Test {

	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(new Employee("John", "Doe", "Male", 60000, "HR"),
				new Employee("Jane", "Smith", "Female", 70000, "IT"),
				new Employee("Alex", "Johnson", "Male", 80000, "Finance"),
				new Employee("Emma", "Williams", "Female", 75000, "Marketing"));
		Map<String, Double> map = empList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(map);
		System.out.println(empList.stream().filter(emp -> emp.getGender().equalsIgnoreCase("Male"))
				.map(e -> e.getFirstName() + e.getLastName()).collect(Collectors.toList()));

		// higest Paid employee
		System.out.println(empList.stream().max(Comparator.comparingDouble(Employee::getSalary))
				.map(Employee::getFirstName).get());
		// sort employeee in desc by salary
		System.out.println(empList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
				.map(Employee::getFirstName).toList());
		// count employees in each department
		System.out.println(
				empList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())));
		// find first employee sal greatre than 65000
		Optional<Employee> e = empList.stream().filter(s -> s.getSalary() > 65000).findFirst();
		e.ifPresent(em -> System.out.println(em.getFirstName()));
		// lis of employee name starts with A
		System.out.println(empList.stream().filter(s -> s.getFirstName().substring(0, 1).equalsIgnoreCase("A"))
				.map(Employee::getFirstName).toList());
		
		System.out.println(empList.stream().collect(Collectors.summingDouble(Employee::getSalary)));

	}
}