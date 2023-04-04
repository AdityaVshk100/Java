package Problem_Sets;
import java.util.*;
public class Do_you_know_table_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int no1 = sc.nextInt();
int no2 = sc.nextInt();
int  ans = no1;
int i = 2;
while(no1<=ans*no2) {
	System.out.println(no1);
	no1=ans*i;
	i++;
}

	}

}
