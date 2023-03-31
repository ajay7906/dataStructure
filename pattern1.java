 /*
  * 
  print this type of pattern
  * * * * *
  * * * * *
  * * * * *

  */



import java.util.*;
/**
 * first
 */
/**
 * pattern1
 */
public class pattern1 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i =0; i<=n; i++)
        {
          for(int j=1; j<=n; j++)
          {
            System.out.print("*\t");
          }
          System.out.println();
           
        }
    }
}