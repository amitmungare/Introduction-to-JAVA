package arrays;

public class SwapAlternate {
	
	public static void swapAlternate(int[] arr) {
		
		for(int i=0; i<arr.length-1; i+=2) {
			int temp = arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

	public static void main(String[] args) {
		int[] arr= {1, 2, 3, 4, 5 ,6 };		
		swapAlternate(arr);

	}

	

}
