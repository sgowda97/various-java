package com.Assignment;

import java.util.Scanner;

//Java implementation 
class BubbleSortString 
{ 

	static int MAX = 100; 

	public static void sortStrings(String[] arr, int n) 
	{ 
		String temp; 

		// Sorting strings using bubble sort 
		for (int j = 0; j < n - 1; j++) 
		{ 
			for (int i = j + 1; i < n; i++) 
			{ 
				if (arr[j].compareTo(arr[i]) > 0) 
				{ 
					temp = arr[j]; 
					arr[j] = arr[i]; 
					arr[i] = temp; 
				} 
			} 
		} 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the length of the elements:");
		int length = sc.nextInt();
		String[] elements = new String[length];

		System.out.println("Enter the elements:");
		for (int i = 0; i < length; i++) {
			elements[i] = sc.next();
		} 
		sortStrings(elements, elements.length); 
		System.out.println("Strings in sorted order are : "); 
		for (int i = 0; i < elements.length; i++) 
			System.out.println("String " + (i + 1) + " is " + elements[i]); 
		
		sc.close();
	} 
} 
