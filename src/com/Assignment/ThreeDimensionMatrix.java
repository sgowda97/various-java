package com.Assignment;

import java.util.Scanner;

public class ThreeDimensionMatrix {

	public static void main(String[] args) 
	{ 
		Scanner in = new Scanner(System.in);
		int[][] array = new int[3][3];
		
		System.out.println("Enter array elements:");
		for(int i = 0;i < 3; i++) {
			for(int j = 0; j < 3; j++)
				array[i][j] = in.nextInt();
		}
		
		System.out.println("Given elements in 3x3 order:");
		for(int i = 0;i < 3; i++) {
			for(int j = 0; j < 3; j++)
				System.out.print(array[i][j]+" ");
			System.out.println("");
		}
		
		in.close();
		 
	} 
}
