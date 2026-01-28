
public class pattern7 {
    public static void main(String[] args) {
        int n = 5;
        int m = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");//(" * ");
            }
            System.out.println();
        }

        for (int i = m; i >= 1; i--) {                
            for (int j = i; j >= 1; j--){           
                System.out.print("* ");//(i+" ");   
            }                     
            System.out.println();
        }
    }
}
// 1
// 2 2
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5

//  * 
//  *  *
//  *  *  *
//  *  *  *  *
//  *  *  *  *  *


// 55555
// 4444
// 333
// 22
// 1
//  *  *  *  *  * 
//  *  *  *  *
//  *  *  *
//  *  *
//  *
