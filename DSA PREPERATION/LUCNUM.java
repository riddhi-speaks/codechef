import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t != 0) {
            long a = sc.nextLong();
            int x = 0;
            
            while (a % 2 == 0) {
                a /= 2;
                x++;
            }
            
            if (x % 2 == 0)
                System.out.println("1");
            else
                System.out.println("0");
            
            t--;
        }
    }
}
