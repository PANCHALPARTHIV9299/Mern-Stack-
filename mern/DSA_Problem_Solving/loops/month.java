import java.util.*;

public class month {
    public static void main(String [] args){
        try (Scanner m = new Scanner(System.in)) {
            int month = m.nextInt();

            switch(month){
                case 1 -> System.out.println("januray");
                case 2 -> System.out.println("february");
                case 3 -> System.out.println("march");
                case 4 -> System.out.println("April");
                case 5 -> System.out.println("May");
                case 6 -> System.out.println("Jun");
                case 7 -> System.out.println("July");
                case 8 -> System.out.println("August");
                case 9 -> System.out.println("September");
                case 10 -> System.out.println("Octomber");
                case 11 -> System.out.println("Navember");
                case 12 -> System.out.println("december");
                default -> System.out.println("Enter valid number");
            }
        }
    }    
}
