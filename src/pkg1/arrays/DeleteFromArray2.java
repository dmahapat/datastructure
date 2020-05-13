package pkg1.arrays;

import java.util.Arrays;
/**
 * Overview of all operations
 * Insert : O(n) -Beginning insertion costliest,end insertion O(1)
 * Search : O(n) - Unsorted array - Linear search
 *          O(logn) - sorted array - binary search
 * Delete : O(n)
 * Get ith element : O(1)
 * Updating ith element : O(1)
 * Insert at end and delete from end also done in O(1) time         
 * 
 * 
 * 
 * @author DebasishM2
 *
 */
public class DeleteFromArray2 {
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		System.out.println("Size before deletion: "+arr.length);
		System.out.println("Before deleting value 2: "+Arrays.toString(arr));
		System.out.println("Size after deletion: "+deleteElement(arr, arr.length, 2));
		System.out.println("After deleting value 2: "+Arrays.toString(arr));
	}
	
	static int deleteElement(int arr[],int size,int element) {
		int i;
		for (i = 0; i < size; i++) {
			if(arr[i] == element)
				break;
		}
		if(i==size)
			return size;
		for (int j = i; j < size-1; j++) {
			arr[j] = arr[j+1];
		}
		return size-1;
	}

}
