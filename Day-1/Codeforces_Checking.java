import java.util.*;
public class Codeforces_Checking{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String cf = "codeforces";
        int n = sc.nextInt();
        
        while(n-- > 0){
            char c = sc.next().charAt(0);
            if (cf.indexOf(c) != -1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}