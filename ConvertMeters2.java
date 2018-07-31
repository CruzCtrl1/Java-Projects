// This is the version that I am turning in.

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

public class ConvertMeters2{

    public static void main(String[] args){
    // This is the main method of the program. Once all the statements
    // have been run, the program terminates.
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a distance in meters");
        double meters = input.nextDouble();

        int selection = userChoice();
        
            switch (selection){
            case 1: 
                showKilometers(meters);
                System.out.println("Goodbye");
                break;
            
            case 2:
                showInches(meters);
                System.out.println("Goodbye");
                break;
            
            case 3:
                showFeet(meters);
                System.out.println("Goodbye");
                break;
            
            case 4:
                System.out.println("You opted to not convert your input. Goodbye.");
                break;
            }
    }

    public static int userChoice(){
        Scanner input = new Scanner(System.in);
        // Need to include this in every method or will not work
        // Cannot be outside of method due to "non-static variable cannot be
        // referenced from a static context"
        System.out.println("What would you like to convert your input to? Type:");
        System.out.println("1 for kilometers");
        System.out.println("2 for inches");
        System.out.println("3 for feet");
        System.out.println("4 to quit the program");
        int selection = input.nextInt();
        // Need to make sure to declare variables WITHIN the method.
        // If initialize variables outside of method, will produce error
        // because "non-static variable cannot be
        // referenced from a static context"
        return selection;
    }

    public static void showKilometers(double meters){
    // This method converts the input from meters to kilometers
    // Method needs to be void. If not and is a double method,
    // method then needs to return a double.
        double kilometers = meters * 0.001;
        System.out.println("Your input converted to kilometers is " + kilometers + " kilometers");
    }

    public static void showInches(double meters){
    // This method converts the input from meters to inches
        double inches = meters * 39.37;
        System.out.println("Your input converted to inches is " + inches + " inches");
    }

    public static void showFeet(double meters){
    // This method converts the input from meters to feet
        double feet = meters * 3.281;
        System.out.println("Your input converted to feet is " + feet + " feet");
    }
}
