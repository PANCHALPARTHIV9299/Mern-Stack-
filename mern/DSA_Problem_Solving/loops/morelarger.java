import java.util.*;
public class morelarger {
    public static void main(String []args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the num 1 :");
            int num1 =sc.nextInt();
            System.out.print("Enter the num 2 :");
            int num2 = sc.nextInt();
            System.out.print("Enter the num 3 :");
            int num3 =sc.nextInt();

            if (num1 == num2 && num1 == num3 && num2 == num3){
                System.out.println("NUM1 NUM2 and NUM3 digits are same");
            }else if (num1 > num2 && num1 > num3){
                System.out.println("Num1 is gratest");
            } else if (num2 >num1 && num2 >num3 ){
                System.out.println("NUM2 is gretest");
            }else {
                System.out.println("NUM3 is gretest");
            }
        }

    }    
}
