package arrays2;

public class SumofTwoArrays {
	
	 public static void sumOfTwoArrays(int arr1[], int arr2[], int op[]) {
	    	
	        int i=arr1.length-1;
	        int j=arr2.length-1;
	        int c=0;
	        int k = Math.max(arr1.length,arr2.length);
	           
	        while(i>=0 && j>=0){
	            int sum=arr1[i]+arr2[j]+c;
	            op[k] = sum%10;
	            c=sum/10;
	            i-=1;
	            j-=1;
	            k-=1;
	        }
	        
	        while(i>=0){
	            int sum=arr1[i]+c;
	            op[k] = sum%10;
	            c=sum/10;
	            i-=1;
	            k-=1;
	        }
	        
	        while(j>=0){
	            int sum=arr2[j]+c;
	            op[k] = sum%10;
	            c=sum/10;
	            j-=1;
	            k-=1;
	        }
	        op[0]=c;
	        
	        for(int x:op) {
	        	System.out.print(x+" ");
	        }
	        
	        
	    }

	public static void main(String[] args) {

		int arr1[] = {1,2,3,4};
		int arr2[] = {2,3,4,9};
		sumOfTwoArrays(arr1,arr2, new int[arr1.length+1]);
		
	}

}
