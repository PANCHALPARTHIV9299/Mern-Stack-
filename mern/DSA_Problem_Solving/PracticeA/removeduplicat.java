//Given a sorted array, remove duplicates in-place. + Return the number of unique elements
import java.util.*;
public class removeduplicat{
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)){
            // ================================ Input ================================
            System.out.print("Enter the size of the array : ");
            int size = sc.nextInt();
            int [] arr = new int[size];
            for (int i = 0; i < arr.length; i++){
                System.out.print("Enter the Elemrnt in the array : ");
                arr[i]=sc.nextInt();
            }
            // =============================== Logic To remove Duplicate elements =============================
            int index = 1;
            for (int i = 1; i < arr.length; i++){
                if (arr[i] != arr[i-1]){
                    arr[index] = arr[i];
                    index++;
                }
            }
            // =============================== New Array =====================================
            System.out.println("Unique Elemnet is : "+index );
            for (int i =0; i<index; i++){
                System.out.print(arr[i]);
            }
        }
    }
}