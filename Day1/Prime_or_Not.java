import java.util.Scanner;


public class Prime_or_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        boolean flag = true;
        int i = 2;
        while(i<no/2){
            if(no%i==0){
                flag=false;
                break;
            }
            i++;
        }
        if(flag){
            System.out.println("Its a Prime number");
        }else{
            System.out.println("Its not a Prime number");
        }
    }
}
