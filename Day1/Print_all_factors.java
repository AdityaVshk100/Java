import java.util.Scanner;

public class Print_all_factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int no = sc.nextInt();
        int i = 1;
        int count = 0;
        while(i<=no){
            if(no%i==0){
//              System.out.print(i+" ");
                count+=1;
            }
            i++;
        }
        System.out.println(count);
    }
}
