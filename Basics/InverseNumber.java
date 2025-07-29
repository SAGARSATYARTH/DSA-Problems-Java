// Inverse of a number 
// if a number is 15234 then the inverse is 41235
// 
import java.util.*;
public class InverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number : ");
        int num=sc.nextInt();
        int count=0;
        int inverse=0;
        while(num!=0){
            int rem=num%10;
            count++;
            inverse=inverse+(count*(int)Math.pow(10, rem-1));
            num=num/10;
        }
        System.out.println(inverse);
    }
}
