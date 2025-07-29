// Print all prime numbers between given range..
import java.util.*;
public class PrimeInRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int low,high;
        System.out.println("Enter low : ");
        low=sc.nextInt();
        System.out.println("Enter high : ");
        high=sc.nextInt();

        int count;
        for(int i=low;i<=high;i++){
            count=0;
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                count++;
                break;
                }
                
            }
            System.out.println(count==0?i+" is prime":i+" is not prime");
        }

    }
}
