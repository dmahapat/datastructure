package pkg1.arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromUnsortedArray5 {
	
	public static void main(String[] args) {
		int[] arr = {2,3,3,4,4};
		System.out.println("Before removing duplicate: "+Arrays.toString(arr));
		//int removeDuplicateFromUnsortedArray = removeDuplicateFromUnsortedArray(arr, arr.length);
		//System.out.println("After removing duplicate: "+Arrays.toString(arr));
		printRepeating(arr, arr.length);
		/*for (int i = 0; i < removeDuplicateFromUnsortedArray; i++) {
			System.out.print(arr[i]+ " " );
		}*/
	}
	
	//O(nlogn)
	public static int removeDuplicateFromUnsortedArray(int[] arr,int size){
		if(size==0||size==1) return size;
		Arrays.sort(arr);//This uses QUICK SORT technique
		int j=0;
		for (int i = 0; i < size-1; i++) 
			if(arr[i]!=arr[i+1]) 
				arr[j++] = arr[i];
		arr[j++] = arr[size-1];
		return j;
	}
	
	
	
	//Have doubt
	//The element value in this array cannot be greater or equal to arr.length
	public static void printRepeating(int arr[], int size) {
		  int i;
		  System.out.println("The repeating elements are : ");

		  for (i = 0; i < size; i++) {
		   if (arr[Math.abs(arr[i])] >= 0) {
			   arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
		   }
		   else
		    System.out.print(Math.abs(arr[i]) + " ");
		  }
		 }
}
