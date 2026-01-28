import java.util.*;
public class even {
    public static void main (String [] args ){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter a :");
            int a = sc.nextInt();
            for(int i = 0 ; i <= a; i++){
                if(i % 2 == 0){
                    System.out.println("ALL Even's :"+ i);
                }
                else{
                    System.out.println("");
                }
            }
        }
    }
}
