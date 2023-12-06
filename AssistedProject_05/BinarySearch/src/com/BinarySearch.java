package com;
class Searching {	
	public static void BubbleSort(int[] arr ,int size) {
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
	public static void binarySearch(int num[], int start,int end, int search) {
		int mid = (start+end)/2;
		while(start<=end) {
			if(num[mid]<search) {
				start = mid+1;
			}else if(num[mid]==search) {
				System.out.println("Element is found "+mid);
				break;
			}else {
				end = mid-1;
			}
			mid = (start +end )/2;
		}
		if(start > end) {
			System.out.println("Element is not found");
		}
	}
}

public class BinarySearch {
	

	public static void main(String[] args) {
		int num[]= {4,1,7,8,6,5,9};
		int search = 8;
		Searching.BubbleSort(num, num.length-1);
		for(int n:num) {
			System.out.print(n+" ");
		}
		System.out.println();
		Searching.binarySearch(num, 0, num.length-1, search);

	}

}
