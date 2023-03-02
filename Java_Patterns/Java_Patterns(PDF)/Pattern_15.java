import java.util.*;
public class Pattern_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rows=1;
        int nsp=0;
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
                nsp+=2;
            }else{
                nst++;
                nsp-=2;
            }

            rows++;
            System.out.println();

        }

    }
}
