 /*
  * 
  print this type of pattern
                                *
                        *       *
                *       *       *
        *       *       *       *
*       *       *       *       *

  */



  import java.util.*;
  /**
   * first
   */
  /**
   * pattern1
   */
  public class pattern4 {
  
      public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          int n = scn.nextInt();
          int nst=1;
          int nsp = n-1;
          for(int i =0; i<=n; i++)
          { //this is a loop for spaces
            for(int j=0; j<=nsp; j++)
            {
              System.out.print("\t");
            }
            for(int k=1; k<=nst; k++)
            {
              System.out.print("*\t");
            }
            nsp--;
            nst++;
            
            System.out.println();
             
          }
      }
  }