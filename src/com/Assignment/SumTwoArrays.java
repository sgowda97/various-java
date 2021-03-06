package com.Assignment;

import java.util.Scanner;

public class SumTwoArrays {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int[][] firstMatrix = new int[2][2];
		int[][] secondMatrix = new int[2][2];
		//Array 1&2 input
		System.out.println("Enter array #1 elements:");
		for(int i = 0;i < 2; i++) {
			for(int j = 0; j < 2; j++)
				firstMatrix[i][j] = in.nextInt();
		}
		System.out.println("Enter array #2 elements:");
		for(int i = 0;i < 2; i++) {
			for(int j = 0; j < 2; j++)
				secondMatrix[i][j] = in.nextInt();
		}
		
		
		// Adding Two matrices
		int[][] sum = new int[2][2];
		for(int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
			}
		}
		// Displaying the result
		System.out.println("Sum of two matrices is: ");
		for(int[] row : sum) {
			for (int column : row) {
				System.out.print(column + "    ");
			}
			System.out.println();
		}
		
		in.close();
	}
}
