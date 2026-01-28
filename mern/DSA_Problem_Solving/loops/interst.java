import java.util.*;

public class interst{
    public static void main(String [] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter p");
            int P = sc.nextInt();
            System.out.print("Enter Q");
            int Q = sc.nextInt();
            System.out.print("Enter T");
            int T = sc.nextInt();
            int SI = (P * Q * T)/100;
            System.out.println("Simple interst is : " + SI);
        }
    }
}