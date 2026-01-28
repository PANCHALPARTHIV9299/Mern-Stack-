
import java.util.*;

public class count {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the digits : ");
            int digit = sc.nextInt();
            int sum = 0;
            int rem ;
            int count = 0;
            while (digit > 0) {
                rem = digit % 10;
                sum = sum + rem;
                digit = digit / 10;
                count = count + 1;
            }
            if (count <= 4 && count >= 4 && sum % 2 == 0) {
                System.out.println(sum + " : digit cout : " + count); //
            } else {
                System.out.println("Given number is not following the rules");
            }
        }
    }
}
// Enter the digits : 1234
// 10 : digit cout : 4