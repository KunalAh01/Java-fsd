package com;

public class SelectionSorting {

	public static void SelectionSortAcs(int[] arr ,int size) {
		for(int i=0;i<size-1;i++) {
			int min=i;
			for(int j=i+1;j<size;j++) {
				if(arr[min]>arr[j]) {
					min=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		
	}
	public static void SelectionSortDecs(int[] arr ,int size) {
		for(int i=0;i<size-1;i++) {
			int max=i;
			for(int j=i+1;j<size;j++) {
				if(arr[max]<arr[j]) {
					max=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[max];
			arr[max]=temp;
		}
		
	}
	public static void main(String[] args) {
		int[] arr= {12,6,75,61,1,3,26};
		System.out.println("array before sorting");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		SelectionSorting.SelectionSortAcs(arr,arr.length);
		System.out.println("after sort in ascending order");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		SelectionSorting.SelectionSortDecs(arr,arr.length);
		System.out.println("after sort in descending order");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
