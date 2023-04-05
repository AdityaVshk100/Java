package Problem_Sets;
import java.util.*;
public class print_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     int no = sc.nextInt();
     int reverse = 0;
     while(no!=0) {
    	 int digit= no%10;
    	 reverse = reverse*10+digit;
    	 no/=10;
    	 
     }
     System.out.println(reverse);
	}

}
