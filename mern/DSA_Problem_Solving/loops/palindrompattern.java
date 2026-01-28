public class palindrompattern {
    public static void main(String[]args){
        int num=6;
        for (int i=1; i<=num; i++){
            for(int s=1; s<=num-i; s++){
                System.out.print( " ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j);
                
            }
            for(int j=2; j<=i; j++){
                System.out.print(j);
                
            }
            System.out.println();
        }
    }
}