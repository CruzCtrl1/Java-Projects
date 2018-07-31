/*
17. Write a program that asks the user to enter a distance in meters as a double. The program than presents the user with the following menu of selections:
1    Convert to kilometers      
2    Convert to inches     
3    Convert to feet      
4    Quit the program 

After inputting the users response to the menu, the  program uses the following methods to display the response:      
showKilometers that uses the formula:           
    kilometers = meters * 0.001      
showInches that uses the formula:                     
    inches = meters * 39.37      
showFeet that uses the formula:                          
    feet = meters * 3.281
*/
import java.util.Scanner;

public class ConvertMeters{

    Scanner input = new Scanner(System.in);     //sets up the Scanner object

    public static void main(String[] args){
    // This is the main method of the program. Once all the statements
    // have been run, the program terminates.
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a distance in meters");
        double meters = input.nextDouble();

        //double meters = welcomeDialog();
        int selection = userChoice();
        if(selection == 1){
        showKilometers(meters);
        goodbye();
        // I didn't include break before. Problem was, it just kept repeating my option and didn't
        // do any other methods when I changed the selection
        }
        if(selection == 2){
        showInches(meters);
        goodbye();
        }
        if(selection == 3){
        showFeet(meters);
        }
        if(selection == 4){
            noConvert();
        }   
    }

    /*
    public static void welcomeDialog(){
    // This method is first ran to receive the user's input for meters
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a distance in meters");
        double meters = input.nextDouble();

    }
*/
    public static int userChoice(){
        Scanner input = new Scanner(System.in);
        // Need to include this in every method or will not work
        // Cannot be outside of method due to "non-static variable cannot be
        // referenced from a static context"
        System.out.println("What would you like to convert your input to? Type:");
        System.out.print("1 for kilometers, 2 for inches, ");
        System.out.println("3 for feet, or 4 to quit the program");
        int selection = input.nextInt();
        // Need to make sure to declare variables WITHIN the method.
        // If initialize variables outside of method, will produce error
        // Also because "non-static variable cannot be
        // referenced from a static context"
        return selection;
    }

    /*
    public static int userChoiceCont(){
        Scanner input = new Scanner(System.in);
        // Need to include this in every method or will not work
        // Cannot be outside of method due to "non-static variable cannot be
        // referenced from a static context"
        System.out.println("Would you like to continue converting? Type:");
        System.out.print("1 for kilometers, 2 for inches, ");
        System.out.println("3 for feet, or 4 to quit the program");
        int selection = input.nextInt();
        // Need to make sure to declare variables WITHIN the method.
        // If initialize variables outside of method, will produce error
        // Also because "non-static variable cannot be
        // referenced from a static context"
        return selection;
    }
    */

    public static void showKilometers(double meters){
    // This method converts the input from meters to kilometers
    // Method needs to be void. If not and is a double method,
    // method then needs to return a double.
        double kilometers = meters * 0.001;
        System.out.println("Your input in kilometers is " + kilometers + " kilometers");
        //userChoiceCont();
    }

    public static void showInches(double meters){
    // This method converts the input from meters to inches
        double inches = meters * 39.37;
        System.out.println("Your input in inches is " + inches + " inches");
        //userChoiceCont();
    }

    public static void showFeet(double meters){
    // This method converts the input from meters to feet
        double feet = meters * 3.281;
        System.out.println("Your input in feet is " + feet + " feet");
        //userChoiceCont();

    }

    public static void goodbye(){
        System.out.println("Goodbye");
    }

    public static void noConvert(){
        System.out.println("You opted to not convert your input. Goodbye.");
    }
}
