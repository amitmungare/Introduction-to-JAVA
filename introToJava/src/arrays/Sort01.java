package arrays;

public class Sort01 {
	
	public static void sortZeroesAndOne(int[] arr) {
        
		int i=0;
		int j=arr.length-1;
		
		while(i<=j) {

			if(arr[i]==1) {
				arr[i]=arr[j];
				arr[j]=1;
				j--;
			}
			if(arr[i]==0) {
				i++;	
			}
		}
		
		for(int k: arr) {
			System.out.print(k+" ");
		}
    }

	public static void main(String[] args) {

		int arr[] = {1, 0, 1, 1, 0, 1, 0, 0};
		sortZeroesAndOne(arr);

	}

}
