import java.util.Scanner;

public class CalculatePower {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter x : ");
        int x=scn.nextInt();
        System.out.print("Enter n : ");
        int n=scn.nextInt();
        
        System.out.println("answer : "+power(x, n));

        scn.close();

    }
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        // int xnm1=power(x, n-1);
        // int xn=x*xnm1;

        return x*power(x, n-1);
    }
    
}
