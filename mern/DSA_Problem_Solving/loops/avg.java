import java.util.*;

public class avg {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter a");
            int A = sc.nextInt();
            System.out.print("enter b");
            int B = sc.nextInt();
            System.out.print("enter c");
            int c = sc.nextInt();
            float Avg = (A + B + c) / 3;
            System.out.println("Average of this 3 :" + Avg);
        }
    }
}