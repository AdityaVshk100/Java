import java.util.Scanner;

public class Eculids_Method_HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no1= sc.nextInt();
        int no2 = sc.nextInt();

        while(no1%no2!=0){
            int rem = no1%no2;
            no1=no2;
            no2=rem;
        }

        System.out.println(no2);
    }
}
