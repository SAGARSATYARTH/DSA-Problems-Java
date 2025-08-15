// print all the substring which is palindrom
import java.util.Scanner;

public class PalindromicSubstring {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter string : ");
        String s=scn.nextLine();

        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String palindrome=s.substring(i, j);
                int st=0;
                int ed=palindrome.length()-1;
                boolean flag=true;
                while(st<=ed){

                    if(palindrome.charAt(st)==palindrome.charAt(ed)){
                        st++;
                        ed--;
                    }
                    else{
                        flag=false;
                        break;
                    }
                }
                if(flag==true){
                    System.out.println(s.substring(i,j));
                }
            }
        }
    }
}
