import java.util.Scanner;

public class Pattern_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst=n;
        int nsp=0;
        int i = 1;
        while(i<=n){
            int csp=1;
            while(csp<=nsp){
                System.out.print(" ");
                csp++;
            }
            int j = 1;
            while (j<=nst){
                System.out.print("*");
                j++;
            }
            i++;
            nst--;
            nsp+=2;
            System.out.println();
        }
    }
}
