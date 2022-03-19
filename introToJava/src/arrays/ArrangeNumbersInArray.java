package arrays;

public class ArrangeNumbersInArray {
	
	public static void arrange(int n) {
		int arr[] = new int[n];
		
		int i=0;
		int j=arr.length-1;
		int a=1;
		
		while(i<=j) {
			if(a%2 != 0) {
				arr[i]=a;
				i++;
			}else {
				arr[j]=a;
				j--;
			}
			a++;
		}
		for(int z: arr) {
			System.out.print(z+" ");
		}
	}

	public static void main(String[] args) {

		int n=7;
//		op 1 3 5 6 4 2
		arrange(n);

	}

}
