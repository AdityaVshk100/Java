import java.util.*;
public class Pattern_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rows=1;
        int nst=1;
        int nsp=n/2;
        while(rows<=n){
            int csp=1;
            while(csp<=nsp){
                System.out.print(" ");
                csp++;
            }

            int cst=1;
            while(cst<=nst){
                System.out.print("*");
                cst++;
            }

            if(rows<n/2+1){
                nst+=2;
                nsp--;
            }else{
                nst-=2;
                nsp++;
            }

            rows++;
            System.out.println();
        }

    }
}
