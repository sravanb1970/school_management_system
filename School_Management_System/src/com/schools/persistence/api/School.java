package com.schools.persistence.api;

import java.util.ArrayList;
import java.util.List;

public class School implements SchoolAPI {

	private double estimatedTotal;
	private double currentTotal;
	private List<Teacher> teachers;
	private List<Student> students;

	public School() {
		students = new ArrayList<Student>();
		teachers = new ArrayList<Teacher>();
	}

	@Override
	public String createTeacher(Teacher teacher) {
		teachers.add(teacher);
		currentTotal -= teacher.getSalary();
		System.out.println("Current total is - " + currentTotal);
		return "Salary paid to " + teacher.getName() + " = " + teacher.getSalary();

	}

	@Override
	public String createStudent(Student student) {

		students.add(student);
		currentTotal += student.getFeePaid();
		estimatedTotal += Student.getTotalFees();
		return "Student created successfully with below details - " + student.toString();

	}

	@Override
	public void updateFeePaid(int id, double feePaid) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getId() == id) {
				students.get(i).updateFeePaid(feePaid);
				currentTotal += students.get(i).getFeePaid();
			}
		}

	}

	public double getEstimatedTotal() {
		return estimatedTotal;
	}

	public double getCurrentTotal() {
		return currentTotal;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public List<Student> getStudents() {
		return students;
	}

}
