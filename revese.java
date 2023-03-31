import java.util.*;
/**
 * first
 */
public class revese {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int rev = 0;
        while (n>0) {
            rev = n%10;
            
            
            n = n/10;
            
            System.out.print(rev);
            
        } 
       
        
    }
}