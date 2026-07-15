import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        
        for(int i = 0; i < n; i++){
            String word = sc.next();
            int t = word.length();
            if(t > 10){
                System.out.println(""+word.charAt(0)+ (t - 2) +word.charAt(t - 1));
            }
            else{
                System.out.println(word);
            }
            
        }


        sc.close();
    }
}