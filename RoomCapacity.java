// Program: To determine if a meeting is legal or illegal based on room capacity and number of attendees
// Input: Room capacity and number of attendees
// Output: Legal or illegal, total meetings processed
// Written by: Chris Cruz
// Last modified: July 7, 2018

import java.util.Scanner;

public class RoomCapacity{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int roomCapacity, attendees, legal = 0, illegal = 0;

        System.out.println("This program will determine if you are in violation of fire law regulations.");
        System.out.println("What is maximum room capacity? Enter -1 when finished.");
        roomCapacity = input.nextInt();

        while (roomCapacity != -1) {
            System.out.println("How many people are attending the meeting?");
            attendees = input.nextInt();

            if(attendees > roomCapacity){
                System.out.println("This meeting is illegal and in violation of fire law regulations");
                System.out.println("In order for this meeting to be legal, you must exclude " + (attendees - roomCapacity) + " attendees");
                illegal += 1;
            }
            else{
                System.out.println("This meeting is legal");
                System.out.println("You can have an additional " + (roomCapacity - attendees) + " attendees join the meeting");
                legal += 1;

            }
            System.out.println("Enter the new room capacity to check. Otherwise, enter -1 to stop");
            roomCapacity = input.nextInt();
        }
        System.out.println("This program processed " + illegal + " illegal meetings and " + legal + " legal meetings");
    }
}

/*
Homework for unit 3A
5. Write a program that determines whether a meeting room is in violation of fire law regulations regarding the maximum room capacity. The program reads in the maximum room capacity and 
the number of people to attend the meeting. The program prints out either a message that the meeting is legal or a message that the meeting is illegal. Also display the number of people 
that need to be excluded or how many additional people can attend. Finally display the total number of legal and illegal meetings that were processed.
Use a sentinel to terminate the input. 
Use the following data to test your program in your submission: 
First run: 
40 40
40 25
40 45
-1
Second run:
-1
*/


/* Pseudocode:
        Enter room capacity;
        Enter number of attendees;
            Legal or illegal?
                if illegal, attendees - capacity;
                if legal, say it is Legal;
            
            continue? enter another room capacity to Continue;
                -1 for no
                    Display number of legal and illegal meetings processed;
*/

/*
Fun to do later on: 

Homework 3-A while loop: last record check with sentinels

Turn in the program listing and sample program output(s) including the input seqence given.
Do not use an 'if' to check for the sentinel, only the while loop. Do not use exit or break. Be sure to use a sentinel value and two read statements as shown in this section for this assignment or you will lose credit.

Choose one option from the following:

1. Write a program that inputs a series of exam scores as integers. The number of scores is not limited. Print the number of scores entered and the largest and smallest score entered. 
Use a sentinel to terminate the input. 
Use the following data to test your program in your submission: 
First run: 85 95 65 -1
Second run: 85 -1

 

2. One driver has kept track of several tankfuls of gasoline by recording miles driven and gallons used for each tankful. Write a program that will input the miles driven and gallons used as integers for each tankful. The program will calculate and display the miles per gallon for each tankful and print the combined miles per gallon for all tankfuls as doubles.
Use a sentinel to terminate the input.
Include the following sequences of input data in your submission.
First run:
300 30
400 20
350 35
-1
Second run:
-1

 

3. Write a program to determine gross pay for a company's employees. The company pays straight time for the first 40 hours and time-and-a-half for all hours worked in excess of 40. Use a constant to store the "40" hour break point. For each employee input the hours worked (as an integer) and rate (as a double). Display the total hours worked for all employees.
Use a sentinel to terminate the input. 
Include the following sequences of input data in your submission. 
First run:
40 8.50
35 15.00
45 40.00
-1
Second run:
-1

 

4. Workers at Acme have won a 7.6% pay increase retroactive for six months. Write a program that inputs an employee's annual salary and prints the amount of retroactive pay, the new annual salary, and new monthly salary. Use a constant to express the pay increase. Also display the total increases paid to all employees.
Use a sentinel to terminate the input. 
Use the following data to test your program in your submission: 
First run: 40000 25000 100000 -1
Second run: -1

 

5. Write a program that determines whether a meeting room is in violation of fire law regulations regarding the maximum room capacity. The program reads in the maximum room capacity and the number of people to attend the meeting. The program prints out either a message that the meeting is legal or a message that the meeting is illegal. Also display the number of people that need to be excluded or how many additional people can attend. Finally display the total number of legal and illegal meetings that were processed.
Use a sentinel to terminate the input. 
Use the following data to test your program in your submission: 
First run: 
40 40
40 25
40 45
-1
Second run:
-1

 

6. A large company pays its sales people on commission. The salespeople receive $200 per week plus 9% of their gross sales for the week. For example a salesperson who sold $5000 in a week receives 200 + 9% of 5000 or $650. Write a program that inputs a salesperson’s items sold for last week and prints that salesperson’s earnings. Use constants to store the 200 and 9%. Display the total commission for all salespersons after the inputs have been processed.
Use a sentinel to terminate the input. 
Include the following sequences of input data in your submission. 
First run:
1000.99
3129.75
99.95
350.89
-1
Second run:
-1

 

7. Write a program that inputs: current population, yearly birth rate and death rate. Make the birth rate and death rate doubles. The program will calculate the new population for each year until the population doubles the current population, if the birth rate is higher than the death rate. If the birth rate is lower than the death rate, then calculate the new population for each year until it hits 0.
Printout the number of years (the number of interations) it takes to double the population or hit 0.
Run the program for a population of 6,500,400,321 with a birth rate of .012 and death rate of .011
Make up data for a second run.
Allow the user to repeat the calculation as often as the user wishes.

*/