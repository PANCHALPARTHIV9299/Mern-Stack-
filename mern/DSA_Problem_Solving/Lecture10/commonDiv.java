// Write a function that calculates the Divisor of 2 numbers. (BONUS)

import java.util.*;

public class commonDiv {

    public static void divisor(int n1, int n2) {
        int div = 0;
        int count = 0;
        for (int i = 1; i <= n1; i++) {
            div = n1 % i;
            if (div == 0) {
                count = i;
                System.out.println("Value Diviosr : "+count);
            }
        }
        int div1=0;
        int count1=0;
        for (int i = 1; i <= n2; i++) {
            div1 = n2 % i;
            if (div1 == 0) {
                count1 = i;
                System.out.println("Value Diviosr : "+count1);
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value A : ");
            int num1 = sc.nextInt();
            System.out.print("Enter the value B : ");
            int num2 = sc.nextInt();

            divisor(num1,num2);
            
        }
    }
}
