package Assignment_Q;

import java.util.Scanner;

class Book{
	public int bookNo;
	public String bookName;
	public int price;
	public int SbookNo;
	Scanner s1=new Scanner(System.in);
	
	public void AddBook()
	{
		System.out.println("Enter book No : ");
		bookNo=s1.nextInt();
		
		System.out.println("Enter book name :");
		bookName=s1.next();
		
		System.out.println("Enter book Price : ");
		price=s1.nextInt();
	}
	public void showBook() {
		System.out.println(bookNo+"\t"+bookName+"\t"+price);
	}
	
	public void search() {
		System.out.println("Enter book No to search book : ");
		SbookNo=s1.nextInt();
		
		if(bookNo==SbookNo) {
			System.out.println("Book is Available");
			showBook();
		}else {
			System.out.println("Book is not Available");
		}
	}
	
}

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book b1=new Book();
		
		b1.AddBook();
		
		b1.showBook();
		
		b1.search();

	}

}

