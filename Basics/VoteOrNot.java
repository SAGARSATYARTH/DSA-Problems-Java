 // Check who can vote..
 // condition 1: if the age less than 18 - can't vote,print message you are not eligible 
 //condition 2: if the age is greater than 90- they are also can not vote ,print message your are not eligible
 // condition 3: age between 18 t0 90 - can vote ,print message Thank You for selecting deserving candidate.

 public class VoteOrNot{
    public static void main(String[] args) {
        // int age=98;
        // int age=15;
        int age=65;
        if(age<18){
            System.out.println("You can not vote.\nYou are not eligible to vote."); // \n is used for nextLine
        }
        else if(age>90){ // else if is used when you have to check more than one condition
            System.out.println("You are not eligible to vote.\n");
        }
        else{ // if both the conditon in not true than it will print
            System.out.println("Thank You for a selecting deseving candidate.");
        }
    }
 }
