package Lecture_4;
import java.util.*;
public class Pattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int rows=1;
		while(rows<=no) {
			int cst=1;
			while(cst<=no) {
				System.out.print("*");
				cst++;
			}
			rows++;
			System.out.println();
		}
 
	}

}
