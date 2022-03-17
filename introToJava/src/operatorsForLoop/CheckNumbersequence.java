package operatorsForLoop;

import java.util.Scanner;

public class CheckNumbersequence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int p=sc.nextInt();
		
		boolean check =true;
		int count=0;
		
		for(int i=1; i<n; i++) {
			int c = sc.nextInt();
			
			if(p==c) {
				System.out.println(false);
				return;
			}else if(p<c) {
				if(check) {
					count++;
					check=false;
				}
			}else {
				if(!check) {
					System.out.println(false);
					return;
				}
			}
			p=c;
		}
		if(count==1 && check==false || count==0 && check==true || count==0 && check==false) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}

	}

}
