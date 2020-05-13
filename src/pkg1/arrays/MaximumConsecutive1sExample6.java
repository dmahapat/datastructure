package pkg1.arrays;

public class MaximumConsecutive1sExample6 {
	public static void main(String[] args) {
		int[] arr = {0,1,1,1,1,1,1};
		System.out.println("Maximum number of consecutive 1s: "+maximumConsecutive1s(arr));
		System.out.println("Maximum number of consecutive 1s - best approach: "+maximumConsecutive1sBestApproach(arr));
	}
	//This is naive approach(O(n*n) - time complexity)
	//This is naive approach(O(1) - Auxiliary space)
	public static int maximumConsecutive1s(int[] arr) {
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			int curr = 0;
			for (int j = i; j < arr.length; j++) {
				if(arr[j] == 1) curr++;
				else break;
			}
			result = Math.max(curr, result);
		}
		return result;
	}
	
	//This is best approach(O(n) - time complexity)
	//This is best approach(O(1) - auxiliary space)
	public static int maximumConsecutive1sBestApproach(int[] arr) {
		int result = 0,curr=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) curr = 0;
			else {
				curr++;
				result = Math.max(result, curr);
			}
		}
		return result;
	}
}
