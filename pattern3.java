 /*
  * 
  print this type of pattern
*       *       *       *       *
*       *       *       *
*       *       *
*       *
*

  */



  import java.util.*;
  /**
   * first
   */
  /**
   * pattern1
   */
  public class pattern3 {
  
      public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          int n = scn.nextInt();
          int nst=n;
          for(int i =0; i<=n; i++)
          {
            for(int j=1; j<=nst; j++)
            {
              System.out.print("*\t");
            }
            nst--;
            System.out.println();
             
          }
      }
  }