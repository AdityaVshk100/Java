package Problem_Sets;
import java.util.*;
public class Boston_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int no = sc.nextInt();
		BostonNumber(no);

	}
	
	public static int digit_Sum(int no) {
		int sum=0;
		while(no!=0) {
			int digit = no%10;
			sum=sum+digit;
			no=no/10;
		}
		return sum;
	}
	
	public static void BostonNumber(int no) {
		int sum=0;
		int i=2;
		int ans=no;
		while(no!=1) {
			if(no%i==0) {
				sum=sum+digit_Sum(i);
				no=no/i;
			}else {
				i++;
			}
		}
		if(sum==digit_Sum(ans)) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}

}
