package com;

public class BubbleSort {


		public static void BubbleSortAcs(int[] arr ,int size) {
			for(int i=0;i<size-1;i++) {
				for(int j=0;j<size-1;j++) {
					if(arr[j]>arr[j+1]) {
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
				
			}
			
		}
		public static void BubbleSortDecs(int[] arr ,int size) {
			for(int i=0;i<size-1;i++) {
				for(int j=0;j<size-1;j++) {
					if(arr[j]<arr[j+1]) {
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
				
			}
			
		}
	public static void main(String[] args) {
		int[] arr= {12,6,75,61,1,3,26};
		System.out.println("array before sorting");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		BubbleSort.BubbleSortAcs(arr, arr.length);
		System.out.println("after sort in ascending order");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		BubbleSort.BubbleSortDecs(arr, arr.length);
		System.out.println("after sort in Descending order");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
