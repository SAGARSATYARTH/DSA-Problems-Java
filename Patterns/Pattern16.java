/*

1                                               1
1       2                               2       1
1       2       3               3       2       1
1       2       3       4       3       2       1

 */
import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=sc.nextInt();

        int sp=2*n-3,sj=0;;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"\t");
                sj=j;
            }
            for(int s=1;s<=sp;s++){
                System.out.print("\t");
            }
            if(i==n){
                sj--;
            }
            for(int j=sj;j>=1;j--){
                System.out.print(j+"\t");
            }
            sp-=2;
            
            System.out.println();
        }
    }
    
}
