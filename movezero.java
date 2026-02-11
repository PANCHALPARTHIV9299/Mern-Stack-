//Given an array, move all 0s to the end of the array.

import java.util.*;
public class movezero{
    public static void main(String args[]){
        try ( Scanner sc = new Scanner (System.in)){
            // ==========================TAKE INPUT FROM THE USER 1- SIZE THEN 2 ELEMT OF THE ARRY======================
            System.out.print("Enter the size of the array : ");
            int size = sc.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++){
                System.out.print("Enter the Element in the arry : ");
                arr[i]=sc.nextInt();
            }
            // ============================= LOGIC TO MOVE ALL ZERO FROM FIRST TO LAST =================================
            int index=0;
            for(int i = 0; i < arr.length; i++){
                
                if (arr[i] != 0){
                    arr[index] = arr[i];
                    index++;
                }
            }
            for (int i = index; i< arr.length; i++){
                arr[i]=0;
            }
            for (int i = 0; i < arr.length; i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
}