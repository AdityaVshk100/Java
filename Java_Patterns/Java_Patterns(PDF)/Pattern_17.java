import java.util.*;
public class Pattern_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rows=1;
        int nst=n/2;
        int nsp=1;
        while(rows<=n){

            int cst=1;
            while(cst<=nst){
                System.out.print("* ");
                cst++;
            }

            int csp=1;
            while(csp<=nsp){
                System.out.print("  ");
                csp++;
            }

            cst=1;
            while(cst<=nst){
                System.out.print("* ");
                cst++;
            }


            if(rows<n/2+1){
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
