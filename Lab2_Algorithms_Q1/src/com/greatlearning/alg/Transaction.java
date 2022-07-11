package com.greatlearning.alg;

public class Transaction {
	public int isTargetAchieved(int array[], int targetValue) {
		long sum=0;
		
		for(int i=0;i<array.length;i++){
			sum+=array[i];
			if(sum>=targetValue) {
				return (i+1);
			}
		}
		
		return -1;
	}

}
