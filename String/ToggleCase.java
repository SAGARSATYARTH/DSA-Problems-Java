// Toggle the char in string uppercase to lower and vice-versa
import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter string : ");
        String str=scn.nextLine();

        System.out.println("String : "+str);
        System.out.println("Toggled String : "+toggleCase(str));

        scn.close();
    }

    public static String toggleCase(String str){
        StringBuilder sb=new StringBuilder(str);

        for(int i=0;i<sb.length();i++){
            char val=sb.charAt(i);

            if(val>='a' && val<='z'){
                char uc=(char)('A'+(val-'a'));
            sb.setCharAt(i, uc);

            }
            else{
                char lc=(char)('a'+(val-'A'));
                sb.setCharAt(i, lc);
            }
        }
        return sb.toString();
    }
    
}
