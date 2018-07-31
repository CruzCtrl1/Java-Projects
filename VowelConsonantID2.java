/*
C. Write a program to input two strings. Display the number of consonants in the first string and the number of vowels (a,e,i,o,u,y) 
in the 2nd string. Use at least two methods, one called numberVowels and the other calledstringCapitalize. Display the two strings 
in alphabetic order with the first letter of each capitalized. For example if the user inputs: tax service, the program outputs: Service has 
3 vowels Tax has 2 consonants
*/


import java.util.Scanner;

class VowelConsonantID2
{
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter two strings, separated by a space");
        String input = stdin.nextLine();

        if (input.contains(" ")) 
        {
            input = input.toLowerCase();
            String string1 = input.substring(0,input.indexOf(" "));
                // The substring method extracts string 1 starting from the first
                // index to the last specified index
                    // This isolates the first string and stores it into string1
            String string2 = input.substring(input.indexOf(" ") + 1, input.length());
                // This extraction of string 2 starts one index after the space
                // so only the string is received for string2
            int numOfvowels1 = numberVowels(string1);
            int numOfvowels2 = numberVowels(string2);
            int numOfconsonants1 = numberConsonants(string1);
            int numOfconsonants2 = numberConsonants(string2);
            String string1Capital = stringCapitalized(string1);
            String string2Capital = stringCapitalized(string2);
            int alphabetize = string1Capital.compareTo(string2Capital);
            // Because each character has an address and value, if string1 is before string2,
            // this will yield a negative number to be stored in alphabetize

            if (alphabetize < 0)
            {
                System.out.print("Your first string " + string1Capital + " has " + numOfvowels1 + " vowels, ");
                System.out.println("and your second string " + string2Capital + " has " + numOfvowels2 + " vowels.");
    
                System.out.print("Your first string " + string1Capital + " has " + numOfconsonants1 + " consonants, ");
                System.out.println("and your second string " + string2Capital + " has " + numOfconsonants2 + " consonants.");
            }
            else
            {
                System.out.print("Your first string " + string2Capital + " has " + numOfvowels2 + " vowels, ");
                System.out.println("and your second string " + string1Capital + " has " + numOfvowels1 + " vowels.");
    
                System.out.print("Your first string " + string2Capital + " has " + numOfconsonants2 + " consonants, ");
                System.out.println("and your second string " + string1Capital + " has " + numOfconsonants1 + " consonants.");   
            }

        } 
        
        else
        {
            System.out.println("You did not input two strings");
        }
    }

// This for loop checks every single letter in the string. Can't stop till all words in the string are checked.

    public static int numberVowels(String input)
    {
        int numOfvowels = 0;
        int stringLength = input.length();

        for (int i = 0; i < stringLength ; i++)
        {
            if(input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i'
            || input.charAt(i) == 'o' || input.charAt(i) == 'u')
            // This checks for any vowel at each index of the string and adds 1 to the count in
            // numOfvowels
            {
                numOfvowels++;
            }
        }
        return numOfvowels;
    }

    public static int numberConsonants(String input)
    {
        int numOfcons = 0;
        int stringLength = input.length();

        for (int i = 0; i < stringLength ; i++)
        {
            if(input.charAt(i) != 'a' && input.charAt(i) != 'e' && input.charAt(i) != 'i'
            && input.charAt(i) != 'o' && input.charAt(i) != 'u')
            // This checks for consonants at each index of the string and adds 1 to the count of
            // numOfcons.
            {
                numOfcons++;
            }
        }
        return numOfcons;
    }

    public static String stringCapitalized(String stringLowercase)
    {
        String uppercaseString = stringLowercase.substring(0,1).toUpperCase() +
        stringLowercase.substring(1).toLowerCase();
        // This capitalizes the first letter in the string (from index 0 to 1), 
        // and lowercases all the other letters after index 1

        return uppercaseString;
    }

}