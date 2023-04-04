package Problem_Sets;

import java.util.Scanner;

public class Do_you_know_table_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no1 = sc.nextInt();
		int no2 = sc.nextInt();
		int i = 2;
		int ans=no1;
		while(no1<=no2) {
			System.out.println(no1);
			no1=ans*i;
			i++;
		}
									
	}
}
