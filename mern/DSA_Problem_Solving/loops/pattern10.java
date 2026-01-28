
public class pattern10 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        // other solution
        // for (int i = n; i >= 1; i--) {
        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
    }
}
// 1
// 12
// 123
// 1234
// 12345
// 123456