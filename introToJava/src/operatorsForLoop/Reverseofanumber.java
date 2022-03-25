package operatorsForLoop;

public class Reverseofanumber {

	public static void main(String[] args) {
		
		int n=1234;
		int k=0;
		while(n!=0) {
			k*=10;
			k+=n%10;			
			n/=10;
		}
		System.out.println(k);

	}

}
