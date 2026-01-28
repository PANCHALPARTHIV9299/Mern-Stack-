import java.util.*;
public class pattern4 {
    public static void main(String args[]){
        Scanner n = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int digit = n.nextInt();
        int rev=0;
        int lastd=0;
        int right=0;
        int nedigit=0;
        while(digit>0){
            lastd=digit%10;
            rev = rev * 10 +lastd ;
            digit = digit/10;
        }
        while(rev>0){
            nedigit= rev % 10;
            right = right * 10 + nedigit;
            rev = rev /10;
            System.out.println(right);
        }

    }
    
}
// Enter the value : 123456789 
// 1
// 12
// 123
// 1234
// 12345
// 123456
// 1234567
// 12345678
// 123456789