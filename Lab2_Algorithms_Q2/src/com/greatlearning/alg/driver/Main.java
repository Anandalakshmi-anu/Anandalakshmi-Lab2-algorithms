package com.greatlearning.alg.driver;

import java.util.Scanner;

import com.greatlearning.alg.Count;
import com.greatlearning.alg.Mergesort;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		int arraySize = scanner.nextInt();
		int[] array = new int[arraySize];
		System.out.println("Enter the currency denominations value");
		for(int i=0;i<arraySize;i++) {
			array[i]=scanner.nextInt();
		}
		System.out.println("Enter the amount you want to pay");
		int amount = scanner.nextInt();
		Mergesort mergesort = new Mergesort();
		mergesort.sort(array, 0, arraySize-1);
		
		Count count=new Count();
		count.countDenominations(array, amount);
		
		scanner.close();
	}

}
