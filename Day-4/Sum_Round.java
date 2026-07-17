import java.util.*;
public class Sum_Round{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            List<Integer> sum = new ArrayList<>();
 
            int place = 1;  
            while (n > 0) {
                int digit = n % 10;         
                if (digit != 0)
                    sum.add(digit * place);  
                n /= 10;                
                place *= 10;               
            }
 
            System.out.println(sum.size());
            for (int x : sum)
                System.out.print(x + " ");
            System.out.println();
        }
        sc.close();
    }
}