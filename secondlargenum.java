import java.util.*;
public class secondlargenum{
    public static void main(String []args){
        try(Scanner sc= new Scanner(System.in)){
            System.out.print("Enter the arrayy size : ");
            int size = sc.nextInt();
            int [] arr = new int [size]; 
            for (int i = 0; i<arr.length; i++){
                arr[i]=sc.nextInt();
            }
            int large =0;
            int secondlarge =0;
            for(int i=0; i<arr.length; i++){
                if (arr[i] > large){
                    large = arr[i];
                } else if(arr[i]>secondlarge && secondlarge < large){
                    secondlarge = large;
                }
            }
            System.out.println("Largest Value : "+secondlarge);
        }
    }
}