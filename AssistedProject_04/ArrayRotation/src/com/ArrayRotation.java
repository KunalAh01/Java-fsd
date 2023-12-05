package com;

public class ArrayRotation {

		public static void main(String[] args) {
				
			int[] arr=new int[] {1,2,3,4,5,6};
			int n=5;
			for(int i=0;i<arr.length-1;i++) {
				System.out.println(arr[i]);
				
			}
			
			for (int i=0;i<n;i++) {
				int j,last=arr[arr.length-1];
				
				for(j=arr.length-1;j>0;j--) {
					arr[j]=arr[j-1];
				}
				arr[0]=last;
			}
			
			System.out.println("Rotated array is: ");
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
				
			}
			
			
			
			
				}
			}

 
