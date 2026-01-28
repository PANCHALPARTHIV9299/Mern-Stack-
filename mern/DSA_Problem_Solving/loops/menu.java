import java.util.*;
public class menu {
    public static void main(String [] args){
        try (Scanner sc = new Scanner(System.in)) {
            int a;
            do {
                int marks=sc.nextInt();
                if (marks >=90 ){
                    System.out.println("Excellent");
                }else if (marks <= 89 && marks >= 60){
                    System.out.println("good");
                }else if (marks <= 59 && marks >= 33){
                    System.out.println("PASS");
                }else {
                    System.out.println("fail, but good well try");
                }
                System.out.println("Do you want to continue? Press 1 for yes and 0 for no");
                a = sc.nextInt();
            }while (a == 1);
        }
    }
}
