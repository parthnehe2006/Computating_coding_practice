
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean[] prime = new boolean[1000001];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;

        for (int i = 2; i * i <= 1000000; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= 1000000; j += i)
                    prime[j] = false;
            }
        }

        StringBuilder out = new StringBuilder();

        while (n-- > 0) {
            long x = sc.nextLong();
            long r = (long) Math.sqrt(x);

            if (r * r == x && prime[(int) r])
                out.append("YES\n");
            else
                out.append("NO\n");
        }

        System.out.print(out);
    }
}
