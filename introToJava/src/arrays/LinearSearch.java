package arrays;

public class LinearSearch {
	
	public static int linearSearch(int[] arr, int x) {
		
		for(int i=0; i<arr.length; i++){
			if(arr[i]==x)return i;
		}
		
		return -1;	
	}

	public static void main(String[] args) {
		int[] arr= {1, 4, 5, 2, 8, 14, 12};		
		System.out.println(linearSearch(arr, 11));
	}

}
