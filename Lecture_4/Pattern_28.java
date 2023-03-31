package Lecture_4;

import java.util.Scanner;

public class Pattern_28 {

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
				
				if(cst+1<rows+1) {
					cval++;
				}else {
					cval--;
				}
				cst++;
				
			}
			
			rows++;
			nst+=2;
			nsp--;
			val++;
			System.out.println();
		}
 
	}

}
