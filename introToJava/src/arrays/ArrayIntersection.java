package arrays;

public class ArrayIntersection {
	
	public static void intersections(int arr1[], int arr2[]) {
    	
      for(int i=0; i<arr1.length; i++) {
    	  for(int j=0; j<arr2.length; j++) {
    		  if(arr1[i]==arr2[j]) {
    			  System.out.print(arr1[i]+" ");
    			  arr2[j]=-1;
    		  }
    	  }
      }
        
        
    }

	public static void main(String[] args) {

		int[] arr1= {1, 2, 3, 4, 5, 1 ,6 };
		int[] arr2= {1, 2, 4, 5,9 ,6 };	
		intersections(arr1, arr2);

	}

}
