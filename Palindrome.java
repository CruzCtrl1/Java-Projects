import java.util.Scanner;

class Palindrome{

    public void reverseString(String input){

    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String userInput;

        System.out.println("What word would you like to check?");
        userInput = input.nextLine();


        String reversedInput = new StringBuffer(userInput).reverse().toString();

        if (userInput.equals(reversedInput)){
            System.out.println("Your word is a palindrome");
        }else{
            System.out.println("Your word is not a palindrome");
        }
    }
}