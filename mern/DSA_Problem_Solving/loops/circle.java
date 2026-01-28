import java.util.*;

public class circle {
    public static void main(String[] args) {
        try (Scanner SC = new Scanner(System.in)) {
            System.out.print("Enter the radius :");
            int R = SC.nextInt();
            System.out.println("Redius is :" + R);
            System.out.println("Area of circle : " + 3.14159 * R * R);
        }
    }
}