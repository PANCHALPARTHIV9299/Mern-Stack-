import java.util.*;
public class peri {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter legnth : ");
        int l = sc.nextInt();
        System.out.print("Enter width : ");
        int w = sc.nextInt();

        int Area = w * l ;
        int perimeter = 2 *(l+w);
        System.out.println("perimeter :"+perimeter);
        System.out.println("area and Area is : " + Area );
    }
}
// Enter legnth : 5
// Enter width : 4
// perimeter :18
// area and Area is : 20