package Lecture_4;

import java.util.Scanner;

public class Pattern_31 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int rows=1;
		int val=no;
		while(rows<=no) {
			int cval=no;
			int cst=1;
			while(cst<=no) {
				if(cval==rows) {
					System.out.print("*");
				}else {
					System.out.print(cval);
				}
				
				cval--;
				cst++;
			}
			rows++;
			System.out.println();
		}
 
	}
}
