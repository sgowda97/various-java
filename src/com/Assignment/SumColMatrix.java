package com.Assignment;

//Java program to find the sum 
//of each column of a matrix 
import java.util.Scanner; 

class SumColMatrix { 

	//Function to calculate sum of each column 
	static void column_sum(int arr[][]) 
	{ 

		int i,j,sum = 0; 

		System.out.print( "\nFinding Sum of each column\n\n"); 

		// finding the column sum 
		for (i = 0; i < 2; ++i) { 
			for (j = 0; j < 2; ++j) { 

				// Add the element 
				sum = sum + arr[j][i]; 
			} 

			// Print the column sum 
			System.out.println( 
					"Sum of the column "
							+ (i+1) + " = " + sum); 

			// Reset the sum 
			sum = 0; 
		} 
	} 

	//Driver code 
	public static void main (String[] args) { 

		Scanner in = new Scanner(System.in);
		int[][] array = new int[2][2];

		System.out.println("Enter array elements:");
		for(int i = 0;i < 2; i++) {
			for(int j = 0; j < 2; j++)
				array[i][j] = in.nextInt();
		}

		// Get each column sum 
		column_sum(array); 
		
		in.close();
	} 
} 
