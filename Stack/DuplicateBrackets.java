import java.util.Scanner;
import java.util.Stack;

public class DuplicateBrackets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter : ");
        String str=sc.nextLine();
        
        Stack<Character> sC=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch == ')'){
                if(sC.peek()=='('){
                    System.out.println(true);
                    return;
                }
                else{
                    while(sC.peek()!='('){
                        sC.pop();
                    }
                    sC.pop();
                }
            }
            else{
                sC.push(ch);
            }
        }
        System.out.println(false);


    }
    
}
