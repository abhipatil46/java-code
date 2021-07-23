package com.abbhi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List num=Arrays.asList(23,34,56,78,12,34,11,22,89);
		
		//1.Sorting
		Collections.sort(num);
		System.out.println("After Sorting Elements : "+num);
		
		//2.Binary Search 
		int pos = Collections.binarySearch(num, 12);
		System.out.println(pos);
		
		//3.Revers
		Collections.reverse(num);
		System.out.println("After revers :"+num);
		
		//4.Swap
		Collections.swap(num, 4, 1);
		System.out.println("After Swapping :"+num);
		
		//5.Shuffle
		Collections.shuffle(num);
		System.out.println("After Shuffling : "+num);
		
		//6.
	}

}
