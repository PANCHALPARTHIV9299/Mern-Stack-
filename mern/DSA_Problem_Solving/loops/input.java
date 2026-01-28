import java.util.*;
public class input {
    public static void main(String []args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter intger :  ");
            int a =sc.nextInt();

            if(a == 0){
                System.out.println("ZERO");
            }else if (a < 0) {
                System.out.println("Given number is Nagative integer :"+ a);
            }else if (a > 0){
                System.out.println("Givent number is positive integer :"+a);
            }
        }
    }
}
