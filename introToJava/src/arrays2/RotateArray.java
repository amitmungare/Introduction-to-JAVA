package arrays2;

public class RotateArray {
	
	 public static void rotate(int[] arr, int d) {
	    	
	      int a[] = new int[d];
	      int i=0;
	      for(; i<d; i++) {
	    	  a[i] = arr[i];
	      }
	  
	      for(; i<arr.length; i++) {
	    	  arr[i-d] = arr[i];
	      }
	      
	      int j=0;
	      for(i=arr.length-d; i<arr.length; i++) {
	    	  arr[i] = a[j];
	    	  j++;
	      }      
	      
	      for(int k: arr) {
	    	  System.out.print(k+" ");
	      }
	        
	 }

	public static void main(String[] args) {	
		int arr[]= {1,2,3,4,5,6,7};
		int d=2;
		rotate(arr,d);
	}

}
