
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        long time = 0;
        int current = 1;

        for (int i = 0; i < m; i++) {
            int house = sc.nextInt();

            if (house >= current) {
                time += house - current;
            } else {
                time += n - current + house;
            }

            current = house;
        }

        System.out.println(time);
    }
}
