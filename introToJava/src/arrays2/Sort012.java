package arrays2;

public class Sort012 {
	
	public static void sort012(int[] arr){
		
		int i=0;
		int j=0;
		int k=arr.length-1;
		
		while(i<=k) {
			if(arr[i]==0) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j++;
			}else if(arr[i]==1) {
				i++;
			}else {
				if(i>k)continue;
				int temp = arr[i];
				arr[i]=arr[k];
				arr[k]=temp;
				k--;
			}
		}
		
		for(int q: arr) {
			System.out.print(q+" ");
		}
		
	}

	public static void main(String[] args) {
		int arr[] = {0,2,0,1,1,2,0,1};
		sort012(arr);

	}

}
