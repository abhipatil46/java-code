package single_inheritace_student;

public class Course {
	
	public String courseName;
	public int courseCode;
	public int fee;
	
	public void addCourse(String courseName,int courseCode,int fee) {
		this.courseCode=courseCode;
		this.courseName=courseName;
		this.fee=fee;
	}
	public void showCourse() {
		System.out.println("Course : "+this.courseCode+"\t"+this.courseName+"\t"+this.fee);
	}
	
}
