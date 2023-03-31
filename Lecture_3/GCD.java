package Lecture_3;
import java.util.*;
public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int divisior = n1;
    int dividend = n2;
    
    while(divisior>0) {
    	int ans = dividend%divisior;
    	dividend = divisior;
    	divisior = ans;
    }
    System.out.println(dividend);
	}

}
