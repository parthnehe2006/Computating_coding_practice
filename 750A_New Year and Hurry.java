import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int time = 220;
        int count = 0;

        for (int i = 1; i <= n; i++) {
            time -= 5 * i;
            if (time < 0) break;
            count++;
        }

        System.out.println(count);
    }
}