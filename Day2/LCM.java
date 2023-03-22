import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no1 = sc.nextInt();
        int no2= sc.nextInt();
        int Max = Math.max(no1,no2);
        int i = Max;
        int lcm=0;
        while(true){
            if(i%no1==0 && i%no2==0){
                lcm=i;
                break;
            }
            i++;
        }
        System.out.println(lcm);
    }
}
