// Write a function that takes in age as input and returns if that person is eligible to vote or not.
// A person of age > 18 is eligible to vote
import java.util.*;
public class vote {
    public static void able(int n){
        if (n >= 18){
            System.out.print("You can give the vote");
        }else{
            System.out.print("You are not able give the vote ");
        }
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the value of age : ");
            int age = sc.nextInt();

            able(age);
        }
    }
}
