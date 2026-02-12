//Write a function to print the sum of all odd numbers from 1 to n.
import java.util.*;
public class num {
    public static void odd(int n){
        for(int i=1; i<=n;i++){
            if(i%2 != 0)
            System.out.println("This num is odd num : "+i);
        }
      
    }
    public static void main(String[] args) {
        try(Scanner sc =new Scanner(System.in)){
            System.out.print("Enter the range : ");
            int range = sc.nextInt();
            odd(range);
        }
    }  
}
