/*print this type star
 *               *
        *       *       *
*       *       *       *       *
        *       *       *
                *
 */


 import java.util.*;

 /**
  * pattern6
  */
 public class pattern7 {
 
     public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
         int n =scn.nextInt();
         int nst1= (n+1)/2;
         int nst2 = (n+1)/2;
         int nsp = 1;
         
         for(int i=1; i<=n; i++)
         {  
            //this is for star
            for(int j=1; j<=nst1; j++)
            {
                System.out.print("*\t");
            }
            //this is for space
            for(int k=1; k<=nsp; k++ )
            {
                System.out.print("\t");
            }
            for(int j=1; j<=nst2; j++)
            {
                System.out.print("*\t");
            } 
             if (i<=n/2) {
                 

                 nst1--;
                 nst2--;
                 nsp+=2;
                 
                 
             }
             else{
                nst1++;
                nst2++;
                nsp-=2;

             }
             System.out.println();
             
 
 
         }
     }
 }