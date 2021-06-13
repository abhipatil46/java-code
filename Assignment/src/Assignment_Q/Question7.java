package Assignment_Q;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=200;i++) {
			if(i<=100 && i%2==0)
				System.out.println(i+"\n");
			else if(i==101)
				System.out.println("Odd No's Start \n"+i);
			else if(i>100 && i%2==1)
				System.out.println(i);	
		}
	}

}
