package pkg1.arrays;

public class MaxCircularSubarraySum9 {
	
	public static void main(String[] args) {
		int[] arr = {5,-2,3,4};
		System.out.println("Max circular subarray sum: "+maxCircularSubArrSum(arr));
		System.out.println("Max circular subarray sum: "+maxCircularSubArrSumKadane(arr));
		
	}
	
	public static int maxCircularSubArrSum(int[] arr) {
		int result = arr[0];
		for (int i = 0; i < arr.length; i++) {
			int cur_sum=arr[i],curr_max=arr[i];
			for (int j = 1; j < arr.length; j++) {
				int index = (i+j)%arr.length;
				cur_sum += arr[index];
				curr_max = Math.max(cur_sum, curr_max);
			}
			result = Math.max(result, curr_max);
		}
		return result;
	}
	
	public static int maxCircularSubArrSumKadane(int[] arr) {
		int result = arr[0];
		int currMax = arr[0];
		for (int i = 0; i < arr.length; i++) {
			int index = (i + (i+1))%arr.length;
			currMax = Math.max(currMax + arr[index], arr[index]);
			result = Math.max(currMax, result);
		}
		return result;
	}

}
