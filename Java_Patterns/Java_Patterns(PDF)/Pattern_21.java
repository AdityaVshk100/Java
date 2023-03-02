import java.util.Scanner;

public class Pattern_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rows=1;
        int nst=1;
        int nsp=n+2;
        while(rows<=n){
            int cst=1;
            while(cst<=nst){
                System.out.print("*");
                cst++;
            }

            int csp=1;
            while(csp<=nsp){
                System.out.print(" ");
                csp++;
            }

            cst=1;
            if(rows==n){
                cst=2;
            }
            while(cst<=nst){
                System.out.print("*");
                cst++;
            }


            rows++;
            nsp-=2;
            nst++;
            System.out.println();
        }
    }
}
