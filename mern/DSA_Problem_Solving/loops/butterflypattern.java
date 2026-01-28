public class butterflypattern {
    public static void main (String[] args) {
        int N = 6;
        for(int i=1; i<=N; i++){
            for(int j=1; j<=i; j++){
                System.out.print( "*");
            }
            int space = 2 * (N-i);
            for(int j =1; j<=space; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print( "*");
            }
            System.out.println();
        }
        for(int i=N; i>=1; i--){
            for(int j =i; j>=1; j--){
                System.out.print("*");
            }
            int space = 2*(N-i);
            for( int j= space; j>=1; j--){
                System.out.print(" ");
            }
            for(int j =i; j>=1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// *          *
// **        **
// ***      ***
// ****    ****
// *****  *****
// ************
// ************
// *****  *****
// ****    ****
// ***      ***
// **        **
// *          *