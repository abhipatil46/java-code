package single_inheritace_student;

public class Student extends Course{

	public String SName;
	public int rollNo;

	public void addStudent(String SName,int rollNo) {
		this.SName=SName;
		this.rollNo=rollNo;
	}
	public void showStudent() {
		System.out.println("Student : "+this.SName+"\t"+this.rollNo);
	}
	
}
