/* n=5

                1
        2       3       2
3       4       5       4       3     
        2       3       2
                1

 */

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=sc.nextInt();

        int sp=n/2,str=1,pt=1;
        for(int i=1;i<=n;i++){
            for(int s=1;s<=sp;s++){
                System.out.print("\t");
            }int pt2=pt;
            for(int j=1;j<=str;j++){
                System.out.print(pt2+"\t");
                if(j<=str/2){
                    pt2++;
                }else{
                    pt2--;
                }
            }
            if(i<=n/2){
                pt++;
                sp--;
                str+=2;
            }else{
                pt--;
                sp++;
                str-=2;
            }
            System.out.println();
        }

        sc.close();
    }
    
}
