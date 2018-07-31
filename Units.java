/* Write a program with a loop that lets the user enter a series of units taken for a student. Each number entered should be added to a total. The user should enter -1 to 
indicate the end of the series. After all the numbers have been entered, the program should display "Total units:" followed by the total number of units entered. 
*/

import java.util.Scanner;

class Units{
    public static void main(String[] args){
        int units = 0, total = 0, totalPlusOne;
        Scanner input = new Scanner(System.in);
        // Creates an object called input
        // to allow input from
        // the user

        while (units != -1){
        System.out.print("Enter the units of the class");
        System.out.print(" taken by the student.");
        System.out.println(" Enter -1 when finished.");

        units = input.nextInt();
        // the value from the user is stored into units
        total = total + units;
        // each input from the user is stored into total

        }
        totalPlusOne = total + 1;
        //Adding this because without this object, the result is always
        // 1 unit short
        System.out.println("Total units: " + totalPlusOne);
    }
}