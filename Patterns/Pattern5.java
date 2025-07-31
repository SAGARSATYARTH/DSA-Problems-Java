/*          *
 *        * * *
 *      * * * * *
 *        * * *
 *          *
 */
import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=sc.nextInt();

        int str=1;
        int sp=n/2;
        for(int i=1;i<=n;i++){
            for(int s=1;s<=sp;s++){
                System.out.print("\t");
            }
            for(int j=1;j<=str;j++){
                System.out.print("*\t");
            }
            System.out.println();
            if(i<=n/2){
                sp--;
                str+=2;
            }
            else{
                str-=2;
                sp++;
            }
        }
        sc.close();
    }
}
