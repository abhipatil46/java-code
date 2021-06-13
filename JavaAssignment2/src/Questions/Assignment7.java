package Questions;
//import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner s1=new Scanner(System.in);
		String arr[]= {"Abhi","Manooj@2122","Hello World","Deesha","Admin@gamil.com"};
		
		show(arr);
		
	}
	
	static void show(String arr[])
	{
		String data[]= new String[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			
			Pattern pat=Pattern.compile("[^a-z\\s]",Pattern.CASE_INSENSITIVE);
			Matcher match=pat.matcher(arr[i]);
			boolean bol=match.find();
			
			if(!bol)
				data[i]=arr[i];
		}
		System.out.println("Here i found the strings which not contains Symbols & Numbers :");
		for(int j=0;j<data.length;j++) {
			if(data[j]!=null)
				System.out.println(data[j]);
				
		}
	}
}
