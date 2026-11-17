
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        int q = sc.nextInt();

        while (q-- > 0) {
            int x = sc.nextInt();

            int l = 0, r = n - 1;
            int ans = 0;

            while (l <= r) {
                int mid = l + (r - l) / 2;

                if (a[mid] <= x) {
                    ans = mid + 1;
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
