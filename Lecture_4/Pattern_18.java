package Lecture_4;

import java.util.Scanner;

public class Pattern_18 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int no = sc.nextInt();
    int rows=1;
    int nsp=no/2;
    int nst = 1;
    while(rows<=no) {
    	
    	int csp=1;
    	while(csp<=nsp) {
    		System.out.print(" ");
    		csp++;
    	}
    	
    	int cst=1;
    	while(cst<=nst) {
    		System.out.print("*");
    		cst++;
    	}
    	
    	
    	
    	if(rows<no/2+1) {
    		nsp--;
    		nst+=2;
    	}else {
    		nsp++;
    		nst-=2;
    	}
    	
    	rows++;
    	System.out.println();
    }
    
	}
}
