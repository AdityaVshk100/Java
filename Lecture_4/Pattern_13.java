package Lecture_4;
import java.util.*;
public class Pattern_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int rows=1;
		int nst=1;
		while(rows<=2*no-1) {
			int cst=1;
			while(cst<=nst) {
				System.out.print("*");
				cst++;
			}
			
			if(rows<no) {
				nst++;
			}else {
				nst--;
			}
			
			rows++;
			System.out.println();
		}
		
	}

}
