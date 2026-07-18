import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        
        int[] scores = new int[n];
        
        
        
        for(int i=0; i<n; i++){
            scores[i] = sc.nextInt();
        }
        
        int cutoff = scores[k-1];
        int count = 0;
        
        for(int i=0; i<n; i++){
            
            if(scores[i]>0 && scores[i]>=cutoff){
                count++;
            }
            
        }
        wSystem.out.println(count);
        sc.close();
    }
    
}