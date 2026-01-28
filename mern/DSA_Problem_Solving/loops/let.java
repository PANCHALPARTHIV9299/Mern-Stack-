import java.util.*;
public class let {
    public static void main (String [ ] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number 1:");
            int NUM1 = sc.nextInt();
            System.out.print("Enter number 2:");
            int NUM2 = sc.nextInt();

            System.out.print("Enter Op");
            int OPR =sc.nextInt();
            switch (OPR) {
                case 1: System.out.println("Addition : " + NUM1 + NUM2 );
                break; 
                case 2: System.out.println("Subtraction : " + (NUM1 - NUM2) );
                break;
                case 3: System.out.println("Multiplication : " + NUM1 * NUM2 );
                break;
                case 4: System.out.println("Division : " + NUM1 / NUM2 );
                break;
                case 5: System.out.println("modulo : " + NUM1 % NUM2 );
                break;
                default: System.out.println("invalid number");
            }
        }
    }
}
