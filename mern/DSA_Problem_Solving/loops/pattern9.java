public class pattern9 {
    public static void main (String []args){
        int m = 6;
        for (int i=1; i<=m; i++){
            for(int j =1; j<=m-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
// 123456
// 12345
// 1234
// 123
// 12
// 1