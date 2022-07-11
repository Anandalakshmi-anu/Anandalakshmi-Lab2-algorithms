package com.greatlearning.alg.driver;

import java.util.Scanner;
import com.greatlearning.alg.Transaction;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of transaction array");
		int transArrSize = sc.nextInt();
		int transArr[] = new int[transArrSize];
		
		System.out.println("Enter the values of array");
		for(int i=0;i<transArrSize;i++) {
			transArr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the total no of targets that needs to be achieved");
		int targetNo = sc.nextInt();
		
		int targetValue;
		for(int j=0;j<targetNo;j++) {
			System.out.println("Enter the value of target");
			targetValue = sc.nextInt();
			Transaction transaction = new Transaction();
			int transNo = transaction.isTargetAchieved(transArr,targetValue); 
			if(transNo==(-1)) {
				System.out.println("Given target is not achieved");
			}
			else {
				System.out.println("Target achieved after "+(transNo)+" transactions");
			}
		}
		
		sc.close();
	}

}
