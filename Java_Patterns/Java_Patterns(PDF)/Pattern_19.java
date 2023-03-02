import java.util.Scanner;

public class Pattern_19 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int rows=1;
            int nst=n/2+1;
            int nsp=-1;
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

                if(rows==1 || rows==n){
                    cst=2;
                }

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

