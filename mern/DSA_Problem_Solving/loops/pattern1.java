
import java.util.*;

public class pattern1 {

    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = d.nextInt();
        for (int i = 1; i <= n; i++) {
            int count = 0;
            while (count < i) {
                count = count+1;
                System.out.print(i);//"*");
            }
            System.out.println();
        }
    }
}
