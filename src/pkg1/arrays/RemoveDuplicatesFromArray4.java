package pkg1.arrays;

import java.util.Arrays;

/**
 * 1. Move all distinct elements to first positions
 * 
 * @author DebasishM2
 *
 */
public class RemoveDuplicatesFromArray4 {

	public static void main(String[] args) {
		int[] arr = {1,2,2,3,3,3,4,5,5,5};
		System.out.println("Before duplicate removal: " + Arrays.toString(arr));
		//int removeDuplicatesFromSortedArray = removeDuplicatesFromSortedArray(arr, arr.length);
		int removeDuplicatesFromSortedArray = removeDuplicatesFromSortedArray1(arr, arr.length);
		System.out.println("After duplicate removal: ");
		for (int i = 0; i < removeDuplicatesFromSortedArray; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	//method - 1 extra space is needed
	/*Time Complexity : O(n)
	Auxiliary Space : O(n)*/
	
	public static int removeDuplicatesFromSortedArray1(int[] arr,int size) {
		if(size==0||size==1) return size;
		int [] temp = new int[size];
		int j = 0;
		for (int i = 0; i < size-1; i++) 
			if(arr[i]!=arr[i+1]) 
				temp[j++] = arr[i];
		temp[j++] = arr[size-1];
		for (int i = 0; i < temp.length; i++) {
			arr[i] = temp[i];
		}
		return j;
	}
	
	//method - 2 using no extra space
	/*Time Complexity : O(n)
	Auxiliary Space : O(1)*/
	public static int removeDuplicatesFromSortedArray(int[] arr,int size) {
		if(size==0||size==1) return size;
		int j = 0;
		for(int i=0;i<size-1;i++) {
			if(arr[i]!=arr[i+1]) 
				arr[j++] = arr[i];
		}
		arr[j++] = arr[size-1];
		return j;
	}
}
