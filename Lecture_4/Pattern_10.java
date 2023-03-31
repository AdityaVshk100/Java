package Lecture_4;

import java.util.Scanner;

public class Pattern_10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int rows=1;
		int nst=2*no-1;
		int nsp=0;
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
			
			rows++;
			nst-=2;
			nsp++;
			System.out.println();
		}
 
	}

}
