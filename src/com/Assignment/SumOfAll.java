package com.Assignment;

import java.util.Scanner;

public class SumOfAll {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int[][] array = new int[4][4];
		int sum = 0;

		System.out.println("Enter array elements:");
		for(int i = 0;i < 4; i++) {
			for(int j = 0; j < 4; j++)
				array[i][j] = in.nextInt();
		}
		
		for(int i = 0;i < 4; i++) {
			for(int j = 0; j < 4; j++)
				sum = sum + array[i][j];
		}
		
		System.out.println("Sum of all given elements is: "+sum);
		in.close();
	}
}
