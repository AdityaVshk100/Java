package Lecture_4;

import java.util.Scanner;

public class Pattern_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int rows=1;
		int nst=1;
		int nsp=no-1;
		while(rows<=no) {
			int csp=1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}
			
			int cst=1;
			while(cst<=nst) {
				System.out.print("*");
				cst++;
			}
			nst++;
			nsp--;
			rows++;
			System.out.println();
		}
 
	}

}
