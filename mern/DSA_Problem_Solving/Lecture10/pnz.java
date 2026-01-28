// Write a program to enter the numbers till the user wants and at the end it should display 
// the count of positive, negative and zeros entered. 

import java.util.*;

public class pnz {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the input");
            int input = sc.nextInt();
            int positive = 0;
            int nagative = 0;
            int zero = 0;
            while (input == 1) {
                System.out.print("Enter the num value : ");
                int num = sc.nextInt();
                if (num == 0) {
                    zero++;
                    System.out.println("num is zero");
                } else if (num > 0) {
                    positive++;
                    System.out.println(num + " Value is positive value");
                } else {
                    nagative++;
                    System.out.println(num + " Valur is nagative ");
                }    
                System.out.print("Enter the input");
                input = sc.nextInt();
                
                System.out.println(zero);
                System.out.println(positive);
                System.out.println(nagative);
            }

        }
    }
}
