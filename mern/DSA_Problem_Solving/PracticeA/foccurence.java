
// //Find Last occurrence of num
import java.util.*;

public class foccurence {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.print("Enter the ARRAY size");
            int size = sc.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            
            System.out.print("Enter the match value : ");
            int match = sc.nextInt();

            for (int i = arr.length-1; i > 0; i--) {
                if (match == arr[i]) {
                    System.out.print("Num is match at index number : " + i);
                    break;
                } 
            }

        }
    }
}
