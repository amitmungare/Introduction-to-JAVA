package conditionalsAndLoops;

import java.util.Scanner;

public class Findpowerofanumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int m= sc.nextInt();
		int p=1;
		
		for(int i=0; i<m; i++) {
			p*=n;
		}
		System.out.println(p);
	}

}
