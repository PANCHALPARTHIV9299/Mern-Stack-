import java.util.*;
public class pattern2 {
    public static void main(String args[]) {
        Scanner c = new Scanner(System.in);
        System.out.print("Enter digits : ");
        int digits = c.nextInt();
        System.out.println(digits);
        while (digits > 1) {
            digits = digits / 10;
            // System.out.println();
            System.out.println(digits);
        }
    }
}