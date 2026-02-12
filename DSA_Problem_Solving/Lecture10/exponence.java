// Two numbers are entered by the user, x and n. Write a function to find 
// the value of one number raised to the power of another i.e. xn.

import java.util.*;


public class exponence {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter base value : ");
            int base = sc.nextInt();
            System.out.print("Enter exponent value : ");
            int Exponent = sc.nextInt();
            int Ans = 1;
            for (int i = 1; i <= Exponent; i++) {
                Ans = Ans * base;
            }
            System.out.print(base + " Raied to " + Exponent + " = " + Ans);
        }
    }
}
//     public static void main(String args[]) {
//        System.out.println("Enter x");
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        System.out.println("Enter n");
//        int n = sc.nextInt();


//        int result = 1;
//        //Please see that n is not too large or else result will exceed the size of int
//        for(int i=0; i<n; i++) {
//            result = result * x;
//        }
//        System.out.println("x to the power n is : "+ result);
//    }   
// }
