package arrays2;

public class CodeBubbleSort {
	
	public static void bubbleSort(int[] arr) {

		for(int i=0; i<arr.length; i++) {
			for(int j=i; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
	}

	public static void main(String[] args) {
		int[] arr = {11,31,17,29,111,12,4};
		bubbleSort(arr);
		
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}

	

}
