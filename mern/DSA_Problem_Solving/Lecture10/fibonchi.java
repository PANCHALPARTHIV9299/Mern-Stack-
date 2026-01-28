// Write a program to print Fibonacci series of n terms where n is input by user :
// 0 1 1 2 3 5 8 13 21 ..... 
// In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
import java.util.*;
public class fibonchi {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the value : ");
            int num =sc.nextInt();
            int a = 0; 
            int b = 1;
            System.out.print(a+" ");
            if (num > 1){
                for(int i=2; i<=num; i++){
                    System.out.print(b+" ");
                    int temp = b;
                    b = a + b;
                    a = temp; 
                }
                System.out.println();
            }
        }
    }    
}
