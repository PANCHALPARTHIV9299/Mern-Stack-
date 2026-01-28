import java.util.*;
public class table {
    // public static void table(int n){
       
    // }
    public static void main(String[]args){
        try(Scanner sc =new Scanner(System.in)){
            System.out.print("Enter the num :");
            int num =sc.nextInt();
             for (int i=1; i<=10; i++){
            int ans = i*num;
            System.out.println(num+" "+i+" "+ans);
        }
        }
    }
}
