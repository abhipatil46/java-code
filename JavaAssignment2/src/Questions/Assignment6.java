package Questions;
import java.util.Scanner;


public class Assignment6{

	public static void main(String []args) {
	Scanner s1=new Scanner(System.in);
	float arr[]=new float[5];
	
	System.out.println("Enter 5 arry values:");
	for(int i=0;i<arr.length;i++) {
		arr[i]=s1.nextFloat();
	}
	
	 float show=searchValue(arr,22.3f);
	
 }
	//Function body .....
	
	
	static float searchValue(float arr[],float val) {
		int pos=0;
		int index=0;
		float next=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==val) {
				pos++;
				index=i;
			}
			else {
				if(arr[i]>val){
					next=arr[i];
					break;
				}
			}
		}
			
		if(pos>0) {
			System.out.println(val+" found at position "+index+1);
		}else {
			System.out.println("oops "+val+" not found. But "+next+" is near to "+val);
		}
		
		return 0;
	}
}

