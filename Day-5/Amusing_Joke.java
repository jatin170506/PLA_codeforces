import java.util.*;
 
public class Amusing_Joke{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String guest    = sc.nextLine();
        String host     = sc.nextLine();
        String pile     = sc.nextLine();
        String combined = guest + host;
        sc.close();
        
        if (pile.length() != combined.length()) {
            System.out.println("NO");
            return;
        }
 
        int[] count = new int[26];
 
        for (char c : combined.toCharArray())
            count[c - 'A']++;
 
        for (char c : pile.toCharArray())
            count[c - 'A']--;
 
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}