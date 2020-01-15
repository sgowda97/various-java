package com.Assignment;
import java.util.Scanner;

public class OddEven {

	public static void main(String[] args)	{

		int MAX, j = 0, k = 0;
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the max number of elements:");
		MAX = s.nextInt();

		int a[] = new int[MAX];
		int odd[] = new int[MAX];
		int even[] = new int[MAX];

		System.out.println("Enter the array elements:");

		for(int i = 0; i < MAX; i++)
			a[i] = s.nextInt();

		for(int i = 0; i < MAX; i++) {
			if(a[i] % 2 != 0) {
				odd[j] = a[i];
				j++;
			}
			else {
				even[k] = a[i];
				k++;
			}

		}

		System.out.print("Odd numbers: ");
		if(j > 1)  {
			for(int i = 0;i < (j-1); i++)
				System.out.print(odd[i]+", ");
			System.out.print(odd[j-1]);
		}

		else
			System.out.println("No odd numbers");		

		System.out.println("");

		System.out.print("Even: ");
		if(k > 1)  {
			for(int i = 0; i < (k-1); i++)
				System.out.print(even[i]+", ");
			System.out.print(even[k-1]);
		}

		else
			System.out.println("No number");		

	}
}
