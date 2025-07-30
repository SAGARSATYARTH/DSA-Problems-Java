// You are required to check if a given set of number is a valid pythagorean triplet.
import java.util.*;
public class PythagoreanTriplets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a b and c :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        boolean flag;
        if(a>b && a>c){
            flag=((b*b+c*c)==(a*a));
        }else if(b>c){
            flag=((a*a+c*c)==(b*b));
        }else{
            flag=((a*a+b*b)==(c*c));
        }
        System.out.println(flag);

    }
}
