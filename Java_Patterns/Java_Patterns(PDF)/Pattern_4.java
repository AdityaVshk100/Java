import java.util.Scanner;

public class Pattern_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp=n-1;
        int i = 1;
        while(i<=n){
            int csp=1;
            while(csp<=nsp){
                System.out.print(" ");
                csp++;
            }
            int j = 1;
            while (j<=i){
                System.out.print("*");
                j++;
            }
            i++;
            nsp--;
            System.out.println();
        }
    }
}
