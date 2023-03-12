import java.sql.SQLOutput;
import java.util.Scanner;

public class Operators_Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // ---------++a or a++
        int c = (++a + b);
        System.out.println(c);

        //--------- Arthmetic operator
        System.out.println("Addition"+" "+(a+b)); // +
        System.out.println("Subtraction"+" "+(a-b)); // -
        System.out.println("Multiplication"+" "+" "+(a*b)); // *
        System.out.println("Modulus"+" "+(a%b)); // %
        System.out.println("Division"+" "+(a/b)); // /


        // ------- Assignment Operator
        a+=20;
        System.out.println(a);
//
        a*=20;
        System.out.println(a);
//
        a/=20;
        System.out.println(a);

        a%=20;
        System.out.println(a);
//
        a-=20;
        System.out.println(a);

        
        
        // ---------Relational Operator
        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        System.out.println(a==b);
        System.out.println(a!=b);

    }
}
