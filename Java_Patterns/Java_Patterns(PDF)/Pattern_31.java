import java.util.Scanner;

public class Pattern_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rows=1;
        int val=n;
        int nst = n;
        int q = n;
        while(rows<=n){
            int cst=1;
            int cval=val;
            while(cst<=nst){
                if(cst==q){
                    System.out.print("*");
                }else{
                    System.out.print(cval);
                }
                cval--;
                cst++;
            }

            rows++;
            q--;

            System.out.println();

        }
    }
}
