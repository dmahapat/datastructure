package pkg1.arrays;

public class MaxLengthEvenOddSubArr8 {
	
	public static void main(String[] args) {
		int[] arr = {5,10,20,6,3,8};
		System.out.println("Max even odd subarray length:- O(n*n) "+maxLengthEvenOddSubArr(arr)) ;
		System.out.println("Max even odd subarray length - O(n): "+maxLengthEvenOddSubArrKadane(arr)) ;
	}
	//Time Complexity O(n*n)
	public static int maxLengthEvenOddSubArr(int[] arr) {
		int result = 1;
		for (int i = 0; i < arr.length; i++) {
			int current = 1;
			for (int j = i+1; j < arr.length; j++) {
				if((arr[j]%2==0 && arr[j-1]%2 !=0)||(arr[j]%2!=0 && arr[j-1]%2 ==0)) current++;
				else break;
			}
			result = Math.max(result, current);
		}
		return result;
	}
	//This is solved based on kadané algorithm
	//Time complexity O(n)
	public static int maxLengthEvenOddSubArrKadane(int[] arr) {
		int result=1,current=1;
		for (int i = 1; i < arr.length; i++) {
			if(!((arr[i]%2==0 && arr[i-1]%2!=0)||(arr[i]%2!=0 && arr[i-1]%2==0))) current = 1;
			else {
				current+=1;
				result=Math.max(current, result);
			}
		}
		
		return result;
	}

}
