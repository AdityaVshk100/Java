import java.util.Scanner;

public class Pattern_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int nst = 1;
        int nsp = n-1;
        int rows=1;
        int val = 1;

        while(rows<=n){
            int csp=1;
            while(csp<=nsp){
                System.out.print(" ");
                csp++;
            }

            int cst=1;
            int cval = val;
            while(cst<=nst){
                if(cst==1 || cst==nst){
                    System.out.print(cval);
                }else{
                    System.out.print("0");
                }
                cst++;

            }

            rows++;
            nsp--;
            nst+=2;
            val++;
            System.out.println();

        }
    }
}
