package arrays2;

public class CodeMergeTwoSortedArrays {
	
	public static int[] merge(int arr1[], int arr2[]) {
		
		int arr[] = new int[arr1.length+arr2.length];
		
		int i=0; 
		int j=0;
		int k=0;
		
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				arr[k] = arr1[i];
				i++;
			}else {
				arr[k] = arr2[j];
				j++;
			}
			k++;
		}
		
		while(i<arr1.length ) {	
			arr[k] = arr1[i];
			i++;
			k++;
		}
		
		while(j<arr2.length ) {	
			arr[k] = arr2[j];
			j++;
			k++;
		}          
        
        return arr;
    }

	public static void main(String[] args) {
		int arr1[] = {1,4,7,8};
		int arr2[] = {2,3,5,6,7,9};
		
		int arr[] = merge(arr1, arr2);

		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}
