package Lecture_4;
import java.util.*;
public class Pattern_32 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no =sc.nextInt();
		int nst=1;
		int rows=1;
		int v=1;
		while(rows<=2*no-1) {
			int cst=1;
			while(cst<=nst) {
				if(cst%2==0) {
					System.out.print("* ");
				}else {
					System.out.print(v+" ");
				}
				cst++;
			}
			
			if(rows<no) {
				nst+=2;
				v++;
			}else {
				nst-=2;
				v--;
			}
			rows++;
			System.out.println();
		}
	}
}
