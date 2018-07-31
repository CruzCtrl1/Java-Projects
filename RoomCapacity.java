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
