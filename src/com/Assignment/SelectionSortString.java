package com.Assignment;

import java.util.Scanner;

public class SelectionSortString {
	
	public static void selectionSort( String[] array )
	  {
	    
	    // Find the string reference that should go in each cell of
	    // the array, from cell 0 to the end
	    for ( int j=0; j < array.length-1; j++ )
	    {
	      // Find min: the index of the string reference that should go into cell j.
	      // Look through the unsorted strings (those at j or higher) for the one that is first in lexicographic order
	      int min = j;
	      for ( int k=j+1; k < array.length; k++ )
	        if ( array[k].compareTo( array[min] ) < 0 ) min = k;  

	      // Swap the reference at j with the reference at min 
	      String temp = array[j];
	      array[j] = array[min];
	      array[min] = temp;
	    }
	  
	  }
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the length of the elements:");
		int length = sc.nextInt();
		String[] elements = new String[length];

		System.out.println("Enter the elements:");
		for (int i = 0; i < length; i++) {
			elements[i] = sc.next();
		} 
		selectionSort(elements); 
		System.out.println("Strings in sorted order are : "); 
		for (int i = 0; i < elements.length; i++) 
			System.out.println("String " + (i + 1) + " is " + elements[i]); 
		
		sc.close();
	}

}
