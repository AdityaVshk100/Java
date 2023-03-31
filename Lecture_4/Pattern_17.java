package Lecture_4;
import java.util.*;
public class Pattern_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int no = sc.nextInt();
    int rows=1;
    int nsp=1;
    int nst = no/2;
    while(rows<=no) {
    	int cst=1;
    	while(cst<=nst) {
    		System.out.print("*");
    		cst++;
    	}
    	int csp=1;
    	while(csp<=nsp) {
    		System.out.print(" ");
    		csp++;
    	}
    	
    	cst=1;
    	while(cst<=nst) {
    		System.out.print("*");
    		cst++;
    	}
    	
    	if(rows<no/2+1) {
    		nst--;
    		nsp+=2;
    	}else {
    		nst++;
    		nsp-=2;
    	}
    	
    	rows++;
    	System.out.println();
    }
    
	}

}
