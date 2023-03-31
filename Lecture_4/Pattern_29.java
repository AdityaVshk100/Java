package Lecture_4;

import java.util.Scanner;

public class Pattern_29 {
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
				if(cst==1 || cst==nst) {
					System.out.print(rows);
				}else {
					System.out.print(0);
				}
				
				
				cst++;
			}
			
			rows++;
			nst+=2;
			nsp--;
			System.out.println();
		}
 
	}

}
