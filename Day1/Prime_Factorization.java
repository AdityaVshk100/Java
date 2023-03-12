import java.util.Scanner;

public class Prime_Factorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int i = 2;
        if(no!=1){
            while(no!=1){
                if(no%i==0){
                    System.out.print(i+" ");
                    no=no/i;
                }else{
                    i++;
                }
            }
        }else{
            System.out.println("1");
        }

    }
}
