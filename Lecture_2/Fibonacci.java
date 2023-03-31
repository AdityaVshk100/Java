
package Lecture_2;
import java.util.*;

public class Fibonacci {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      int no=sc.nextInt();
      int a = 0;
      int b = 1;
      int i=1;
      int c=-1;
      while(i<=no) {
    	  c=a+b;
    	  a=b;
    	  b=c;
    	  i++;
      }
      System.out.println(a);
      System.out.println(b);
      
	}

}
