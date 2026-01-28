import java.util.*;
public class oneton{
    public static void main (String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter N value : "); 
            int digit = sc.nextInt();
            // numbers printing until n
            // for (int i = 1; i<=N; i++){  
            //     System.out.println(i);
            // }
     
            //first sum n
            int sum = 0;
            for(int i=1; i <= digit; i++){
                sum = sum+i;
                System.out.println("sum is : "+sum);
            }
        }
      
        //other method for first sum of n
        // int sum = digit*((digit+1)/2);
        // System.out.println("Sum : "+sum);

        // first even number 
        //  for(int i=1; i <= N; i++){
        //     int sum = i+i;
        //     System.out.println("sum is : "+sum);
        // }

      
    }
}