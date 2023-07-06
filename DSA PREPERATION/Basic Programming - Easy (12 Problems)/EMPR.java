import java.util.*;
import java.math.BigDecimal;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String pp = sc.next();
            BigDecimal p = new BigDecimal(pp);
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            
            if (z == 0)
                p = p.subtract(p.multiply(new BigDecimal(x)).divide(new BigDecimal(100)));
            else if (z == 1)
                p = p.add(p.multiply(new BigDecimal(y)).divide(new BigDecimal(100)));
            
            System.out.println(p);
        }
    }
}
