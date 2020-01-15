package com.Assignment;

import java.util.Scanner;

public class SumDiagMatrix {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int[][] array = new int[3][3];
		int sum = 0;

		System.out.println("Enter array elements:");
		for(int i = 0;i < 3; i++) {
			for(int j = 0; j < 3; j++)
				array[i][j] = in.nextInt();
		}

		for(int i = 0; i < 3; i++)
		{ 
			for(int j = 0; j < 3; j++)
			{ 
				if((i + j) == (3 - 1)) //this condition checks for diagonal
				{
					sum = sum + array[i][j];
				}
			}
		}
		
		System.out.println("The sum of diagonal elements of the matrix is: "+sum);
		in.close();
	}
}
