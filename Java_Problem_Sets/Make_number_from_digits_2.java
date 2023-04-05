package Problem_Sets;
import java.util.*;
public class Make_number_from_digits_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
	     int i = 1;
	     int reverse = 0;
	     while(i<=no) {
	    	 int input = sc.nextInt();
	    	 reverse = reverse*10+input;
	    	 i++;
	     }
	     System.out.println(reverse);
		
		
	}

}
