import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=sc.nextInt();
        int a=0,b=1,c=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                c=a+b;
                System.out.print(a+"\t");
                a=b;
                b=c;
            }
            System.out.println();
        }
    }
}
