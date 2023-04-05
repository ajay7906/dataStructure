/*
 * print this type of pattern
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
  public class pattern5 {
  
      public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          int n = scn.nextInt();
          int nst=n;
          int nsp = 0;
          for(int i =1; i<=n; i++)
          { //this is a loop for spaces
            for(int j=1; j<=nst; j++)
            {
              System.out.print("*\t");
            }
            for(int k=1; k<=nsp; k++)
            {
              System.out.print("\t");
            }
            nsp++;
            nst--;
            
            System.out.println();
             
          }
      }
  }