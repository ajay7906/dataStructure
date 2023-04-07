/*
 * print this type of pattern
    *                               *
        *               *
                *
        *               *
*                               *
  */
 



  import java.util.*;
  /**
   * first
   */
  /**
   * pattern1
   */
  public class pattern12 {
  
      public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          int n = scn.nextInt();
          
          
          for(int i =1; i<=n; i++)
          { //this is a loop for spaces
            for(int j=1; j<=n; j++)
            {
              if(i==j || i+j==n+1){
                System.out.print("*\t");
              }
              
             

             
              else{
                System.out.print("\t");
               
              }
              
             
            }
            System.out.println();
           
           
            
            
             
          }
      }
  }