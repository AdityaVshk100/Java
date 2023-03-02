import java.util.Scanner;

public class Pattern_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rows=1;
        int nsp=n-1;
        int nst = n;

        while(rows<=2*n-1){
            int csp=1;
            while(csp<=nsp){
                System.out.print("  ");
                csp++;
            }


            int cst=1;
            while(cst<=nst){
                System.out.print("* ");
                cst++;
            }

            if(rows<n){
                nst--;
                nsp--;
            }else{
                nst++;
                nsp++;
            }

            rows++;
            System.out.println();

        }

    }
}
