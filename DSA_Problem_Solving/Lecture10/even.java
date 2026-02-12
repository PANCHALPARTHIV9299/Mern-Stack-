import java.util.*;
public class even {
    public static boolean even(int n){
        return n % 2 == 0;
    } 
    public static void main(String []args){
        try(Scanner sc =new Scanner(System.in)){
            System.out.print("Enter the num :");
            int num =sc.nextInt();

            if(even(num)){
                System.out.print(num + " Given num is even");
            }else{
                System.out.println(num+" Given num is not even");
            }

        }
    }
}
