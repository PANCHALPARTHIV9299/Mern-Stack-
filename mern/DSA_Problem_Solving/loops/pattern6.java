public class pattern6 {
    public static void main(String aargs[]){
        int C =4;
        int R = 5;
        for (int i=1; i<=C;i++){
            for (int j=1; j<=R; j++){
                if (i == 1 || j==1 || j==R || i==C){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }

            System.out.println();
        }

    }
}

//  *  *  *  *  * 
//  *           * 
//  *           * 
//  *  *  *  *  * 