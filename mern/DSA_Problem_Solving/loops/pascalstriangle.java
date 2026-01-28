public class pascalstriangle {
    public static void main (String args[]){
        int n=5;
        int num = 1;
        for (int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            num = 1;
            for(int k=0; k<=i; k++){
                System.out.print(num +" ");
                num = num * (i-k)/(k+1);
            }
           System.out.println();
        }
    }
}
//      1 
//     1 1
//    1 2 1
//   1 3 3 1
//  1 4 6 4 1