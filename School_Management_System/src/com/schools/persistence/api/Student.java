package com.schools.persistence.api;

public class Student{
	
	private int id;
	private String name;
	private double feePaid;
	private static final double totalFees = 300000;
	private Address address;
	private long phoneNumber;
	private int grade; 
	
	public Student(String name, int grade) {
		this.id += 1;
		this.name = name;
		this.grade = grade;
	}

	public Student(String name, int grade, double feePaid, Address address, long phoneNumber) {
		this(name, grade);
		this.feePaid = feePaid;
		this.phoneNumber = phoneNumber;
		this.address = address;
		
	}

	public double getFeePaid() {
		return feePaid;
	}

	public void updateFeePaid(double feePaid) {
		if(totalFees >= feePaid) {
			this.feePaid +=feePaid;
			System.out.println("Remaining fee is - {} " + (totalFees - feePaid));
		}
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public static double getTotalFees() {
		return totalFees;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", feePaid=" + feePaid + ", address=" + address
				+ ", phoneNumber=" + phoneNumber + ", grade=" + grade + " , totalFees = "+ totalFees + "]";
	}


}
