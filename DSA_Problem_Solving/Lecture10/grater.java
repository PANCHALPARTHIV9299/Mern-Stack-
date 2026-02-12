// Write a function which takes in 2 numbers and returns the greater of those two.
import java.util.*;

public class grater {
    public static void larg(int a,int b){
        if (a > b){
            System.out.print(a+ " is grater (first value)");
        }else if (a==b){
            System.out.print(a+b+" both are equal");
        }else {
            System.out.print(b+" is grater (Second value)");
        }
    }
    public static void main(String[] args) {
        try(Scanner sc =new Scanner(System.in)){
            System.out.print("Enter the num1 : ");        
            int num1=sc.nextInt();
            System.out.print("Enter the Num2 : ");
            int num2 = sc.nextInt();

            larg(num1,num2);
        }
    }
}
