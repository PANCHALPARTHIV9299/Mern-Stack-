public class pattern14 {
    public static void main (String []args){
        int num=6;
        for (int i=1; i<=num; i++){
            for (int s=1; s<=num-i; s++){
            System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
        }
    }    
}
//      1 
//     2 2
//    3 3 3
//   4 4 4 4
//  5 5 5 5 5
// 6 6 6 6 6 6