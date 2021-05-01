class Student{
	public static void main(String[] args) {
		StudentDetails student = new StudentDetails();
		student.name();
		student.idNum();
		student.age = 22;
		System.out.println("Age: " +student.age);
	}

	
}
	class StudentDetails{

		int age;
		
		void name(){
			System.out.println("Name: Kapil");
		}
		void idNum(){
			System.out.println("IdNumber: 0017F4");
		}
}