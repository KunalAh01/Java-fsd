package com;

public class MergeSort {
	public static void merge(int num[], int start, int mid, int end) {
		int leftSize = mid-start +1;
		int rightSize = end - mid;
		int leftArray[]=new int[leftSize];
		int rightArray[]= new int[rightSize];
		
		for(int i=0;i<leftSize;i++) {
			leftArray[i]=num[start+i];
		}
		
		for(int j=0;j<rightSize;j++) {
			rightArray[j]=num[mid+1+j];
		}
		int i=0,j=0,k=start;
		
		while(i<leftSize && j < rightSize) {
			if(leftArray[i]<=rightArray[j]) {
				num[k]=leftArray[i];
				i++;
			}else {
				num[k]=rightArray[j];
				j++;
			}
			k++;
		}
		
		while(i<leftSize) {
			num[k]=leftArray[i];
			i++;
			k++;
		}
		
		while(j<rightSize) {
			num[k]=rightArray[j];
			j++;
			k++;
		}
	}
	public static void mergeSort(int num[],int start, int end) {
		if(start < end) {
			int mid = (start+end)/2;
			mergeSort(num, start, mid);
			mergeSort(num, mid+1, end);
			merge(num,start,mid,end);
		}
	}



	public static void main(String[] args) {
		int num[]= {5,1,3,8,6,2,4,9,7,10};
		System.out.println("Before sort");
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		MergeSort.mergeSort(num, 0, num.length-1);
		System.out.println();
		System.out.println("After sort ");
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}

	}

}
