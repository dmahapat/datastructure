package pkg1.arrays;
//This is kadane's algorithm
public class MaximumSubArraySumExample7 {
public static void main(String[] args) {
	int[] arr = {2,3,-8,7,-1,2,3};
	int[] arr1= {-3,8,-2,4,-5,6};
	System.out.println("Max subarray sum is(O(n*n)): "+maxSubArraySum(arr));
	System.out.println("Max subarray sum is(O(n)): "+maxSubArrSumBestApproach(arr1));
}
//This is naive approach O(n*n)
public static int maxSubArraySum(int[] arr) {
	int result =arr[0];
	for (int i = 0; i < arr.length; i++) {
		int curr=0;
		for (int j = i; j < arr.length; j++) {
			curr+=arr[j];
			result = Math.max(result, curr);
		}
	}
	return result;
}
public static int maxSubArrSumBestApproach(int[] arr) {
	int result = arr[0],maxEnding = arr[0];
	for (int i = 0; i < arr.length; i++) {
		maxEnding = Math.max(maxEnding + arr[i], arr[i]);
		result = Math.max(result, maxEnding);
	}	
	return result;
}

}

