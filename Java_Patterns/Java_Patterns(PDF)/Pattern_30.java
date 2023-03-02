import java.util.*;
public class Pattern_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rows=1;
        int val=n;
        int nst = n;
        while(rows<=n){
            int cst=1;
            int cval=val;
            while(cst<=nst){
                System.out.print(cval);
                cval--;
                cst++;
            }

            rows++;

            System.out.println();

        }
    }
}
