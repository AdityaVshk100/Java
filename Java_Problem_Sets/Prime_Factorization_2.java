package Problem_Sets;

import java.util.Scanner;

public class Prime_Factorization_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     
			
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int i = 2;
		boolean flag = true;
		while(no!=1) {
			if(no%i==0) {
				if(flag) {
					System.out.print(i);
					flag =false;
				}
				no/=i;
				
			}else {
				i++;
				flag = true;
			}
		}
		
	}

}
