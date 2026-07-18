import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        int sum = 0;
        while(n-- > 0){
            String x = sc.nextLine();
            if(x.equals("Tetrahedron"))
                sum +=4;
            else if(x.equals("Cube"))
                sum +=6;
            else if(x.equals("Octahedron"))
                sum +=8;
            else if(x.equals("Dodecahedron"))
                sum +=12;
            else if(x.equals("Icosahedron"))
                sum +=20;
        }
        System.out.println(sum);
        sc.close();
    }
}