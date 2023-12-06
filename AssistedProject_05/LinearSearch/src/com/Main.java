package com;

class search{
	public static int linearSearch(int[] arr,int search) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==search) {
				return i;
			}
		}
		return -1;
	}
}
public class Main {

	public static void main(String[] args) {
		int[]arr= {2,5,1,8,6};
		int searh=8;
		int index1=search.linearSearch(arr, searh);
		if(index1<0) {
			System.out.println("Element not found");
		}
		else {
			System.out.println("Element found at index no: "+index1);
		}

	}

}
