package Problem_Sets;
import java.util.*;
public class Prime_Factorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
	Scanner sc = new Scanner(System.in);
	int no = sc.nextInt();
	int i = 2;
	while(no!=1) {
		if(no%i==0) {
			System.out.print(i);
			no/=i;
			
		}else {
			i++;
		}
	}
	}

}
