package arrays2;

public class SelectionSort {
	
	public static void selectionSort(int[] arr) {

		for(int i=0; i<arr.length; i++) {
			int n=i;
			for(int j=i; j<arr.length; j++) {
				if(arr[n]>arr[j]) {
					n=j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[n];
			arr[n] = temp;
		}
		
	}

	public static void main(String[] args) {
		int[] arr = {11,31,17,29,111,12,4};
		selectionSort(arr);
		
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}

	

	

}
