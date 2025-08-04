/* n=5
5 5 5 5 5 5 5 5 
4 4 4 4 4 4 4 5 
4 3 3 3 3 3 4 5 
4 3 2 2 2 3 4 5 
4 3 2 1 2 3 4 5 
4 3 2 2 2 3 4 5 
4 3 3 3 3 3 4 5 
4 4 4 4 4 4 4 5 
5 5 5 5 5 5 5 5 
*/

import java.util.*;
public class Pattern21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=sc.nextInt();
        int size=2*n-1;

        
        for (int i = 0; i <size; i++) {
            for (int j = 1; j < size; j++) {
                
                int top = i;
                int left = j;
                int bottom = size - 1 - i;
                int right = size - 1 - j;

                
                int min1, min2, min;
                if (top < bottom)
                    min1 = top;
                else
                    min1 = bottom;

                if (left < right)
                    min2 = left;
                else
                    min2 = right;

                if (min1 < min2)
                    min = min1;
                else
                    min = min2;

                int value = n - min;

                System.out.print(value + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
