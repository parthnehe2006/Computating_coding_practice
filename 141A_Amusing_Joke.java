import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();

        char[] x = (a + b).toCharArray();
        char[] y = c.toCharArray();

        Arrays.sort(x);
        Arrays.sort(y);

        System.out.println(Arrays.equals(x, y) ? "YES" : "NO");
    }
}