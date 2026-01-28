import java.util.*;
public class leepyear {
    public static void main(String []args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the Year to chek leap or not :");
            int year =sc.nextInt();

            if (year % 4 == 0){
                if (year % 100 == 0) {
                    if(year % 400 == 0){
                        System.out.println(year+" Year is leap year 1");
                    }else{
                        System.out.println(year + "Year is not leap Year!1");
                    }
                }else{
                    System.out.println(year+"Year is leap year 2");
                }
            }else {
                System.out.println(year+" Year is not leap Year!2");
            }
        }
    }
    
}
