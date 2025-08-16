// print all character of string in possible orders. 
import java.util.Scanner;

public class PermutationsString {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter String : ");
        String str=scn.nextLine();

        System.out.println("String : "+str);
        System.out.println("Parmutation String : ");
        solution(str);
        
        scn.close();
    }
    public static void solution(String str){
        int n=str.length();
        int fact=factotial(n);

        for(int i=0;i<fact;i++){
            int temp=i;
            StringBuilder sb=new StringBuilder(str);
            for(int div=n;div>=1;div--){
                int q=temp/div;
                int r=temp%div;
                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);

                temp=q;
            }
            System.out.println();
        }
    }

    public static int factotial(int n){
        int fact=1;
        for(int i=2;i<=n;i++){
            fact*=i;
        }

        return fact;
    }
}
