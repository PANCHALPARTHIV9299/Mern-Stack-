import java.util.*;

public class sum {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array : ");
            int Arraysize = sc.nextInt();
            System.out.print("Enter the Elemnts of the array : ");
            int[] arr = new int[Arraysize];
            for (int i = 0; i < Arraysize; i++) {
                arr[i] = sc.nextInt();
            }
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];
            }
            System.out.println("The sum of all Elemnt is : " + sum);
        }
    }
}
