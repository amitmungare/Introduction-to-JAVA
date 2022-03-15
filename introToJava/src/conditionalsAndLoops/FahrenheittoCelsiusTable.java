package conditionalsAndLoops;

import java.util.Scanner;

public class FahrenheittoCelsiusTable {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		int w = sc.nextInt();
		
		for(int i=s; i<=e; i=i+w) {
			System.out.println(i+"F --> "+((i-32)*5)/9+"c");
		}

	}

}