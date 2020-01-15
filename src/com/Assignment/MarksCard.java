package com.Assignment;

import java.util.Scanner;

public class MarksCard {

	public MarksCard(int MAX) {
		
		int total[] = new int[MAX];
		float average[] = new float[MAX];
		int sub[][] = new int[MAX][3];
		String name[] = new String[MAX];
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i < MAX; i++) {
			System.out.println("Enter the name of the student #"+(i+1)+":\n");
			name[i] = in.next();
		}

		for(int i = 0; i < MAX; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println("Enter the marks of the subject "+(j+1)+" of student "+name[i]+":\n");
				sub[i][j] = in.nextInt();
			}
		}

		for(int i = 0; i < MAX; i++) {
			for(int j = 0; j < 3; j++)
				total[i] = total[i] + sub[i][j];
		}

		for(int i = 0; i < MAX; i++) 			
			average[i] = total[i] / 3;


		for(int i = 0; i < MAX; i++) {
			System.out.println("Name: "+name[i]);
			for(int j = 0; j < 3; j++) {
				System.out.println("Subject "+(i+1)+": "+sub[i][j]);
			}
			System.out.println("Total: "+total[i]);
			System.out.printf("Average: %.2f", average[i]);
			System.out.println("");
		}
		
		in.close();

	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the max number of students: ");
		MarksCard mc = new MarksCard(in.nextInt());
		
		in.close();
	}

}
