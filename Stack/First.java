import java.util.*;
public class First {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();

        s.push(23);
        System.out.println(s.peek());
        s.push(34);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());

        s.push(45);
        s.push(45);
        s.push(45);
        s.push(45);
        s.push(45);
        System.out.println(s);
    }
    
}
