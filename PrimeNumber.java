//Write a function that takes a number and returns true if it is a prime number
//Inputs: Number being checked
//Outputs: Prime number or not
// Written by: Chris Cruz
// Last modified: 21 June 2018
import java.util.Scanner;

public class PrimeNumber{
    public static void main(String[] args){
        Scanner user = new Scanner(System.in);
        int input;
        System.out.println("Enter a number to check:");
        input = user.nextInt();
        int start;
        int remainder = 0;
        Boolean isPrime = true;

        for(start = 2; start<input;start++){
            int result = input%start;
            Boolean check = result!=remainder;

            if(check==false){
                System.out.println("Your number is not a prime number");
                isPrime = false;
                break;
            }
        }
        if (isPrime == true){
            System.out.println("Your number is a prime number");
        }

        //Program works
        
            /*

            if(result==remainder){
                System.out.println("Your input is divisible by " + start + " and proves your input is not a prime number");
            }else{
                System.out.println("Your input is divisible by " + start + " proves your input is a prime number");
            }
            
            */

    }
}

/*
Pseudo Code:
A prime number is a number that can only be divided by 1 and by itself. 
To determine this, I should use an for loop loop. Start at an index = 2. (if
I start at 1, it will be true)
Go up in increments of one until I get to the specified number.
If it is a prime number, then only 1 and itself should divide into the number
*/

// If the remainder = 0, then the dividend divides precisely into the input.

//If the remainder=0 when input/input, then it is a prime number. Anything
// in between, then it is not a prime number