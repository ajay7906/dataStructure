/*print this type pattern
 *           *
        *               *
*                               *
        *               *
                *
 */








import java.util.*;
/**
 * pattern13
 */
public class pattern13 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nsp1 = n/2;
        int nsp2= -1;
        for(int i =1; i<=n; i++)
        {
            //this is for spcae 1
            for(int j =1; j<=nsp1; j++)
            {
                System.out.print("\t");
            }
            System.out.print("*\t");
            //this is for space 2
            for(int j =1; j<=nsp2; j++)
            {
                System.out.print("\t");

            }
            if(i!=1 && i!=n)
            {
                System.out.print("*\t");
            }
            if(i<=n/2)
            {
                nsp1--;
                nsp2+=2;
            }
            else{
                nsp1++;
                nsp2-=2;
            }
            System.out.println();

        }
    }
}