import java.util.*;

public class pattern3 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int n = sc.nextInt();
        for (int i =1; i<=n ; i++){
            int count =0;
            while(count < i){
               count= count +1;
               System.out.print("*");
            }
            System.out.println();
        }
    }
}
// Enter the value : 5
// *
// **
// ***
// ****
// *****