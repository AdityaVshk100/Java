import java.util.Scanner;

public class Pattern_33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rows=1;
        int nsp=n-1;
        int nst=1;
        int val=n;

        while(rows<=n){
            int csp=1;
            while(csp<=nsp){
                System.out.print(" ");
                csp++;
            }

            int cval=val;
            int cst=1;
            while(cst<=nst){
                if(cst==nst/2+1){
                    System.out.print("0");
                }else{
                    System.out.print(cval);
                }
                cst++;
                if(cst<=nst/2+1){
                    cval++;
                }else{
                    cval--;
                }
            }

            rows++;
            nsp--;
            val--;
            nst+=2;
            System.out.println();
        }

    }
}
