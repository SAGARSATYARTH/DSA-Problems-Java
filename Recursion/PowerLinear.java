// print x raised to the power n.
import java.util.*;
public class PowerLinear {
    
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter x : ");
        int x=scn.nextInt();
        System.out.print("Enter n : ");
        int n=scn.nextInt();

        System.out.println("Answer : "+powerLinear(x, n));

    }
    public static int powerLinear(int x,int n){
        if(n==0){
            return 1;
        }
        int xnm1=powerLinear(x, n-1);
        int rv=x*xnm1;
        return rv;
    }
}
