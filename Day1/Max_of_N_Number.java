import java.util.Scanner;

public class Max_of_N_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int no = sc.nextInt();
        int Max = 0;
        int i = 1;
        while(i<=no){
            int input = sc.nextInt();

            if(Max<input){
                Max = input;
            }
            i++;
        }
        System.out.println(Max);

    }
}
