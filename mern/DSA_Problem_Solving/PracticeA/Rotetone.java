///Given an array, rotate it left by 1 position.
import java.util.*;

public class Rotetone {
    public static void main(String []args){
        // ===================================== Array creation ====================================
        try(Scanner sc = new Scanner (System.in)){
            System.out.print("Enter the size of the Array : ");
            int size = sc.nextInt();
            int[]arr = new int[size];
            for(int i=0; i<arr.length; i++){
                System.out.print("Enter the Element : ");
                arr[i]=sc.nextInt();
            }
        // ==================================== logic To Rotate Position ===========================
            int first = arr[0];
            for (int i = 0; i < arr.length-1; i++){
                arr[i] = arr[i+1];
            }
            arr[arr.length-1] = first;
            System.out.println("Unique Elemnet is : " );
            for (int i =0; i<arr.length; i++){
                System.out.print(arr[i]);
            }
        }
    }    
}
