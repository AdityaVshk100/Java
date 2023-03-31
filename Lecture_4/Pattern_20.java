package Lecture_4;

import java.util.Scanner;

public class Pattern_20 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int nsp1=no/2;
		int nst=1;
		int nsp2=0;
		int rows=1;
		
		while(rows<=no) {
			
			int csp=1;
			while(csp<=nsp1) {
				System.out.print("  ");
				csp++;
			}
			
			int cst=1;
			while(cst<=nst) {
				System.out.print("* ");
				cst++;
			}
			
			csp=1;
			if(rows==1) {
				csp=2;
			}
			while(csp<nsp2) {
				System.out.print("  ");
				csp++;
			}
			
			cst=1;
			if(rows==1 || rows==no) {
				cst=2;
			}
			while(cst<=nst) {
				System.out.print("* ");
				cst++;
			}
			
			
			
			if(rows<no/2+1) {
				nsp1--;
				nsp2+=2;
				
			}else {
				nsp1++;
				nsp2-=2;
			}
			rows++;
			System.out.println();
		}
		

	}
	

}
