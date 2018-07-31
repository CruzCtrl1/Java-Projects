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
 
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

 public class NewBalance{
     public static void main(String[] args){
        String input;
        double beginningBalance;
        double newCharges;
        double credits;
        double creditLimit;
        double remainingBalance;
        double difference;

        DecimalFormat dollars = new DecimalFormat("#,##0.00");

        input = JOptionPane.showInputDialog("What is your beginning balance?");
        beginningBalance = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("What is the total of your new charges?");
        newCharges = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("How many credits do you have?");
        credits = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("What is your credit limit?");
        creditLimit = Double.parseDouble(input);
        
        remainingBalance = beginningBalance + (newCharges-credits);

        if(remainingBalance>creditLimit){
            difference = remainingBalance - creditLimit;
            JOptionPane.showMessageDialog(null, "You still owe $" + dollars.format(difference));
        }
        else if(remainingBalance<creditLimit){
            JOptionPane.showMessageDialog(null, "You owed $" + dollars.format(remainingBalance) + " but your credit card covered the rest.");
        }
        else{
            JOptionPane.showMessageDialog(null, "No payment due");
        }

        System.exit(0);
     }
 }