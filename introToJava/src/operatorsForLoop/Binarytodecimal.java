package operatorsForLoop;

public class Binarytodecimal {

	public static void main(String[] args) {
		
		int n=111001;
		int b=0;
		int sum=0;
		while(n!=0) {
			int num=n%10;
			sum+=num*Math.pow(2, b);
			b++;
			n/=10;
		}
		System.out.println(sum);

	}

}
