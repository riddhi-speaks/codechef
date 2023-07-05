import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long x = sc.nextLong();
            long[] d = new long[n];
            d[0] = sc.nextLong();
            long cost = 0;

            if (d[0] == 1) {
                cost += x;
            }

            for (int i = 1; i < n; i++) {
                d[i] = sc.nextLong();
                if (d[i] == 0) {
                    cost += 0;
                } else {
                    cost += x;
                }
                if (d[i - 1] == 1 && d[i] == 0) {
                    cost += x;
                }
            }

            System.out.println(cost);
        }
    }
}
