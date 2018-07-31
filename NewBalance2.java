 /*
 Write a program to determine if the new balance exceeds the credit limit. 
 Input the beginning balance, new charges, credits and credit limit. Display a message if the new 
 balance exceed the credit limit. Display the new balance by adding the beginning balance to the difference between the 
 new charges and credits. If the new balance is zero then display: "No Payment Due". Produce three runs 
 where the new balance exceeds, equals and is less than the credit limit.
 */

 // Purpose: To see if the new balance exceeds the credit limit
 // Input: Beginning balance, new charges, credits, and credit limit
 // Output: If money is owed or not.
 // Written by: Chris Cruz
 // Date modified: July 1, 2018
 
import java.util.Scanner;
import java.text.DecimalFormat;

 public class NewBalance2{
     public static void main(String[] args){
        double beginningBalance;
        double newCharges;
        double credits;
        double creditLimit;
        double remainingBalance;
        double difference;

        DecimalFormat dollars = new DecimalFormat("#,##0.00");
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("What is your beginning balance?");
        beginningBalance = keyboard.nextDouble();

        System.out.println("What is the total of your new charges?");
        newCharges = keyboard.nextDouble();
        
        System.out.println("How many credits do you have?");
        credits = keyboard.nextDouble();

        System.out.println("What is your credit limit?");
        creditLimit = keyboard.nextDouble();
        
        remainingBalance = beginningBalance + (newCharges-credits);

        if(remainingBalance>creditLimit){
            difference = remainingBalance - creditLimit;
            System.out.println("You still owe $" + dollars.format(difference));
        }
        else if(remainingBalance<creditLimit){
            System.out.println("You owed $" + dollars.format(remainingBalance) + " but your credit card covered the rest.");
        }
        else{
            System.out.println("No payment due");
        }
     }
 }