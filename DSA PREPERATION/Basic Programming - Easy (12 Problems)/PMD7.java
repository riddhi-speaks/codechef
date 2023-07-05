import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases
        
        while (t-- > 0) {
            int X = scanner.nextInt();
            int M = scanner.nextInt();
            long Y = 0;
            int power = M % 4;
            
            if (power == 0 && M != 0)
                power = 4;
            
            while (X != 0) {
                int digit = (int) Math.pow(X % 10, power);
                digit = digit % 10;
                Y = Y * 10 + digit;
                X = X / 10;
            }
            
            if (Y % 7 == 0)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
