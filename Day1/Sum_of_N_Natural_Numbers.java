import java.util.*;
public class Sum_of_N_Natural_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i<=n){
            sum+=i;
            i+=1;
        }
        System.out.println(sum);
    }
}
