package arrays;

import java.util.Arrays;

public class FindDuplicate {

	public static void duplicateNumber(int[] arr) {
		
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length-1; i++){
			if(arr[i]==arr[i+1]) {
				System.out.println(arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr= {1, 2, 3, 4, 5, 1 ,6 };		
		duplicateNumber(arr);

	}

}
