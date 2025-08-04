/* n=7

*       *       *       *       *       *       *
        *                               *
                *       *       *
                        *
                *       *       *
        *       *       *       *       *
*       *       *       *       *       *       *

 */
import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=sc.nextInt();

        int sp=0,str=n;
        for(int i=1;i<=n;i++){
            for(int s=1;s<=sp;s++){
                System.out.print("\t");
            }
            for(int j=1;j<=str;j++){
                if(i<n/2 && i>1 && j>1 && j<str){
                    System.out.print("\t");
                }else{
                    System.out.print("*\t");
                }
            }
            if(i<=n/2){
                str-=2;
                sp++;
            }else{
                str+=2;
                sp--;
            }
            System.out.println();
        }
        sc.close();
    }
    
}
