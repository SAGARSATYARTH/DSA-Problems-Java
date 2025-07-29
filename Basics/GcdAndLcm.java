// find GCD and LCM 
import java.util.*;
public class GcdAndLcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a : ");
        int a=sc.nextInt(); 
        System.out.print("Enter b : ");
        int b=sc.nextInt(); 

        int oa=a;// oa store original value of a
        int ob=b;// ob store original value of b
        while(a%b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        int gcd=b;
        System.out.println("GCD : "+gcd);
        System.out.println("LCM : "+ (oa*ob)/gcd);
    }

    
}