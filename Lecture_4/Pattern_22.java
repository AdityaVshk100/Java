package Lecture_4;

import java.util.Scanner;

public class Pattern_22 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int nst=no;
		int nsp=0;
		int rows=1;
		while(rows<=no) {
			int cst=1;
			while(cst<=nst) {
				System.out.print("*");
				cst++;
			}
			
			int csp=1;
			while(csp<nsp) {
				System.out.print(" ");
				csp++;
			}
			
			cst=1;
			if(rows==1) {
				cst=2;
			}
			while(cst<=nst) {
				System.out.print("*");
				cst++;
			}
			
			nst--;
			nsp+=2;
			rows++;
			System.out.println();
		}
	}
}
