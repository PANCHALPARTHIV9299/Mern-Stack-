import java.util.*;
public class pnum {

    public static boolean prime(int n){
        
        if(n <= 1){
            return false;
        }
        for(int i= 2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        try(Scanner sc =new Scanner(System.in)){
            System.out.print("Enter the valid num to check is it prime or not :");
            int num =sc.nextInt();

            if(prime(num)){
                System.out.print(num+" Given num is prime ");
            }else{
                System.out.println(num +" Given num is not prime");
            }

        }
    }
}
