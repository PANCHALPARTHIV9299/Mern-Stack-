// Write a function that takes in the radius as input and returns the circumference of a circle
import java.util.*;

public class circle {
    public static int circum(int n){
        int ans = (int) (2 * 3.14 * n);
        return ans;
    }
    public static void main(String[] args) {
        try(Scanner sc= new Scanner(System.in)){
            System.out.print("Enter the value of radius");
            int radius = sc.nextInt();

            System.out.println(circum(radius));
        }   
    }  
}
