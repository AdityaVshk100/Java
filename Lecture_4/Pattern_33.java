package Lecture_4;

import java.util.Scanner;

public class Pattern_33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int rows=1;
		int nst=1;
		int nsp=no-1;
		int val=no;
		while(rows<=no) {
			int csp=1;
			while(csp<=nsp) {
				System.out.print("  ");
				csp++;
			}
			
			
			int cval=val;
			int cst=1;
			while(cst<=nst) {
				    if(cval==10) {
				    	System.out.print(0+" ");
				    }else {
				    	System.out.print(cval+" ");
				    }
					
					
					
                    if(cst<rows) {
				    	cval++;
				    }else {
				    	cval--;
				    }
				
				cst++;
			}
			
			rows++;
			nst+=2;
			nsp--;
			val--;
			System.out.println();
		}
 
	}
		
}

