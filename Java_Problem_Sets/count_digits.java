package Problem_Sets;
import java.util.Scanner;

public class count_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int count = (int)Math.log10(no)+1;
		System.out.println(count);

	}

}
