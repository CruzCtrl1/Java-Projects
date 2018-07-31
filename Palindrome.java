import java.util.Scanner;

class Palindrome{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String userInput;

        System.out.println("What word would you like to test?");
        userInput = input.nextLine();
        int start = 0;

        String inputCompact = userInput.replaceAll("\\s+", "");
        int size = inputCompact.length();
        int IndexMax= size-1;
        Boolean isPalindrome = true;

        for(start = 0; start<size; start++){
            Boolean comparison = inputCompact.charAt(start) == (inputCompact.charAt(IndexMax-start));
            
            if(comparison == false){   
                System.out.println("Your word is not a palindrome");
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome == true){
            System.out.println("Your word is a palindrome");
        }
    }
}
