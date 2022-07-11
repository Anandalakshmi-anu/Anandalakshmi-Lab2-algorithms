package com.greatlearning.alg;

public class Count {
	public void countDenominations(int array[], int amount) {
		int temp=amount;
		int[] countArray=new int[array.length];
		
		for(int i=0;i<array.length;i++) {
			if(array[i]<=amount) {
				int count = amount/array[i];
				countArray[i]=count;
				amount=amount%array[i];
				if(amount==0) {
					break;
				}
			}
		}
		
		if(amount!=0) {
			System.out.println("Exact payment of amount "+temp+" cannot be made");
		}
		else {
			System.out.println("Your payment approach in order to give min no of notes will be");
			for(int i=0;i<countArray.length;i++) {
				if(countArray[i]!=0) {
					System.out.println(array[i]+":"+countArray[i]);
				}
			}
		}
	}

}
