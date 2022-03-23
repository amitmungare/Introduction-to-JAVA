package arrays2;

public class CodeBinarySearch {
	
	public static int binarySearch(int[] arr, int x) {
    	
		 int i=0;
			int j=arr.length-1;
			
			while(i<=j) {
				int mid =(j+i)/2;
				if(arr[mid]==x) {
					return mid;
				}else if(arr[mid]<x) {
					i=mid+1;
				}else{
					j=mid-1;
				}
			}
		    return -1;
    }

	public static void main(String[] args) {
		
		int[] arr = {1,3,7,9,11,12,45};
		int x = 45;
		System.out.println(binarySearch(arr, x));

	}

}
