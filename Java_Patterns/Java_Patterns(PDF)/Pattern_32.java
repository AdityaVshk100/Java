import java.util.*;
public class Pattern_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rows = 1;
        int nst=1;
        int q=1;

        while(rows<=2*n-1){

            int cst=1;
            while(cst<=nst){
                if(cst%2!=0){
                    System.out.print(q);
                }else{
                    System.out.print("*");
                }
                cst++;
            }

            if(rows<n){
                q++;
                nst+=2;
            }else{
                q--;
                nst-=2;
            }

            rows++;
            System.out.println();
        }
    }
}
