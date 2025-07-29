// Print all prime factorization of a number
import java.util.*;
public class PrimeFactor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num=sc.nextInt();

        for(int div=2;div*div<=num;div++){
            while(num%div==0){
                System.out.print(div+" ");
                num=num/div;
            }
        }
        if(num!=1){
            System.out.print(num);
        }
        sc.close();

    }
    
}
