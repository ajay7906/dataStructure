import java.util.*;
/**
 * pattern6
 */
public class pattern6 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int nst= 1;
        int nsp = 2;
        
        for(int i=1; i<=n; i++)
        {
            if (i<=n/2) {
                //this is for space
                for(int j=1; j<=nsp; j++)
                {
                    System.out.print("\t");
                }
                //this is for space
                for(int k=1; k<=nst; k++ )
                {
                    System.out.print("*\t");
                }
                nst=nst+2;
                nsp=nsp-1;
                System.out.println();
                
            }
            else{
                 //this is for space
                for(int j=1; j<=nsp; j++)
                {
                    System.out.print("\t");
                }
                //this is for space
                for(int k=1; k<=nst; k++ )
                {
                    System.out.print("*\t");
                }
                nst= nst-2;
                nsp=nsp+1;
                System.out.println();
            }


        }
    }
}