/*          * * *   * * * 
 *          * *       * *
 *          *           *
 *          * *       * *
 *          * * *   * * *
 */
import java.util.Scanner;

public class Pattern6 {
  public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=sc.nextInt();

        int str=n/2+1;
        int sp=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=str;j++){
                System.out.print("*\t");
            }
            for(int s=1;s<=sp;s++){
                System.out.print("\t");
            }
            for(int j=1;j<=str;j++){
                System.out.print("*\t");
            }
            System.out.println();
            if(i<=n/2){
                str--;
                sp+=2;
            }else{
                str++;
                sp-=2;
            }
        }
        sc.close();
  }   
}
