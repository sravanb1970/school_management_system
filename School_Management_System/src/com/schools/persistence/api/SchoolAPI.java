package com.schools.persistence.api;

public interface SchoolAPI {
	
	public String createTeacher(Teacher teacher);

	public String createStudent(Student student);

	public void updateFeePaid(int id, double feePaid);

	

	

}
