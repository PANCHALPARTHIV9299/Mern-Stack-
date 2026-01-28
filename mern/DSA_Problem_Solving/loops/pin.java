import java.util.*;
public class pin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values for sum : ");
        int digit =sc.nextInt();
        int rem = 0;
        int sum = 0;
        while(digit > 0 ){
            rem = digit % 10;
            sum = sum +rem;
            digit =digit/10;
        }
        System.out.println("sum" + sum);
    }
}
// Enter the values for sum : 1523648
// sum29