package conditionalsAndLoops;

import java.util.Scanner;

public class TotalSalary {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int basic;
        double hra, da, allow ,pf;

        char grade;

        basic= s.nextInt();
        grade=s.next().charAt(0);

        if (grade == 'A'){ 
            allow = 1700;
        }else if  (grade == 'B'){
            allow = 1500;
		}else {
			allow = 1300;
		}

        hra = basic*0.2;

        da = basic*0.5;

        pf = basic*0.11;

        int totalsalary = (int) Math.round(hra + da+basic+allow-pf);

        System.out.println(totalsalary);

	}

}
