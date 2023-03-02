import java.util.Scanner;

public class Pattern_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int nst = 1;
        int nsp = n-1;
        int rows=1;
        while(rows<=n){
            int csp=1;
            while(csp<=nsp){
                System.out.print("  ");
                csp++;
            }

            int cst=1;
            while(cst<=nst){
                if(cst%2!=0){
                    System.out.print("* ");
                }else{
                    System.out.print("! ");
                }
                cst++;
            }

            rows++;
            nsp--;
            nst+=2;
            System.out.println();

        }
    }
}
