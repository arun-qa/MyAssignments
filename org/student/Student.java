package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName()
	{
		System.out.println("Arun G");
	}
	
	public void studentDept()
	{
		System.out.println("IT");
	}
	
	public void studentID()
	{
		System.out.println("12808205002");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student Stu = new Student();
		Stu.collegeCode();
		Stu.collegeName();
		Stu.collegeRank();
		Stu.deptName();
		Stu.studentName();
		Stu.studentID();
		Stu.studentDept();
		
		

	}

}
