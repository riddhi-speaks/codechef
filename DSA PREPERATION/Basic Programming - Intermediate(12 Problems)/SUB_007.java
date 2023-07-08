import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long ttc = scanner.nextLong();
        
        while (ttc-- > 0) {
            long n, zero, i, c;
            String s;
            zero = c = 0;
            
            s = scanner.next();
            n = s.length();
            
            for (i = 0; i < n; i++) {
                if (s.charAt((int)i) == '0')
                    zero++;
                
                if (zero == 2 && s.charAt((int)i) == '7')
                    c++;
                
                if (zero > 2 && s.charAt((int)i) == '7')
                    c = c + (zero * (zero - 1)) / 2;
            }
            
            System.out.println(c);
        }
        
        scanner.close();
    }
}
