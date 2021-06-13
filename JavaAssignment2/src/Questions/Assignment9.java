package Questions;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Student{
	public String student_name;
	public String H_Quali;
	public int marks;
	public String university;
	public String q[]= {"ssc","hsc","graduate","post graduate"};
	public boolean valid=false;
	public int n=0;
	
	public void enrollStudent(String student_name,String H_Quali,int marks,String university) {
		this.university=university;
		this.student_name=student_name;
		this.H_Quali=H_Quali;
		this.marks=marks;
		if(valideateInput()) {
			System.out.println("Student registration Successfull:");
		}
		else {
			System.out.println("input is Wrong please cheak the detials");
		}
	}
	public boolean valideateInput() {
		
		Pattern pat=Pattern.compile("[^a-z]",Pattern.CASE_INSENSITIVE);
		Matcher match=pat.matcher(this.student_name);
		boolean bol=match.find();
		if(this.marks>1 && this.marks<100)
		{
			if(bol)
				System.out.println("Enter valid Student name");
			else {
				Pattern pat1=Pattern.compile("[^a-z]",Pattern.CASE_INSENSITIVE);
				Matcher match1=pat1.matcher(this.university);
				boolean bol2=match1.find();
				if(bol2)
				{
					System.out.println("Enter valid University name");
					valid=false;
				}
				else {
						for(int i=0;i<q.length;i++)
						{
							if(this.H_Quali==q[i])
								n++;
						}
						if(n<1)
							System.out.println("Enter valid Qualification :");
							
						}
					 }
		}
		else 
		{
			valid=false;
			System.out.println("Enter valid marks");
		}
		if(n>0)
			valid=true;
		return valid;
	}
}
public class Assignment9 {

	public static void main(String[] args) {
		Student s1=new Student(); 
		s1.enrollStudent("Abhishek", "post graduate", 89, "pune");
		
	}

}
