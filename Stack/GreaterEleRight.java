import java.util.Scanner;
import java.util.Stack;

public class GreaterEleRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number element in Araay : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements : ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("ELements of arrays : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "  ");
        }

        arr = nxtGtEleOnRight(arr);

        System.out.println("\nAfter :");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "  ");
        }

        sc.close();
    }

    public static int[] nxtGtEleOnRight(int arr[]) {

        int result[] = new int[arr.length];

        Stack<Integer> st = new Stack<>();

        st.push(arr[arr.length - 1]);
        result[arr.length - 1] = -1;

        for (int i = arr.length - 2; i >= 0; i--) {

            while (st.size() > 0 && arr[i] >= st.peek()) {
                st.pop();
            }
            if (st.size() == 0) {
                result[i] = -1;
            } else {
                result[i] = st.peek();
            }
            st.push(arr[i]);
        }

        return result;

    }

}
