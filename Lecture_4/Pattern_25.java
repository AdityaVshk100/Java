package Lecture_4;

import java.util.Scanner;

public class Pattern_25 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int rows=1;
		int nst=1;
		int nsp=no-1;
		int val=1;
		while(rows<=no) {
			int csp=1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}
			int cval=val;
			int cst=1;
			while(cst<=nst) {
				
					System.out.print(cval);
				
				
				cst++;
				cval++;
			}
			
			rows++;
			nst+=2;
			nsp--;
			val=cval;
			System.out.println();
		}
 
	}
}
