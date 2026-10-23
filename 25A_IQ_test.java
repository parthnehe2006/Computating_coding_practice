
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int even = 0, odd = 0, evenPos = 0, oddPos = 0;

        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();

            if (x % 2 == 0) {
                even++;
                evenPos = i;
            } else {
                odd++;
                oddPos = i;
            }
        }

        System.out.println(even == 1 ? evenPos : oddPos);
        sc.close();
    }
}
