import java.util.*;

public class palindrome {
    public static void main(String args[]) {
        try (Scanner scc = new Scanner(System.in)) {
            System.out.print("Enter n digit : ");
            int digit = scc.nextInt();
            int copy = digit;
            int lastd;
            int rev = 0;
            while (digit > 0) {
                lastd = digit % 10;
                rev = rev * 10 + lastd;
                digit = digit / 10;
            }
            if (rev == copy) {
                System.out.println("Given digtis is palindrome");
            } else {
                System.out.println("Given value is not palindrome");
            }
        }
    }
}