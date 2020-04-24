package com.schools.persistence.api;

public class Teacher {

	private static int id = 0;
	private String name;
	private int yearsOfExperience;
	private double salary;
	private Address address;
	private long phoneNumber;

	public Teacher(String name, double salary) {
		id += 1;
		this.name = name;
		this.salary = salary;
	}

	public Teacher(String name, double salary, int yearsOfExperience, long phoneNumber, Address address) {
		this(name, salary);
		this.yearsOfExperience = yearsOfExperience;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	public double getSalary() {
		return salary;
	}

	public void updateSalary(double salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void updateAddress(Address address) {
		this.address = address;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void updatePhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public static int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", yearsOfExperience=" + yearsOfExperience + ", salary=" + salary
				+ ", address=" + address + ", phoneNumber=" + phoneNumber + "]";
	}

	
	
	
	
	
}
