import java.util.*;
public class sorted{
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the Array size : ");
            int size = sc.nextInt();
            int[] arr = new int[size];
            System.out.print("Enter the Elemnts to the array : ");
            for (int i = 0; i < arr.length; i++){
                arr[i]=sc.nextInt();
            }
            for (int i =0; i<arr.length-1; i++){
                if (arr[i]<arr[i+1]){
                    System.out.print("Array is sorted" );
                }else {
                    System.out.print("Array is not sorted");
                }
            }
        }
    }
}