package com.schools.persistence.api;

public class ClientApp {
	
	public static void main(String[] args) {
		Address adrs1 = new Address();
		Student s1 = new Student("John", 4, 5000, adrs1, 7265145365l);
		SchoolAPI school = new School();
		System.out.println(school.createStudent(s1));
		
		Teacher teacher = new Teacher("Prasanna",50000,3,897747l,adrs1);
		System.out.println(school.createTeacher(teacher));
		
		
	}

}
