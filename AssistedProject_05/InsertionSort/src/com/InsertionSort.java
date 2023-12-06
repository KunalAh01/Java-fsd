package com;

public class InsertionSort {

	public static void insertionSortAsc(int num[], int size) {
		for(int i=1;i<size;i++) {
			int key = num[i];
			int j=i-1;
			while(j>=0 && key < num[j]) {
				num[j+1]=num[j];
				j--;
			}
			num[j+1]=key;
		}
	}
	public static void insertionSortDesc(int num[], int size) {
		for(int i=1;i<size;i++) {
			int key = num[i];
			int j=i-1;
			while(j>=0 && key > num[j]) {
				num[j+1]=num[j];
				j--;
			}
			num[j+1]=key;
		}
	}

	public static void main(String[] args) {
		int num[]= {5,1,3,8,6,2,4,9,7,10};
		System.out.println("Before sort");
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		InsertionSort.insertionSortAsc(num, num.length);
		System.out.println();
		System.out.println("After sort Asc");
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}

		InsertionSort.insertionSortDesc(num, num.length);
		System.out.println();
		System.out.println("After sort Desc");
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
	}

}
