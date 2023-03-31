package Lecture_4;

import java.util.Scanner;

public class Pattern_7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int rows=1;
		int nst=no;
		while(rows<=no) {
			
			
			int cst=1;
			while(cst<=nst) {
				if(rows==1 || rows==no || cst==1 || cst==no) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				cst++;
			}
			
			rows++;
			System.out.println();
		}
 
	}

}
