package com.Assignment;

import java.util.Scanner;

public class CheckUnitMatrix {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int[][] array = new int[3][3];
		boolean flag = true;

		System.out.println("Enter array elements:");
		for(int i = 0;i < 3; i++) {
			for(int j = 0; j < 3; j++)
				array[i][j] = in.nextInt();
		}

		for(int i = 0; i < 3; i++){    
			for(int j = 0; j < 3; j++){    
				if(i == j && array[i][j] != 1){    
					flag = false;    
					break;    
				}    
				if(i != j && array[i][j] != 0){    
					flag = false;    
					break;    
				}    
			}   
		}
		
		if(flag)
			System.out.println("Given matrix is an identity matrix");
		else
			System.out.println("Not identity matrix");
		
		in.close();
	}
}
