 /*
The NewBalance program, but without the JOptionPane
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
