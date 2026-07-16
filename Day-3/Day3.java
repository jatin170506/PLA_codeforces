import java.util.*;
public class Day3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int x = sc.nextInt();
            if (x == 1) {
                System.out.println("HARD");
                sc.close();
                return;
            }
        }
 
        System.out.println("EASY");
        sc.close();
    }
}