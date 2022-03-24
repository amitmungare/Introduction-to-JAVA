package operatorsForLoop;

public class DecimaltoBinary {
	
	public static int rev(int n) {
		
		int k=0;
		while(n!=0) {
			k*=10;
			k+=n%10;			
			n/=10;
		}
		return k;
	}

	public static void main(String[] args) {
		
		int n=13;
		int ans=0;
		while(n!=0) {			
			int r = n%2;
			n/=2;
			ans=ans*10+r;
		}
		ans = rev(ans);
		System.out.println(ans);

	}

}
