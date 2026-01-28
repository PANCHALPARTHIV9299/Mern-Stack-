import java.util.*;

public class revrse{
    public static void main (String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Digits");
        int Digits = sc.nextInt();
        int rev = 0;
        int lastD;
        while(Digits > 0){
            lastD = Digits%10;
            rev = rev * 10 + lastD;
            Digits = Digits /10;
        }
        System.out.println(rev);
    }
}
// Enter the Digits
// 54321
// 12345