import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no1 = sc.nextInt();
        int no2 = sc.nextInt();

        int Min = Math.min(no1,no2);
        int i = 1;
        int hcf=0;
        while(i<=Min){
            if(no1%i==0 && no2%i==0){
                hcf = i;
            }
            i++;
        }
        System.out.println(hcf);
    }
}
