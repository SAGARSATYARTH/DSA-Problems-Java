/* n=5

                 *
            *
        *
    *
*
 
*/
import java.util.Scanner;

public class Pattern8 {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=n;j>=n-i+1;j--){
                if(i+j==n+1){
                    System.out.print("*");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        sc.close();
      }
}
