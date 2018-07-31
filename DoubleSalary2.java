/*
E2. Write a program to calculate and display the amount a person would earn over a 
period of time if their salary is one penny for the first day, two pennies for the 
second day, and continues to double each day. The program should input the 
number of days worked. 
Note: these numbers can be very large. Experiment with trial and error to find the 
largest possible. Post this value in the discussion forum.
*/
import java.util.Scanner;
import java.text.DecimalFormat;

class DoubleSalary2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Double daysWorked, salary, i, result;
        DecimalFormat dollars = new DecimalFormat("#, ##0.00");

        System.out.println("How many days has this person worked?");
        daysWorked = input.nextDouble();

        System.out.println("What is this person's starting salary?");
        salary = input.nextDouble();
        i = 0.0; 
        result = salary * Math.pow(2, (i-1));

        for (i = 0.0 ; i < daysWorked; i++) {
            if (i != daysWorked) {
                result = result * 2;
            }
        }
        System.out.println("This person's earnings after working " + daysWorked + 
        " days is $" + dollars.format(result));       
    }
}
// 1000 days and 1000 starting salary max?