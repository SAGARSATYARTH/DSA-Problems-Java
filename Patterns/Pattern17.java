import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=sc.nextInt();
        int sp=n/2,str=1;
        for(int i=1;i<=n;i++){
            for(int s=1;s<=sp;s++){
                if(i==n/2+1){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
                for(int j=1;j<=str;j++){
                    System.out.print("*\t");
                }
                if(i<=n/2){
                    str++;
                }else{
                    str--;
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
