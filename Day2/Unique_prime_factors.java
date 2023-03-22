import java.util.*;
public class Unique_prime_factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        boolean flag = true;
        int i = 2;
        while(i<=no){
            if(no%i==0) {
                if (flag) {
                    System.out.print(i+" ");
                    flag = false;
                }
                no = no/i;
            }else{
                i++;
                flag =true;
            }

        }
    }
}
