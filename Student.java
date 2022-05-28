package week3.day1;

public class Student extends Department {
	
	public void studentName()
	{
		System.out.println("Student Name is Nithya");
	}
	
	public void studentDept()
	{
		System.out.println("Student dept is CSE");
	}
	
	public void studentID()
	{
		System.out.println("Student ID is 41107104048");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student Stu = new Student();
		Stu.collegeName();
		Stu.collegeCode();
		Stu.collegeRank();
		Stu.deptName();
		Stu.studentName();
		Stu.studentDept();
		Stu.studentID();
	}

}
