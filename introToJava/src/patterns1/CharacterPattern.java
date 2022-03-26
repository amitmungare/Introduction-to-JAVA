package patterns1;

import java.util.Scanner;

public class CharacterPattern {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		int n = 4;
		char a='A';
		
		for(int i=0; i<n; i++) {
			char r = a;			
			for(int j=0; j<=i; j++) {
				System.out.print(r);
				r++;
			}
			a++;
			System.out.println();
			
		}
		
	}

}
