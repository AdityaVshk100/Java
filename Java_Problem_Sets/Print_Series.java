package Problem_Sets;
import java.util.*;
public class Print_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     int no1 = sc.nextInt();
     int no2 = sc.nextInt();
     int i=1;
     int count=1;
     while(count<=no2) {
    	 int ans=3*(i)+2;
    	 if(ans%no2!=0) {
    		 System.out.println(ans);
    		 count++;
    	 }
    	 i++;
     }
     
	}

}
