package patterns1;

import java.util.Scanner;

public class InterestingAlphabets {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		int n = 5;
		char a='A';
        
        for(int i=n; i>=1; i--){
            for(int j=i; j<=n; j++){
                System.out.print((char)(a+j-1));
            }
            System.out.println();
        }

	}

}
