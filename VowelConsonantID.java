/*
C. Write a program to input two strings. Display the number of consonants in the first string and the number of vowels (a,e,i,o,u,y) 
in the 2nd string. Use at least two methods, one called numberVowels and the other calledstringCapitalize. Display the two strings 
in alphabetic order with the first letter of each capitalized. For example if the user inputs: tax service, the program outputs: Service has 
3 vowels Tax has 2 consonants
*/

// This program doesn't properly work and is the incorrect way to solve the problem

import java.util.Scanner;

class VowelConsonantID{
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter two strings, separated by a space");
        String input = stdin.nextLine();

        if (input.contains(" ")) {
            input = input.toLowerCase();
            int numOfvowels = numberVowels(input);
            System.out.println("Your word has " + numOfvowels + " vowels");
        } 
        
        else{
            System.out.println("You did not input two strings");
        }
    }

// use a for loop to check every single letter? But can't stop till all words in the string are checked.

    public static int numberVowels(String input){
        int numOfvowels = 0;
        int string1Length = input.length();

        for (int stringStart = 0; stringStart < string1Length ; stringStart++){
            if(input.contains("a")){
                numOfvowels += 1;

                //A break is not going to help you. You're using a loop but nothing has really changed about your code. 
                // You're still using the same method to count vowels  as before. But now you have the old answers * the string length. That is why you're getting 33
            }
            if(input.contains("e")){
                numOfvowels += 1;
            }
    
            if(input.contains("i")){
                numOfvowels += 1;
            }
    
            if(input.contains("o")){
                numOfvowels += 1;
            }
    
            if(input.contains("u")){
                numOfvowels += 1;
            }
            break;
        }
        return numOfvowels + 1;
    }
}