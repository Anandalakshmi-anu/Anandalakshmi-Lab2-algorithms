package com.greatlearning.alg;

public class Mergesort {
	public void sort(int array[], int lowerBound, int upperBound) {
		if(lowerBound<upperBound) {
			int middle = (lowerBound+upperBound)/2;
			sort(array, lowerBound, middle);
			sort(array, middle+1, upperBound);
			merge(array,lowerBound,middle,upperBound);
		}
	}
	
	public void merge(int array[], int left, int middle, int right) {
		int leftArraySize = middle-left+1;
		int rightArraySize = right-middle;
		int leftArray[] = new int[leftArraySize];
		int rightArray[] = new int[rightArraySize];
		
		for(int i=0;i<leftArraySize;i++) {
			leftArray[i] = array[left+i];
		}
		
		for(int j=0;j<rightArraySize;j++) {
			rightArray[j] = array[middle+1+j];
		}
		
		int i=0, j=0, k=left;
		while((i<leftArraySize)&&(j<rightArraySize)) {
			if(leftArray[i]>=rightArray[j]) {
				array[k]=leftArray[i++];
			}
			else {
				array[k]=rightArray[j++];
			}
			k++;
		}
		
		while(i<leftArraySize) {
			array[k++]=leftArray[i++];
		}
		
		while(j<rightArraySize) {
			array[k++]=rightArray[j++];
		}
	}

}
