import java.util.*;
public class Print_all_Prime_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        while(i<=n){
            boolean flag = true;
            int j = 2;
            while(j<i) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
                j++;
            }
            if(flag) {
                System.out.print(i+" ");
            }
            i++;
        }


    }
}

