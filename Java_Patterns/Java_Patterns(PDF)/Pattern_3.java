import java.util.Scanner;

public class Pattern_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int nst = n;
        while(i<=n){
            int j = 1;
            while (j<=nst){
                System.out.print("*");
                j++;
            }
            i++;
            nst--;
            System.out.println();
        }
    }

}
