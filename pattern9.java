/*
 * print this type of pattern
                               *
                        *        
                *
        *
*
  */
 



  import java.util.*;
  /**
   * first
   */
  /**
   * pattern1
   */
  public class pattern9 {
  
      public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          int n = scn.nextInt();
          
          int nsp = n-1;
          for(int i =1; i<=n; i++)
          { //this is a loop for spaces
            for(int j=1; j<=nsp; j++)
            {
              System.out.print("\t");
            }
            System.out.println("*\t");
           
            nsp--;
           
            
            
             
          }
      }
  }