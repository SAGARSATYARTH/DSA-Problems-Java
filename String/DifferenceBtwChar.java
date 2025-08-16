// String with ASCII difference of characters.

import java.util.Scanner;

public class DifferenceBtwChar {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter String : ");
        String str=scn.nextLine();

        System.out.println("String : "+str);
        System.out.println(solution(str));
        
        scn.close();

    }    
    public static String solution(String str){
        StringBuilder sb=new StringBuilder();
        sb.append(str.charAt(0));
        for(int i=1;i<str.length();i++){
            int diff=str.charAt(i)-str.charAt(i-1);
            sb.append(diff);
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
