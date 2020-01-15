package com.Assignment;

import java.util.Scanner;
class StateCapital
{
	public static void main(String args[])  {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter max number of records:");
		int MAX = in.nextInt();
		String state[] = new String[MAX];;
		String capital[] = new String[MAX];
	
		for(int i = 0; i < MAX; i++)
		{
			System.out.println("Enter the name of state #"+(i+1)+":");
			state[i]=in.next();
			System.out.println("Enter its capital: ");
			capital[i]=in.next();
		}
		
		System.out.println("Enter the name of the state whose capital is to be searched: ");
		String name = in.next();
		
		for(int i = 0; i < MAX; i++)
		{
			if(name.equalsIgnoreCase(state[i]))
				System.out.println("Capital is: "+capital[i]);
		}
		
		in.close();
	}
}