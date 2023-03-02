import java.util.Scanner;

public class Pattern_20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rows=1;
        int nst=1;
        int nsp=n/2;
        int nsp2 = -1;
        while(rows<=n){

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

            csp=1;
            while(csp<=nsp2){
                System.out.print("  ");
                csp++;
            }

            cst=1;
            if(rows==1 || rows==n){
                cst=2;
            }
            while(cst<=nst){
                System.out.print("* ");
                cst++;
            }


            if(rows<n/2+1){

                nsp--;
                nsp2+=2;
            }else{

                nsp++;
                nsp2-=2;
            }

            rows++;
            System.out.println();

        }
    }
}
