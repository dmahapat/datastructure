package pkg1.arrays;

import java.util.Arrays;

/**
 * Input array: {10,5,7,30}
 * Output array: {30,7,5,10}
 * Time Complexity : Theta(n)
 * Space complexity : Theta(1)
 * @author DebasishM2
 *
 */
public class ReverseAnArray3 {
	
	public static void main(String[] args) {
		int arr[] = {10,5,7,30};
		System.out.println("Before reversing array: "+Arrays.toString(arr));
		reverse(arr, arr.length);
		System.out.println("After reversing array: "+Arrays.toString(arr));
	}
	
	static void reverse(int arr[],int size) {
		int low = 0;
		int high = size-1;
		while(low<high) {
			int temp = arr[high];
			arr[high] = arr[low];
			arr[low] = temp;
			low++;
			high--;
		}
	}

}
