package arrays2;

public class PushZerostoend {
	
	public static int[] pushZerostoend(int[] arr) {
		
		int i=0;
		int j=0;
		
		while(i<arr.length) {
			if(arr[i]>0) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}
				i++;
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = {2,0,0,3,4,0,8,0};
		pushZerostoend(arr);
		
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}

}
