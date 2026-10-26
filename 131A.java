
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        if (s.equals(s.toUpperCase()))
            s = s.toLowerCase();
        else if (s.substring(1).equals(s.substring(1).toUpperCase()))
            s = Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();

        System.out.println(s);
    }
}
