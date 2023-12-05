package com;

public class FourthElement {
	public void sortArr(int arr[]) {
		int size=arr.length;
		for(int i=0;i<size;i++) {
			int temp=i;
			for(int j=i+1;j<size;j++) {
				if(arr[temp]>arr[j]) {
					temp=j;
				}
			}
			if(temp!=i) {
				int t=arr[i];
				arr[i]=arr[temp];
				arr[temp]=t;
			}
		}
	}
	public int findKSamllest(int arr[],int k) {
		sortArr(arr);
		return arr[k-1];
	}

	public static void main(String[] args) {
		FourthElement obj=new FourthElement();
		int arr[]= {25,36,15,9,87,29};
		int size=arr.length;
		int k=4;
		
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]+ " ");
		}
		int element=obj.findKSamllest(arr,k);
		System.out.println("The "+ k + "smallest element id: "+ element);
		
		
		    }
		}

