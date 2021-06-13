package single_inheritace;

import single_inheritace_student.Student;

public class MainApp {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.addCourse("Java", 1001, 10000);
		s1.addStudent("Abhi", 3015);
		
		s1.showCourse();
		s1.showStudent();
	}

}
