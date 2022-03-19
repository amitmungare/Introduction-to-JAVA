package arrays;

public class FindUnique {
	
	public static int findUnique(int[] arr){		
		int num=0;
		for(int i: arr)num^=i;
        return num;
    }

	public static void main(String[] args) {
		int[] arr= {1, 2, 3, 4, 5 ,6 ,5,4,2,1,6};		
		System.out.println(findUnique(arr));
	}

}
