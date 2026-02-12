//Enter 3 numbers from the user & make a function to print their average.

import java.util.*;
public class avg {
    public static int Avrage(int a,int b,int c){
        return (a+b+c)/3;
    }
    public static void main(String[]args){
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the A value : ");
            int A = sc.nextInt();
            System.out.print("Enter the b value : ");
            int B = sc.nextInt();
            System.out.print("Enter the C value : ");
            int C = sc.nextInt();

            System.out.println("The Average of the values :"+Avrage(A,B,C));

        }
    }
}
// Enter the A value : 5
// Enter the b value : 4
// Enter the C value : 6
// The Average of the values :5