package Problem_Sets;
import java.util.*;
public class Check_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int no = sc.nextInt();
       int count=0;
       int i=2;
       while(i<=Math.sqrt(no)) {
    	   if(no%i==0) {
    		   count++;
    	   }
    	   i++;
       }
       if(count>0) {
    	   System.out.println("Not Prime");
       }else {
    	   System.out.println("Prime");
       }
       
	}

}
