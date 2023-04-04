package Problem_Sets;
import java.util.*;
public class Print_Primes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     int no = sc.nextInt();
     Print_Primes(no);
	}
	
	
	public static int Prime_or_Not(int no) {
		
	       int count=0;
	       int i=2;
	       while(i<=Math.sqrt(no)) {
	    	   if(no%i==0) {
	    		   count++;
	    	   }
	    	   i++;
	       }
	       if(count>0) {
	    	  return -1;
	       }else {
	    	   return 1;
	       }
	       
		
	}
	
	public static void Print_Primes(int input) {
		
		int i=2;
		while(i<=input){
			int ans = Prime_or_Not(i);
			if(ans>0) {
				System.out.println(i);
			}
			i++;
		}
		
	}

}
