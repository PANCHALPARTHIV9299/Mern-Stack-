import java.util.*;

public class large {
    public static void main(String []args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number a");
            int a = sc.nextInt();
            System.out.print("Enter the number b");
            int b = sc.nextInt();

            if (a == b ){
                System.out.println("A & b is equal");
            }else if (a > b) {
                System.out.println("A is grater then b");
            }else {
                System.out.println("A is lesser, means b is grater then a ");
            }
        }
    }    
}
