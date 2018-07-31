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
