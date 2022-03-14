package gettingStartedWithJava;

import java.util.Scanner;

public class AverageMarks {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		char c = sc.next().charAt(0);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		
		System.out.println(c);
		System.out.println((x+y+z)/3);

	}

}
