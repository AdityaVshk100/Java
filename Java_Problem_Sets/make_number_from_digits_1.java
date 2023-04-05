package Problem_Sets;
import java.util.Scanner;
public class make_number_from_digits_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
     
     int b = 0 ;
     
     while(reverse!=0) {
    	 int a = reverse%10;
    	 b = b*10+a;
    	 reverse/=10;
     }
     System.out.print(b);
     
	}

}
