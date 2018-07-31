/*
To Practice and Explore: for loops Practice and Explore exercises are not assignments and will not be evaluated or graded. By doing these exercises you will more easily be able to 
answer related test questions. Post your solution in the discussion forum, if not already posted.

P1. Write a for loop that displays the even numbers from 2 to hiValue. For example if hiValue is 8, the loop displays: 2 4 6 8

P2. Write a for loop that displays the distance traveled for each hour (distance = speed * time) given the speed and the numberHours traveled. For example, 
if speed is 40 mph, and numberHours is 3 hours, the loop displays: 1 40 2 80 3 120 

P3. Write a for loop to display the population sizes of an organism for each 
day using the initial population size (beginPop), their average daily increase(dailyInc), and the number of days (numDays) they will multiply (pop = beginPop + dailyInc * days). 
The program will display the size of the population for each day.

P4. Write a for loop that uses a lower bound temperature (loTemp), an upper bound temperature (hiTemp) and a temperature increment (tempInc), to displays a table of Centigrade 
and Fahrenheit equivalents using F = 9/5C + 32, from the lower bound temperature to the upper bound temperature using the increment. The following are programming experiments:

E1. Write a program to produce the factorial of the number. The factorial of a number n is equal to the product of all numbers up to the number n. (i.e. the factorial of 4 = (1)*(2)*(3)*(4) = 24. 
The program should input the number n and output the factorial of that number. Note: these numbers can be very large. Experiment with trial and error to find the largest integer 
possible. Post this value in the discussion forum.

E2. Write a program to calculate and display the amount a person would earn over a period of time if their salary is one penny for the first day, two pennies for the second day, 
and continues to double each day. The program should input the number of days worked. Note: these numbers can be very large. Experiment with trial and error to find the largest 
possible. Post this value in the discussion forum.
*/
import java.util.Scanner;

public class EvenNum{
    public static void main(String[] args){
        int hiValue;
        int i;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the highest positive integer in the loop: ");
        hiValue = input.nextInt();

        for(i = 2; i <= hiValue; i += 2){
            System.out.println(i + " is part of the loop");
        }
    }
}
//This is for P1