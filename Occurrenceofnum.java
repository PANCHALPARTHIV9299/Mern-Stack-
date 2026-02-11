import java.util.*;
public class Occurrenceofnum {
    public static void main(String[] args) {
        // int[] arr={2,4,15,1,3,5,6,7,1,5,8,9};
        // int match=9;
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("Enter the size of the Array : ");
            int numSize = sc.nextInt();
            int[] arr = new int[numSize];
            for (int i = 0; i < numSize; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print("Enter the num to Match :");
            int match = sc.nextInt();
            for (int i = 0; i < arr.length; i++) {
                if (match == arr[i]) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}