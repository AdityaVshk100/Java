package Lecture_4;

import java.util.Scanner;

public class Pattern_15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int rows=1;
		int nst=no;
		int nsp=0;
		while(rows<=2*no-1) {
			int csp=1;
			while(csp<=nsp) {
				System.out.print("  ");
				csp++;
			}
			int cst=1;
			while(cst<=nst) {
				System.out.print("* ");
				cst++;
			}
			
			if(rows<no) {
				nst--;
				nsp+=2;
			}else {
				nst++;
				nsp-=2;
			}
			rows++;
			System.out.println();
			
		}
		
		
	}

}
