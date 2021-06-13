package Questions;
import java.util.Scanner;
class object{
	Scanner s=new Scanner(System.in);
	public int[] Int=new int[10];
	public String[] str=new String[10];
	public float flow[]=new float[10];
	
//	public void takeInt() {
//		for(int i=0;i<Int.length;i++) 
//		{
//			Int[i]=s.nextInt();
//		}
//	}
//	public void takeString() {
//		for(int i=0;i<str.length;i++) 
//		{
//			str[i]=s.next();
//		}
//		}
//	public void takeFloat() {
//		for(int i=0;i<flow.length;i++) 
//		{
//			flow[i]=s.nextFloat();
//		}
//		}
	public void showInt(){
		for(int i=0;i<Int.length;i++)
		{
			System.out.println(Int[i]);
		}
	}
	public void ShowValues(int Int[],String str[],float flow[]) 
	{	
		this.Int=Int;
		this.flow=flow;
		this.str=str;
		
		if(this.Int==Int) {
			showInt();
		}
	}
}
public class Assignment10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i[]={10,20,30,40};
	
		
		object arr[]=new object[1];
		arr[0]= new object();
		arr[0].ShowValues(i,null,null);
		
	}

}
