package arrays2;

import java.util.Arrays;

public class SecondLargestinarray {
	
	public static int secondLargestElement(int[] arr) {
		
		Arrays.sort(arr);
		return arr[arr.length-2];
//        dose not supports all conditions
    }

	public static void main(String[] args) {
		
		int arr[] = {2, 13, 4,1, 3, 6, 28};
		
		System.out.println(secondLargestElement(arr));
	}

}
