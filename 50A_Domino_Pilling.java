import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        
        int max_no = (m*n)/2;
        System.out.println(max_no);

        sc.close();
    }
}