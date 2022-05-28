package week3.day1;

public class Students {
	
	public void getStudentInfo(int id)
	{
		System.out.println("Student ID is "+id);
		
	}
	
	public void getStudentInfo(int id,String name)
	{
		System.out.println("ID is "+id +" and student name " +name);
		
	}
	
	public void getStudentInfo(String email,long phoneNumber)
	{
		System.out.println("Email Id is " +email +"  and Contact number of student  " +phoneNumber);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students stu1 = new Students();
		stu1.getStudentInfo(48);
		stu1.getStudentInfo(48, "Nithya");
		stu1.getStudentInfo("nithimegha@gmail.com", 960114455);

	}

}
